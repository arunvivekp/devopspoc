node {
  stage ('Git Checkout') {
    git branch: 'master',
    credentialsId: 'ff65eb4a-6c27-4a2b-b45f-bddd0a155851',
    url: 'https://github.com/arunvivekp/devopspoc.git'
  }
  
  stage ('Compile Package') {
    sh 'mvn package'
  }
}
