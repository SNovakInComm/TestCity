package TestCity

import TestCity.buildTypes.*
import TestCity.vcsRoots.*
import TestCity.vcsRoots.TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "0f4774c8-d675-4e9d-b334-103aee99a604"
    id = "TestCity"
    parentId = "_Root"
    name = "TestCity"

    vcsRoot(TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster)

    buildType(TestCity_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_7"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = TestCity_HttpsGithubComSNovakInCommTestCityRefsHeadsMaster.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
