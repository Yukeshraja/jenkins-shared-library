
def call(config) {
    println config.scmUrl
    //checkout([$class: 'GitSCM', branches: [[name: "*/${config.branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "${config.scmUrl}"]]])


}
