pipeline {
    agent any 
    stages {
        stage('step 1') {
            steps {
                echo 'Hello world!' 
            }
        }
    }
}