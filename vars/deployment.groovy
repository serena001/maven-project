#!/usr/bin/env groovy

import groovy.json.JsonSlurperClassic

def artifactoryDeployResolveConfig(artifactoryConfig,mavenBuild)
{
	env.MAVEN_HOME = "${tool 'maven'}"	
	def artifactoryConfigMap = new JsonSlurperClassic().parseTest(artifactoryConfig)
	def mavenBuildMap = new JsonSlurperClassic().parseText(mavenBuildConfig)	
	mavenBuild.resolver server: artfactoryServer, releaseRepo: artifactoryConfigMap.releaseLibRes, snapshotRepo: artifactoryConfigMap.snapshotLibRes
	mavenBuild.deployer server: artfactoryServer, releaseRepo: artifactoryConfigMap.releaseLibDep, snapshotRepo: artifactoryConfigMap.snapshotLibDep
	return mavenBuild
}

def archiveArtifact(archiveConfig)
{
	def archiveMap = new JsonSlurperClassic().parseText(archiveConfig)
	archiveArtifacts artifacts: archiveMap.archiveSrc, fingerprint:archiveMap.fingerprint, OnlyIfSuccessful:archiveMap.OnlyIfSuccessful
}

def sendEmail(emailConfig)
{
	def emailMap = new JsonSlurperClassic().parseText(emailConfig)	
	emailext(
		subject:emailMap.subject,
		to:emailMap.to,
		body:emailMap.body,
		from:emailMap.from,
		mimeType:emailMap.mimeType
		)
}

def createArtifactoryInstance()
{
	def artifactoryServer = Artifactory.server("artifactory")
	return artifactoryServer
}

def createMavenBuildInstance()
{
	env.MAVEN_HOME = "${tool 'maven'}"
	def mavenBuild = Artifactory.newMavenBuild()
	return mavenBuild
}

def buildMaven(mavenBuild,pomFileName,goals)
{
	def projectBuildInfo=mavenBuild.run pom:pomFileName,goals:goals
	return projectBuildInfo
}

def artifactoryPromoteInteractive(artfactoryServer,artifactoryPromoteConfig,displayName)
{
	artfactoryServer.addInteractivePromotion server:artfactoryServer,promotionConfig:artifactoryPromoteConfig, displayName:displayName
}

def updatePOMVersionNumber(versionNumber){
	def verionNumberArry = (versionNumber.split("-"))[0].split(".")
	def versionNumberNew = versionNumberArry[0] + "." + versionNumberArry[1] + "." + (versionNumberArry[2] + 1) + "-" + verionNumberArry[3]
	return versionNumber
}

