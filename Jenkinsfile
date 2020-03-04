pipeline {
agent any

tools{
maven 'Maven'
}
stages {
stage('Run Tests'){
  steps{
     bat 'mvn clean verify'
  }
  }}}
