def call(version){
  def tag = params.AppVersion
  echo "${params.AppVersion}"
  // sh  "/usr/bin/git clone --branch ${params.AppVersion} https://github.com/Ram-Priyatham/JenkinsDockerIntegration/"
  git(branch: 'master', url: 'https://github.com/Ram-Priyatham/JenkinsDockerIntegration')
  sh "git checkout tags/${version} "
}
