#!/usr/bin/env groovy

import groovy.json.JsonSlurperClassic

def artifactoryDeployResolveConfig(artifactionDeployResolveConfig,artfactoryServer,mavenBuild)
{
	env.MAVEN_HOME = "${tool 'maven'}"
	def deployer = [	server: artfactoryServer, releaseRepo: artifactionDeployResolveConfig.releaseLibDep, snapshotRepo: artifactionDeployResolveConfig.snapshotLibDep]
	def resolver = [server: artfactoryServer, releaseRepo: artifactionDeployResolveConfig.releaseLibRes, snapshotRepo: artifactionDeployResolveConfig.snapshotLibRes]
	mavenBuild.resolver resolver
	mavenBuild.deployer deployer
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

//def artifactoryPromoteInteractive(artfactoryServer,artifactoryPromote,displayName,artifactoryPromoteConfig,projectBuildInfo)
def artifactoryPromoteInteractive(artfactoryServer,artifactoryPromote,displayName)
{


def artifactoryPromote1=[
/**	"buildName":projectBuildInfo.buildName,
	"buildNumber":projectBuildInfo.buildNumber,
	"targetRepo":artifactoryPromoteConfig.targetRepo,
	"sourceRepo":artifactoryPromoteConfig.sourceRepo,
	"status":artifactoryPromoteConfig.status,
	"copy":artifactoryPromoteConfig.copy,
	"failfast":artifactoryPromoteConfig.failFast]**/
	
	//artfactoryServer.addInteractivePromotion server:artfactoryServer,promotionConfig:artifactoryPromote1, displayName:displayName
	artfactoryServer.addInteractivePromotion server:artfactoryServer,promotionConfig:artifactoryPromote, displayName:displayName
}

def artifactoryPromote(artifactionPromotionConfig,projectBuildInfo)
{
//	def artifactoryPromoteMap = new JsonSlurperClassic().parseText(artifactionPromotionConfig)
	def promotionConfigs=[
	"buildName":projectBuildInfo.buildName,
	"buildNumber":projectBuildInfo.buildNumber,
	"targetRepo":artifactionPromotionConfig.targetRepo,
	"sourceRepo":artifactionPromotionConfig.sourceRepo,
	"status":artifactionPromotionConfig.status,
	"copy":artifactionPromotionConfig.copy,
	"failfast":artifactionPromotionConfig.failFast]
	return promotionConfigs
}

def updatePOMVersionNumber(versionNumber){
	def versionNumberArry = versionNumber.split("-")
	def versionNumb=versionNumberArry[0].split(".")
	def versionNumberNew = versionNumb[0] + "." + versionNumb[1] + "." + (versionNumb[2] + 1) + "-" + verionNumberArry[3]
	return versionNumber
}

