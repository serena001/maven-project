@Library('deployment') _

node{
def emailVars = load "./emailVariables.groovy"

    //Checkout the project code from the repository
   stage('Git Repository')
   {
       checkout scm
   }
      
   //Configure and publish to artifactory
   stage('Artifactory deployment')
   {
   	def releaseLibRes = emailVars.releaseLibRes
    def snapshotLibRes = emailVars.snapshotLibRes
    def releaseLibDep = emailVars.releaseLibDep
    def snapshotLibDep = emailVars.snapshotLibDep
    def pomFilename = emailVars.pomFilename
    def goalsVal = emailVars.goalsVal
    
		//try{
       		deployment.artifactoryDeploy(releaseLibRes,snapshotLibRes, releaseLibDep, snapshotLibDep,pomFilename,goalsVal)
 		//catch(Exception e)
 		//{
 		//	echo "Artifactory deployment process failed."
 		//}
	}
   
   //Send email 
   stage('send email')
   {
     def subjectVar = 'Jenkins deployment to Artifactory'
     def toVar = 'testing@gmail.com'
     def bodyVar = 'The artifacts have been published'
     def fromVar = 'Jenkins'
     def mimeTypeVar = 'text/html'
     
   	  // try{
       		deployment.sendEmail(subjectVar,toVar,bodyVar,fromVar,mimeTypeVar)
      // }
      // catch(Exception e)
      // {
      // 		echo "Failed to send an email concerning Artifactory deployment"
      // }
   }
}