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
            mail to: 'guerrero191096@unis.edu.gt', subject:"La build fue exitosa en el pipeline ${env.JOB_NAME} de la branch ${env.GIT_LOCAL_BRANCH}", body: "Jenkins Pipeline ${env.JOB_NAME}, Numero de build ${env.BUILD_NUMBER},"
        }
        failure {
            mail to: 'guerrero191096@unis.edu.gt', subject:"Ocurrio un fallo en el pipeline ${env.JOB_NAME} de la branch ${env.GIT_LOCAL_BRANCH}", body: "Jenkins Pipeline ${env.JOB_NAME}, Numero de build ${env.BUILD_NUMBER}, Build autorizada por el developer ${env.CHANGE_AUTHOR}"
        }
    }
}
