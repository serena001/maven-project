class emailVars {
    def releaseLibRes = 'libs-release'
    def snapshotLibRes = 'libs-snapshot'
    def releaseLibDep = 'libs-release-local'
    def snapshotLibDep = 'libs-snapshot-snapshot-local'
    def pomFilename = 'pom.xml'
    def goalsVal ='clean install'
}

return new emailVars();
