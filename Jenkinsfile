pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube Scanner 4.7') {
                    sh './mvnw clean verify sonar:sonar -D"sonar.projectKey=SpringBoot" -D"sonar.login=sqp_8d1a89321dff2d5154c59015e25d26a352ef8e52"'
                }
            }
        }
    }
}
