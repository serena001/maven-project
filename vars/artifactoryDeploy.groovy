#!/usr/bin/env groovy
def call()
{
	sh 'hellow'
    /**def artfactoryServer = Artifactory.server("artifactory")
    def mavenBuild =Artifactory.newMavenBuild()
    env.MAVEN_HOME = "${tool 'maven'}"

    def releaseLibRes = 'libs-release'
    def snapshotLibRes = 'libs-snapshot'

    def releaseLibDep = 'libs-release-local'
    def snapshotLibDep = 'libs-snapshot-snapshot-local'

    def pomFilename = 'pom.xml'
    def goalsVal ='clean install'

    mavenBuild.resolver server: artfactoryServer, releaseRepo: releaseLibRes, snapshotRepo: snapshotLibRes
    mavenBuild.deployer server: artfactoryServer, releaseRepo: releaseLibDep , snapshotRepo: snapshotLibDep
    def projectBuildInfo=mavenBuild.run pom: pomFilename , goals: goalsVal
    server.publishBuildInfo projectBuildInfo**/
}


