#!/usr/bin/env groovy

import groovy.json.JsonSlurperClassic

def artifactoryDeployResolveConfig(artifactionDeployResolveConfig,artfactoryServer,mavenBuild)
{
	env.MAVEN_HOME = "${tool 'maven'}"
	//def deployer = [	server: artfactoryServer, releaseRepo: artifactionDeployResolveConfig.releaseLibDep, snapshotRepo: artifactionDeployResolveConfig.snapshotLibDep]
	mavenBuild.resolver server: artfactoryServer, releaseRepo: artifactionDeployResolveConfig.releaseLibRes, snapshotRepo: artifactionDeployResolveConfig.snapshotLibRes
	mavenBuild.deployer server: artfactoryServer, releaseRepo: artifactionDeployResolveConfig.releaseLibDep, snapshotRepo: artifactionDeployResolveConfig.snapshotLibDep
	//mavenBuild.deployer deployer
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

def artifactoryPromoteInteractive(artfactoryServer,artifactoryPromote,displayName)
{
	artfactoryServer.addInteractivePromotion server:artfactoryServer,promotionConfig:artifactoryPromoteConfig, displayName:displayName
}

def artifactoryPromote(artifactoryPromoteConfig)
{
	def artifactoryPromoteMap = new JsonSlurperClassic().parseText(artifactoryPromoteConfig)
	def promotionConfigs=[
	"buildName":artifactoryPromoteMap.buildName,
	"buildNumber":artifactoryPromoteMap.buildNumber,
	"targetRepo":artifactoryPromoteMap.targetRepo,
	"sourceRepo":artifactoryPromoteMap.sourceRepo,
	"status":artifactoryPromoteMap.status,
	"copy":artifactoryPromoteMap.copy,
	"failfast":artifactoryPromoteMap.failFast]
	return promotionConfigs
}

def updatePOMVersionNumber(versionNumber){
	def versionNumberArry = (versionNumber.split("-"))[0].split(".")
	def versionNumberNew = versionNumberArry[0] + "." + versionNumberArry[1] + "." + (versionNumberArry[2] + 1) + "-" + verionNumberArry[3]
	return versionNumber
}

