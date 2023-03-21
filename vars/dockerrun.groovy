def call(){
  sh "kubectl apply -f manifests/ -n cicd-task"
}
