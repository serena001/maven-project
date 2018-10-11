@Library('deployment') _

node{

    //Checkout the project code from the repository
   stage('Git Repository')
   {
       checkout scm
   }
      
   //Configure and publish to artifactory
  // stage('Artifactory deployment')
 //  {
 //      deployment.artifactoryDeploy()
 //  }
   
   //Send email 
   stage('send email')
   {
       deployment.sendEmail()
   }
}