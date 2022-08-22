pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube') {
                    sh 'ls -l && chmod +x mvnw && ./mvnw clean verify sonar:sonar'
                }
            }
        }
    }
}
