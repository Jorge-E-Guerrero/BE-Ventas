pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                withSonarQubeEnv(installationName: 'SonarQube') {
                    sh 'chmod +x mvnw && ./mvnw clean verify sonar:sonar -Dsonar.qualitygate.wait=true -Dsonar.projectKey=SpringBoot -Dsonar.login=sqp_8d1a89321dff2d5154c59015e25d26a352ef8e52'
                }
            }
        }
    }
    post {
        success {
            mail to: 'guerrero191096@unis.edu.gt', subject:"La build fue exitosa en el pipeline de la branch ${env.BRANCH_NAME}", body: "Jenkins Pipeline, Numero de build ${env.BUILD_NUMBER}"
        }
        failure {
            mail to: 'guerrero191096@unis.edu.gt', subject:"Ocurrio un fallo en el pipeline de la branch ${BRANCH_NAME}", body: "Jenkins Pipeline, Numero de build ${env.BUILD_NUMBER}"
        }
    }
}
