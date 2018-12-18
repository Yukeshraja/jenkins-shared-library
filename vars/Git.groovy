def call(scmUrl, branch) {
  echo "${scmUrl}"
  checkout([$class: 'GitSCM', branches: [[name: '*/${branch}']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: '${scmUrl}']]])
}
