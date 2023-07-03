#!/usr/bin/env groovy

def call(String name = 'human') {
    // In here default value is set to 'human'
    echo "Hello, ${name}."
}