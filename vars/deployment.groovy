#!/usr/bin/env groovy
def artifactoryDeploy()
{
	def artfactoryServer = Artifactory.server("artifactory")
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
    server.publishBuildInfo projectBuildInfo
}
def sendEmail()
{
	 def subjectVar = 'Jenkins deployment to Artifactory'
        def toVar = 'mgchow5007@gmail.com'
        def bodyVar = 'The artifacts have been published'
        def fromVar = 'Jenkins'
        def mimeTypeVar = 'text/html'

        emailext(
        subject:subjectVar,
        to:toVar,
        body:bodyVar,
        from:fromVar,
        mimeType:mimeTypeVar
        )
}