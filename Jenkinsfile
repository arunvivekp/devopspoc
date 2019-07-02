node {
  stage ('Git Checkout') {
    git 'https://github.com/arunvivekp/devopspoc'
  }
  
  stage ('Compile Package') {
    sh 'mvn package'
  }
}
