package TestCity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.maven
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object TestCity_Build : BuildType({
    uuid = "b70d8fc4-60d2-46e5-ba2a-d90c27ac7d5d"
    id = "TestCity_Build"
    name = "Build"

    vcs {
        root(TestCity.vcsRoots.TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster)

    }

    steps {
        maven {
            goals = "clean test"
            pomLocation = ".teamcity/pom.xml"
            mavenVersion = defaultProvidedVersion()
        }
    }

    triggers {
        vcs {
        }
    }
})
