pipeline {
    agent any
    stages {

        stage('checkout') {
            steps {
                git branch: 'tp5-testing', url: "https://github.com/Adriangnr/tp4-scm.git"
            }
        }

        stage('validate') {
            steps {
                sh 'gradle check'
            }
        }
    }
}