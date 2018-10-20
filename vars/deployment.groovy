#!/usr/bin/env groovy
def artifactoryDeploy(def releaseLibRes, def snapshotLibRes, def releaseLibDep, def snapshotLibDep, def pomFilename, def goalsVal)
{
	def artfactoryServer = Artifactory.server("artifactory")
    def mavenBuild =Artifactory.newMavenBuild()
    env.MAVEN_HOME = "${tool 'maven'}"

    mavenBuild.resolver server: artfactoryServer, releaseRepo: releaseLibRes, snapshotRepo: snapshotLibRes
    mavenBuild.deployer server: artfactoryServer, releaseRepo: releaseLibDep , snapshotRepo: snapshotLibDep
    def projectBuildInfo=mavenBuild.run pom: pomFilename , goals: goalsVal
    server.publishBuildInfo projectBuildInfo
}

def sendEmail(def subjectVar, def toVar, def bodyVar, def fromVar, def mimeTypeVar)
{
     emailext(
        subject:subjectVar,
        to:toVar,
        body:bodyVar,
        from:fromVar,
        mimeType:mimeTypeVar
     )
}