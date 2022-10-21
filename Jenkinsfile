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
            mail to: 'guerrero191096@unis.edu.gt', subject:"La build fue exitosa en el pipeline ${env.JOB_NAME} ${env.GIT_LOCAL_BRANCH}", body: "Jenkins Pipeline ${env.JOB_NAME}, Numero de build ${env.BUILD_NUMBER}, Log disponible en el URL ${env.BUILD_URL}     "
        }
        failure {
            mail to: 'jflores@unis.edu.gt', subject:"Ocurrio un fallo en el pipeline ${env.JOB_NAME}", body: "Jenkins Pipeline ${env.JOB_NAME}, Numero de build ${env.BUILD_NUMBER}, Log disponible en el URL ${env.BUILD_URL}  "
        }
    }
}
