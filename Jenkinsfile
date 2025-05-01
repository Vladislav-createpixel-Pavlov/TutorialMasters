pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'Java'
    }
    stages {
     //clean рабочей директории
      //  stage('git clone project')
        stage('build') {
            steps {

                echo "${packageType}"
                bat "mvn clean"
                bat "mvn test -Dtest=${packageType}"
            }
            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                always { allure([
                    includeProperties: false,
                    jdk: '',
                    properties: [],
                    reportBuildPolicy: 'ALWAYS',
                    results: [[path: 'target/allure-results']]
                ])
            }
        }
    }
}
}

