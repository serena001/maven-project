node{
    def artfactoryServer = Artifactory.server("artifactory")
    dev mavenBuild =Artifactory.newMavenBuild()

   stage('Git Repository')
   {
       checkout scm
   }

   stage('configure artifactory')
   {
       mavenBuild.resolver server: server, releaseRepo: 'libs-release', snapShotRepo: 'libs-snapshot'
       mavenBuild.deployer server: server, releaseRepo: 'libs-release-local' , snapShotRepo: 'libs-snapshot-local'
   }
   stage('build project')
   {
       def projectBuildInfo=mavenBuild.run pom: 'pom.xml' , goals: 'clean install'
   }
   stage('publish to artifactory')
   {
       server.publishBuildInfo projectBuildInfo
   }
}