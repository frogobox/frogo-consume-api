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

object DependencyGradle {

    const val KOTLIN_VERSION = Version.JetBrains.kotlin
    const val COMPOSE_MULTIPLATFORM_VERSION = Version.Androidx.composeMultiPlatform

    const val FROGO_SDK_VERSION = "2.2.4"
    const val FROGO_SDK = "com.github.frogobox:frogo-sdk:$FROGO_SDK_VERSION"
    const val FROGO_SDK_CORE = "com.github.frogobox.frogo-sdk:core-sdk:$FROGO_SDK_VERSION"

    const val FROGO_UI_VERSION = "2.0.0"
    const val FROGO_UI = "com.github.frogobox:frogo-ui:$FROGO_UI_VERSION"
    const val FROGO_UI_CORE = "com.github.frogobox.frogo-ui:core-ui:$FROGO_UI_VERSION"

    const val FROGO_RECYCLER_VIEW_VERSION = "4.3.5"
    const val FROGO_RECYCLER_VIEW = "com.github.amirisback:frogo-recycler-view:$FROGO_RECYCLER_VIEW_VERSION"

    const val FROGO_PATH_CORE_UTIL = ":${ProjectSetting.MODULE_NAME_CORE_UTIL}"
    const val FROGO_PATH_CORE_API = ":${ProjectSetting.MODULE_NAME_CORE_API}"
    const val FROGO_PATH_CORE_ANDROID_API = ":${ProjectSetting.MODULE_NAME_API}"

}
