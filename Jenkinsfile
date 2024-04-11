pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
            checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/InfanteAlex/finalCen4802']])
             sh 'mvn clean install'
            }

        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t alexinfante/finalcen4802 . -f D:/Documents/programming/InteliProjects/finalCen4802/Dockerfile'
                }
            }
        }
        stage('Push to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pdw', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u alexinfante -p ${dockerhubpwd}'
                    }
                    sh 'docker push alexinfante/finalcen4802'
                }
            }
        }
    }
}
