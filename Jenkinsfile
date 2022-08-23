pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube') {
                    sh 'chmod +x mvnw && ./mvnw clean verify sonar:sonar -Dsonar.projectKey=SpringBoot -Dsonar.login=sqp_8d1a89321dff2d5154c59015e25d26a352ef8e52'
                }
            }
        }
    }
}
