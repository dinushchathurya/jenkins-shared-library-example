#!/usr/bin/env groovy

def call(String repoUrl, String branchName) {

    pipeline {

        agent any

        stages { 
            stage("Checkout Code") {
                steps {
                    git branch: "${branchName}", url: "${repoUrl}"
                }
            }
        }

        stage("Build") {
            steps {
                sh "npm install"
            }
        }

        stage('Test') {
            steps {
                sh "npm test"
            }
        }

        stage('Deploy') {
            steps {
                sh "npm run deploy"
            }
        }

    }

}