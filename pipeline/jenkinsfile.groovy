pipeline {
    agent any
    stages {
        stage('Disable TLS') {
            steps {
                sh '''
                    unset DOCKER_TLS_VERIFY
                    unset DOCKER_CERT_PATH
                    unset DOCKER_HOST
                '''
            }
        }
        stage('step 1') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('step 2') {
            steps {
                sh 'docker --version' 
            }
        }
    }
}