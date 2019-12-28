pipeline {
    agent any
    stages {
        

        stage('Create Tomcat Docker Image'){
            steps {
                sh "pwd"
                sh "docker build . -t mvcapp:${env.BUILD_ID}"
            }
        }

    }
}