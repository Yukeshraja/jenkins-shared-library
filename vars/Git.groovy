def call(def scmUrl, def branch) {
  checkout([$class: 'GitSCM', branches: [[name: '*/$branch']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: '$scmUrl']]])
}
