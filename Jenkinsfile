pipeline {
    agent any
    tools{
        maven "3.8.6"
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean verify sonar:sonar -D"sonar.projectKey=SpringBoot" -D"sonar.login=sqp_8d1a89321dff2d5154c59015e25d26a352ef8e52"'
            }
        }
    }
}
