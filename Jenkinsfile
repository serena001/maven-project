@Library('deployment') _

node{

    //Checkout the project code from the repository
   stage('Git Repository')
   {
       checkout scm
   }
   
   def archiveConfig = readFile(file:"src/main/resources/archiveConfig.json")
   def artifactoryPublishConfig = readFile(file:"src/main/resources/artifactoryPublishConfig.json")
   def emailConfig = readFile(file:"src/main/resources/emailConfig.json")
   def promotionConfig = readFile(file:'src/main/resources/promotionConfig.json")
      
   //Configure and publish to artifactory
  /** stage('Artifactory deployment')
	{
        try
        {
        		def artifactoryServer = deployment.createArtifactoryInstance()
        		def mavenBuild = deployment.createMavenBuildInstance()
        		deployment.artifactoryDeploy(artifactoryDeploy,artfactoryServer,mavenBuild)
        }
        catch(exception)
        {
        		//Send email if deployment to artifactory fails
        		//deployment.sendEmail(emailConfig)
        		throw exception
        }
    }
   
   stage('Promotion')
   {
		try
		{
			def artfactoryServer = deployment.createArtifactoryInstance()
			def mavenBuild = deployment.createMavenBuildInstance()
			deployment.artifactoryDeploy(artifactoryDeploy,artifactoryServer,mavenBuild)
		}
		catch(exception)
		{
			//send email if deployment to artifactory fails
			//deployment.sendEmail(emailConfig)
			throw exception
		}
   } **/
    //Archive files 
 /**  stage('archive')
   {
		try
		{
			deployment.archiveArtifact(archiveConfig)
		}
		catch(exception)
		{
			//send email if deployment to artifactory fails
			//deployment.sendEmail(emailConfig)
			throw exception
		}
   }**/
   stage('promotion')
   {
   	def promotionConfigs = [ 
   	'buildName':'45',
   	'buildNumber':'66',
   	'targetRepo':'libs-release-local',
   	'sourceRepo':'libs-staging-local',
   	'status':'Release',
   	'copy':true,
   	'failFast':true]
   	def artifactoryServer = Artifactory.server("artifactory")//deployment.createArtifactoryInstance()
   	artifactoryServer.promote promotionConfigs
   	
   }
