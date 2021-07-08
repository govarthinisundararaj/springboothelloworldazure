pipeline {
    
    agent any
    tools {
        gradle "gradle"
        jdk "java"
    }
    stages {
        stage (scm){
            steps {
                git branch: 'dev1', url: 'https://github.com/govarthinisundararaj/springboothelloworldazure.git'
            }
        }
         stage (build){
            steps {
               bat label: '', script: 'gradlew.bat clean build'
               step( [ $class: 'JacocoPublisher' ] )
            }
        }
    }
    post {
        success {
            junit 'build/test-results/test/*.xml'
        }
    }
}
