@Library('deployment') _

node{

    //Checkout the project code from the repository
   stage('Git Repository')
   {
       checkout scm
   }
      
   //Configure and publish to artifactory
 /**  stage('Artifactory deployment')
   {
   	def releaseLibRes = 'libs-release'
    def snapshotLibRes = 'libs-snapshot'
    def releaseLibDep = 'libs-release-local'
    def snapshotLibDep = 'libs-snapshot-snapshot-local'
    def pomFilename = 'pom.xml'
    def goalsVal ='clean install'
    
		//try{
       		deployment.artifactoryDeploy(releaseLibRes,snapshotLibRes, releaseLibDep, snapshotLibDep,pomFilename,goalsVal)
 		//catch(exception)
 		//{
 		//	echo "Artifactory deployment process failed."
 		//}
	}**/
   
   //Send email 
   stage('send email')
   {
     def subjectVar = 'Jenkins deployment to Artifactory'
     def toVar = 'mgchow5007@gmail.com'
     def bodyVar = 'The artifacts have been published'
     def fromVar = 'Jenkins'
     def mimeTypeVar = 'text/html'
     
   	  // try{
       		deployment.sendEmail(subjectVar,toVar,bodyVar,fromVar,mimeTypeVar)
      // }
      // catch(exception)
      // {
      // 		echo "Failed to send an email concerning Artifactory deployment"
      // }
   }
}