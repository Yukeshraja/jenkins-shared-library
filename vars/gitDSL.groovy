
def call(config) {
    println config
    //checkout([$class: 'GitSCM', branches: [[name: "*/${config.branch}"]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: "${config.scmUrl}"]]])


}
