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

    const val FROGO_SDK_VERSION = "1.0.0"
    const val FROGO_SDK = "com.github.frogobox:frogo-sdk:$FROGO_SDK_VERSION"
    const val FROGO_SDK_CORE = "com.github.frogobox.frogo-sdk:frogocoresdk:$FROGO_SDK_VERSION"

    const val FROGO_PATH_CORE_CONSUME_API = ":frogocoreconsumeapi"
    const val FROGO_PATH_CONSUME_API = ":frogoconsumeapi"

}