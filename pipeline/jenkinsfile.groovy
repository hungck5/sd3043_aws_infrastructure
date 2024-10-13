pipeline {
    agent {
        docker {
            image 'ubuntu:20.04'  // Sử dụng một image Ubuntu cơ bản
            args '-v /var/run/docker.sock:/var/run/docker.sock'
        }
    } 
    stages {
         stage('Install Docker CLI') {
            steps {
                sh '''
                   apt-get update
                   apt-get install -y docker.io
                   docker --version
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