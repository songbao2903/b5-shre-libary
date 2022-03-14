pipeline {
    agent { label "master" }

    libraries {
        lib('github.com/cfpb/jenkins-shared-libraries@main')
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
