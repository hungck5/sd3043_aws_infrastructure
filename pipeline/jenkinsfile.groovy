pipeline {
    agent {
        docker {
            image 'docker:25.0.3'
            args '-v /var/run/docker.sock:/var/run/docker.sock'
        }
    } 
    stages {
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