pipeline {
    agent { label "main" }

    libraries {
        lib('github.com/songbao2903/b5-shre-libary@main')
    }

    stages {
        stage("Echostage") {
            steps {
               echo "foo"
            }
        }
    }
    post {
        always {
            script {
                sendEmail(currentBuild, ['momnhuong@gmail.com'])
            }
        }
    }
}"""
