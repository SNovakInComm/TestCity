package TestCity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster : GitVcsRoot({
    uuid = "7c1ef568-e9c5-4cf8-bf60-354ff2b8c563"
    id = "TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster"
    name = "https://github.com/SNovakInComm/TestCity#refs/heads/master"
    url = "https://github.com/SNovakInComm/TestCity"
    branchSpec = "+:refs/heads/(*)"
    authMethod = password {
        userName = "SNovakInComm"
        password = "credentialsJSON:3285439e-a9d8-4d27-9a7d-5fd45dfd30f0"
    }
})
