pipeline {
    agent any
 
 
  
    stages {
        stage('Checkout and Clone') {
            steps {
                // Define the repository URL and credentials if needed
                script {
                    def repositoryUrl = 'https://github.com/dothmen/jenkinstes.git'
 
                    checkout([$class: 'GitSCM', 
                        branches: [[name: 'main']], 
                        doGenerateSubmoduleConfigurations: false, 
                        extensions: [[$class: 'CloneOption', depth: 1]], 
                        userRemoteConfigs: [[url: repositoryUrl]]])
                }
            }
        }
            stage('Build') {
            steps {
                // Set the path to your Maven installation
                 bat "mvn install"
            }
                }
                stage('verify') {
            steps {
                // Set the path to your Maven installation
                 bat "mvn verify"
            }
                }
}
}

 
    