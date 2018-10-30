#!/usr/bin/env groovy

import groovy.json.JsonSlurperClassic

def artifactoryDeploy(artifactoryPublishConfig,artfactoryServer,mavenBuild,mavenBuildConfig)
{
	//def artifactoryServer = Artifactory.server("artifactory")
	//def mavenBuild = Artifactory.newMavenBuild()
	env.MAVEN_HOME = "${tool 'maven'}"
	
	def artifactoryDeployMap = new JsonSlurperClassic().parseTest(artifactoryPublishConfig)
	
	def releaseLibRes = artifactoryDeployMap.releaseLibRes
	def snapshotRepo = artifactoryDeployMap.snapshotRepo
	def snapshotLibRes = artifactoryDeployMap.snapshotLibRes
	def releaseLibDep = artifactoryDeployMap.releaseLibDep
	def snapshotLibDep = artifactoryDeployMap.snapshotLibDep
	def pomFilename = artifactoryDeployMap.pomFilename
	def goalsVal = artifactoryDeployMap.goalsVal
	
	//mavenBuild.resolver server: artfactoryServer, releaseRepo: releaseLibRes, snapshotRepo: snapshotLibRes
	mavenBuild.deployer server: artfactoryServer, releaseRepo: releaseLibDep, snapshotRepo: snapshotLibDep
	def projectBuildInfo=mavenBuild.buildMaven(mavenBuild,mavenBuildConfig)
	artfactoryServer.publishBuildInfo projectBuildInfo	
}

def createMavenBuildInstance()
{
   def mavenBuild = Artifactory.newMavenBuild()
   return mavenBuild
}

def createArtifactoryInstance(artifactoryConfig)
{
	def artifactoryDeployMap = new JsonSlurperClassic().parseTest(artifactoryConfig)
	def artifactoryServer = Artifactory.server(artifactoryDeployMap.name)
	return artifactoryServer
}

def archiveArtifact(archiveConfig)
{
	def archiveMap = new JsonSlurperClassic().parseText(archiveConfig)
	def archiveSrc = archiveMap.archiveSrc
	archiveArtifacts artifacts: archiveSrc, fingerprint: true, OnlyIfSuccessful:true
}

def sendEmail(emailConfig)
{
	def emailMap = new JsonSlurperClassic().parseText(emailConfig)
	def subject = emailMap.subject
	def to = emailMap.to
	def body = emailMap.body
	def from = emailMap.from
	def mimeType = emailMap.mimeType
	
	emailext(
		subject:subject,
		to:to,
		body:body,
		from:from,
		mimeType:mimeType
		)
}
def buildMaven(mavenBuild,mavenBuildConfig)
{
	def mavenBuildMap = new JsonSlurperClassic().parseText(mavenBuildConfig)
	env.MAVEN_HOME = "${tool 'maven'}"
	def projectBuildInfo=mavenBuild.run pom: mavenBuildMap.pomFilename, goals:mavenBuildMap.goalsVal
}