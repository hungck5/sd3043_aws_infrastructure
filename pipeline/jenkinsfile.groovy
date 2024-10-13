pipeline {
    agent any
    stages {
        
        stage('step 1') {
            steps {
                echo 'Hello world!' 
            }
        }
        stage('step 2') {
            steps {
                sh '''
                    unset DOCKER_TLS_VERIFY
                    unset DOCKER_CERT_PATH
                    unset DOCKER_HOST
                    docker --version
                ''' 
            }
        }
    }
}