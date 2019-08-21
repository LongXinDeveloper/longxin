pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
      args '-v /root/.m2:/root/.m2'
    }

  }
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