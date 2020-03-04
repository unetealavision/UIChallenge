pipeline {
agent any

tools{
maven 'Maven'
}
stages {
stage('Run Tests'){
  steps{
     sh 'mvn clean verify'
  }
  }}}
