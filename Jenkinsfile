pipeline {
  agent any
  stages {
    stage('Pull Code') {
      steps {
        git 'https://github.com/diaolanshan/longxin.git'
        sh 'echo "Hello"'
      }
    }
    stage('Maven Build') {
      steps {
        sh 'echo "Hello World"'
        sh 'mvn package -Dmaven.test.skip=true'
      }
    }
  }
}