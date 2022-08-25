pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube') {
                    sh 'chmod +x mvnw && ./mvnw clean verify sonar:sona -Dsonar.projectKey=SpringBoot -Dsonar.login=sqp_8d1a89321dff2d5154c59015e25d26a352ef8e52'
                }
            }
        }
    }
    post {
        success {
            mail to: 'guerrero191096@unis.edu.gt', subject:'La build fue exitosa :) 123456', body: 'Jenkins Prueba pull request23 Pipeline corregido'
        }
        failure {
            mail to: 'guerrero191096@unis.edu.gt', subject:'Ocurrio un fallo en el pipeline :(', body: 'Jenkins'
        }
    }
}
