plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {

    compileSdk = ProjectSetting.PROJECT_COMPILE_SDK

    defaultConfig {
        applicationId = ProjectSetting.PROJECT_APP_ID
        minSdk = ProjectSetting.PROJECT_MIN_SDK
        targetSdk = ProjectSetting.PROJECT_TARGET_SDK
        versionCode = ProjectSetting.PROJECT_VERSION_CODE
        versionName = ProjectSetting.PROJECT_VERSION_NAME

        multiDexEnabled = true
        vectorDrawables.useSupportLibrary = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

        // Naming APK // AAB
        setProperty("archivesBaseName", "${ProjectSetting.NAME_APK}(${versionName})")

        // Declaration apps name debug mode
        val debugAttribute = "Development"
        val nameAppDebug = "${ProjectSetting.NAME_APP} $debugAttribute"

        resConfigs("en", "id")

        // Inject app name for debug
        resValue("string", "app_name", nameAppDebug)

    }

    signingConfigs {
        create("release") {
            // You need to specify either an absolute path or include the
            // keystore file in the same directory as the build.gradle file.
            // [PROJECT FOLDER NAME/app/[COPY YOUT KEY STORE] .jks in here
            storeFile = file("frogoboxdev.jks")
            storePassword = "cronoclez"
            keyAlias = "frogobox"
            keyPassword = "xeonranger"
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )

            // Generated Signed APK / AAB
            signingConfig = signingConfigs.getByName("release")

            // Inject app name for release
            resValue("string", "app_name", ProjectSetting.APP_NAME)

        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Dependency.COMPOSE_VERSION
        kotlinCompilerVersion = Dependency.KOTLIN_VERSION
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_11.toString()
            useIR = true
        }
    }

    packagingOptions {
        exclude("META-INF/AL2.0")
        exclude("META-INF/LGPL2.1")
    }
}


dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:${Dependency.KOTLIN_VERSION}")

    implementation(project(":frogoconsumeapi"))

    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    implementation("com.google.code.gson:gson:2.8.8")
    implementation("com.google.android.material:material:1.4.0")

    implementation("de.hdodenhof:circleimageview:3.1.0")

    implementation("com.github.bumptech.glide:glide:4.12.0")

    implementation("com.github.amirisback:frogo-recycler-view:3.8.8")
    implementation("com.github.amirisback:frogo-log:2.0.4")

    implementation("com.github.frogobox:frogo-android-ui-kit:1.0.4")
    implementation("com.github.frogobox:frogo-android-sdk:2.0.4")

    implementation("io.insert-koin:koin-core:${Dependency.KOIN_VERSION}") // Koin core features
    implementation("io.insert-koin:koin-android:${Dependency.KOIN_VERSION}") // Koin main features for Android (Scope,ViewModel ...)
    implementation("io.insert-koin:koin-android-compat:${Dependency.KOIN_VERSION}") // Koin Java Compatibility
    implementation("io.insert-koin:koin-androidx-workmanager:${Dependency.KOIN_VERSION}") // Koin for Jetpack WorkManager
    implementation("io.insert-koin:koin-androidx-compose:${Dependency.KOIN_VERSION}") // Koin for Jetpack Compose

    kapt("com.github.bumptech.glide:compiler:4.11.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

}