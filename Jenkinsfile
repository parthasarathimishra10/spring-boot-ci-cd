pipeline{
    agent any
    tools {
            maven 'M2_HOME'
            jdk 'JAVA_HOME'
    }
    stages{
        stage("Maven"){
            steps{
                mvn clean install;
            }
        }
    }
}