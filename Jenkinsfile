pipeline{
    agent any
    tools {
            maven 'Maven'
            jdk 'Java8'
    }
    stages{
        stage("Maven"){
            steps {
                sh 'mvn clean install';
            }
        }
    }
}