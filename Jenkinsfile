@Library('emailPipeline')
//,'artifactoryDeploy')
node{

    //Checkout the project code from the repository
   stage('Git Repository')
   {
       checkout scm
   }   
   //Configure and publish to artifactory
  // stage('Artifactory deployment')
   // {
    //    artifactoryDeploy
   // }
    //Send email 
   stage('send email')
   {
       emailPipeline
   }
}