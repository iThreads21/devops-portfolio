pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'docker build -t sample-app .'
            }
        }

        stage('Push') {
            steps {
                sh 'docker push sample-app'
            }
        }

        stage('Deploy') {
            steps {
                sh './scripts/deploy.sh sample-app staging latest'
            }
        }
    }
}
