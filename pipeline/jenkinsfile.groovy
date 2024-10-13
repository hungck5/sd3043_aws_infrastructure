pipeline {
    agent {
        docker {
            dockerfile 
            { 
                dir 'src/frontend' 
            }
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