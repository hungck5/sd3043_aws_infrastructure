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
                echo 'docker --version' 
            }
        }
    }
}