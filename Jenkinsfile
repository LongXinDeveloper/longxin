pipeline {
  agent any
  stages {
    stage('Pull Code') {
      steps {
        git 'https://github.com/diaolanshan/longxin.git'
      }
    }
    stage('Maven Build') {
      steps {
        sh 'echo "Hello World"'
      }
    }
  }
}