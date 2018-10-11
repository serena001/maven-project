#!/usr/bin/env groovy
def call()
{
        echo "here I am"
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

       
