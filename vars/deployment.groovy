#!/usr/bin/env groovy

import groovy.json.JsonSlurperClassic

def artifactoryDeploy(artifactroyDeploy)
{
	def artifactoryServer = Artifactory.server("artifactory")
	def mavenBuild = Artifactory.newMavenBuild()
	env.MAVEN_HOME = "${tool 'maven'}"
	
	def artifactoryDeployMap = new JsonSlurperClassic().parseTest(artifactoryDeploy)
	
	def releaseLibRes = artifactoryDeployMap.releaseLibRes
	def snapshotRepo = artifactoryDeployMap.snapshotRepo
	def snapshotLibRes = artifactoryDeployMap.snapshotLibRes
	def releaseLibDep = artifactoryDeployMap.releaseLibDep
	def snapshotLibDep = artifactoryDeployMap.snapshotLibDep
	def pomFilename = artifactoryDeployMap.pomFilename
	def goalsVal = artifactoryDeployMap.goalsVal
	
	//mavenBuild.resolver server: artifactoryServer, releaseRepo: releaseLibRes, snapshotRepo: snapshotLibRes
	mavenBuild.deployer server: artifactoryServer, releaseRepo: releaseLibDep, snapshotRepo: snapshotLibDep
	def projectBuildInfo=mavenBuild.run pom: pomFilename, goals:goalsVal
	artifactoryServer.publishBuildInfo projectBuildInfo	
}

def archiveArtifact(archive)
{
	def archiveMap = new JsonSlurperClassic().parseText(archive)
	def archiveSrc = archiveMap.archiveSrc
	archiveArtifacts artifacts: archiveSrc, fingerprint: true, OnlyIfSuccessful:true
}

def sendEmail(email)
{
	def emailMap = new JsonSlurperClassic().parseText(email)
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
def deploymentEnvironmentMaven()
{
	def mavenBuild = Artifactory.newMavenBuild()
	env.MAVEN_HOME = "${tool 'maven'}"
	def projectBuildInfo=mavenBuild.run pom: pomFilename, goals:goalsVal
}