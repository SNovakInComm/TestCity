package TestCity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster : GitVcsRoot({
    uuid = "f47d4469-411a-4653-ae6d-35b34a061d20"
    id = "TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster"
    name = "https://github.com/SNovakInComm/TestCity#refs/heads/master"
    url = "https://github.com/SNovakInComm/TestCity"
    authMethod = password {
        userName = "SNovakInComm"
        password = "credentialsJSON:3285439e-a9d8-4d27-9a7d-5fd45dfd30f0"
    }
})
