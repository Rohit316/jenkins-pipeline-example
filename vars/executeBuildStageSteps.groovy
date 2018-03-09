#!/usr/bin/env groovy

def call() {
    echo("Building project for ${NAME}.")
    sleep(time:5,unit:'SECONDS')
    sh 'mvn clean'
}
