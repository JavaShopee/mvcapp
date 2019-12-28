pipeline {
    agent any
    stages {
        

        stage('Create Tomcat Docker Image'){
            steps {
                sh "pwd"
                sh "docker build . -t mvcapps:${env.BUILD_ID}"
            }
        }

    }
}
