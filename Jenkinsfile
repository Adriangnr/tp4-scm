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
                sh 'chmod +x gradlew'
                sh './gradlew check'
            }
        }

        stage('analyze') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew  sonarqube'
            }
        }

        stage('test') {
                    steps {
                        sh 'chmod +x gradlew'
                        sh './gradlew test'
                    }
         }

         stage('build') {
                     steps {
                         sh 'chmod +x gradlew'
                         sh './gradlew build'
                     }
         }
    }
}