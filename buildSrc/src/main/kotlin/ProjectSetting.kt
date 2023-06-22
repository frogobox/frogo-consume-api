/*
 * Created by faisalamir on 19/09/21
 * FrogoRecyclerView
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.
 * All rights reserved
 *
 */

object ProjectSetting {

    const val NAME_APP = "Frogo Consume Api"

    const val APP_DOMAIN = "com"
    const val APP_PLAY_CONSOLE = "frogobox"
    const val APP_NAME = "appapi"

    const val LIBRARY_NAME_API = "api"
    const val LIBRARY_NAME_CORE_API = "coreapi"
    const val LIBRARY_NAME_CORE_UTIL = "coreutil"

    const val MODULE_NAME_CORE_UTIL = "core-util"
    const val MODULE_NAME_CORE_API = "core-api"
    const val MODULE_NAME_API = "core-api-android"

    // ---------------------------------------------------------------------------------------------

    const val VERSION_MAJOR = 2
    const val VERSION_MINOR = 5
    const val VERSION_PATCH = 0

    // ---------------------------------------------------------------------------------------------

    const val PROJECT_MIN_SDK = Version.Gradle.minSdk
    const val PROJECT_COMPILE_SDK = Version.Gradle.compileSdk
    const val PROJECT_TARGET_SDK = PROJECT_COMPILE_SDK

    // ---------------------------------------------------------------------------------------------

    const val BASE_PACAKGE_NAME = "$APP_DOMAIN.$APP_PLAY_CONSOLE"

    const val PROJECT_APP_ID = "$BASE_PACAKGE_NAME.$APP_NAME"

    const val PROJECT_LIB_ID_API = "$BASE_PACAKGE_NAME.$LIBRARY_NAME_API"
    const val PROJECT_LIB_ID_CORE_API = "$BASE_PACAKGE_NAME.$LIBRARY_NAME_CORE_API"
    const val PROJECT_LIB_ID_CORE_UTIL = "$BASE_PACAKGE_NAME.$LIBRARY_NAME_CORE_UTIL"

    const val PROJECT_VERSION_CODE = (VERSION_MAJOR * 100) + (VERSION_MINOR * 10) + (VERSION_PATCH * 1)
    const val PROJECT_VERSION_NAME = "$VERSION_MAJOR.$VERSION_MINOR.$VERSION_PATCH"

    val NAME_APK = NAME_APP.lowercase().replace(" ", "-")

    // ---------------------------------------------------------------------------------------------

    const val PLAYSTORE_STORE_FILE = "frogoboxmedia.jks"
    const val PLAYSTORE_STORE_PASSWORD = "amirisback"
    const val PLAYSTORE_KEY_ALIAS = "frogoisback"
    const val PLAYSTORE_KEY_PASSWORD = "amirisback"

}
