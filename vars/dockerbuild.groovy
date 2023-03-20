def call(version){
  def releaseName = sh(returnStdout: true, script: 'git describe --abbrev=0 --tags').trim()
  // def dockerImageName = "example/:${releaseName}"
  // sh "cd JenkinsDockerIntegration"
  sh "docker build -t rampriyatham/demo-test:${version} ."
}
