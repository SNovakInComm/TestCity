package TestCity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.VisualStudioStep
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.ant
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.dotnetBuild
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.dotnetRestore
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.visualStudio
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object TestCity_Build : BuildType({
    uuid = "e8ea34ee-f569-489d-a784-ad8e4d188842"
    id = "TestCity_Build"
    name = "Build"

    vcs {
        root(TestCity.vcsRoots.TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster)

    }

    steps {
        dotnetRestore {
            enabled = false
            projects = "Building_TestCity.sln"
        }
        dotnetBuild {
            enabled = false
            projects = "Building_TestCity.sln"
        }
        visualStudio {
            enabled = false
            path = "Building_TestCity.sln"
            version = VisualStudioStep.VisualStudioVersion.vs2013
            msBuildVersion = VisualStudioStep.MSBuildVersion.V12_0
            msBuildToolsVersion = VisualStudioStep.MSBuildToolsVersion.V12_0
        }
        ant {
            name = "1"
            mode = antFile {
            }
        }
        dotnetBuild {
            enabled = false
            name = "Step1"
            args = "echo Step1"
            param("dotNetCoverage.dotCover.home.path", "%teamcity.tool.JetBrains.dotCover.CommandLineTools.DEFAULT%")
        }
        script {
            name = "1 (1)"
            scriptContent = "Echo 1"
        }
        script {
            name = "2"
            scriptContent = "Echo 2"
        }
    }

    triggers {
        vcs {
        }
    }
})
