import Versions.APP_CENTER_VERSION
import Versions.COIL_VERSION
import Versions.DAGGER_VERSION
import Versions.FACEBOOK_LOGIN_VERSION
import Versions.GOOGLE_SERVICES_VERSION
import Versions.GRADLE_PLUGIN_VERSION
import Versions.KODEIN_VERSION
import Versions.KOIN_VERSION
import Versions.KOTLIN_COROUTINES_VERSION
import Versions.KOTLIN_VERSION
import Versions.LIFECYCLE_VERSION
import Versions.NAVIGATION_VERSION
import Versions.OKHTTP_VERSION
import Versions.RETROFIT_VERSION
import Versions.TOOTHPICK_VERSION
import Versions.WORK_VERSION
import Versions.ZXING_VERSION
import extensions.implementation
import extensions.kapt
import org.gradle.api.artifacts.dsl.DependencyHandler

object Dependencies {

    object App {
        const val GRADLE_PLUGIN = "com.android.tools.build:gradle:$GRADLE_PLUGIN_VERSION"
        const val GOOGLE_SERVICES = "com.google.gms:google-services:$GOOGLE_SERVICES_VERSION"
        const val FABRIC = "io.fabric.tools:gradle:1.25.4"
    }

    object AndroidSdk {
        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.1.0-rc01"
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.ANDROID_SUPPORT_VERSION}"
        const val RECYCLER_VIEW = "androidx.recyclerview:recyclerview:1.0.0"
        const val CARD_VIEW = "androidx.cardview:cardview:1.0.0"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.0.0-beta2"
        const val MATERIAL = "com.google.android.material:material:1.0.0"
        const val ANNOTATION = "androidx.annotation:annotation:${Versions.ANDROID_SUPPORT_VERSION}"
        const val KTX_CORE = "androidx.core:core-ktx:1.2.0-beta01"
        const val FRAGMENT_RUNTIME = "androidx.fragment:fragment:${Versions.FRAGMENT_VERSION}"
        const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT_VERSION}"
        const val FRAGMENT_TESTING =
            "androidx.fragment:fragment-testing:${Versions.FRAGMENT_VERSION}"

        const val PAGING = "androidx.paging:paging-runtime-ktx:2.1.0"
    }

    object Other {
        const val ROOTBEER = "com.scottyab:rootbeer-lib:0.0.7"
        const val CRASHLYTICS = "com.crashlytics.sdk.android:crashlytics:2.9.9@aar"
        const val CIRCLE_INDICATOR = "me.relex:circleindicator:2.1.0"
        const val EVENT_BUS = "org.greenrobot:eventbus:3.1.1"
        const val ZXING = "com.google.zxing:core:$ZXING_VERSION"
        const val ZXING_EMBEDDED = "com.journeyapps:zxing-android-embedded:3.6.0"

        const val APP_CENTER_ANALYTICS =
            "com.microsoft.appcenter:appcenter-analytics:$APP_CENTER_VERSION"
        const val APP_CENTER_CRASHES =
            "com.microsoft.appcenter:appcenter-crashes:$APP_CENTER_VERSION"
        const val SEGMENTED_CONTROL = "com.github.RobertApikyan:SegmentedControl:1.1.3"
        const val FRAGMENT_HELPER = "me.yokeyword:fragmentationx:1.0.1"
        const val ALERTER = "com.tapadoo.android:alerter:4.0.2"
        const val SECURE_PREFS = "com.github.hussainderry:secure-preferences:4.0.0"

        const val LEAKCANARY = "com.squareup.leakcanary:leakcanary-android:2.0-beta-3"
    }

    object RX {
        const val RX_ANDROID_BLE = "com.polidea.rxandroidble2:rxandroidble:1.10.0"
        const val RX_ANDROID = "io.reactivex.rxjava2:rxandroid:2.1.1"
        const val RX_REPLAYING_SHARE = "com.jakewharton.rx2:replaying-share:2.1.1"
    }

    object Kotlin {

        object Build {
            const val KOTLIN_GRADLE_PLUGIN =
                "org.jetbrains.kotlin:kotlin-gradle-plugin:$KOTLIN_VERSION"
        }

        object Stdlib {
            const val CORE = "org.jetbrains.kotlin:kotlin-stdlib:$KOTLIN_VERSION"
        }

        const val STDLIB = "stdlib"

        const val COROUTINES =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:$KOTLIN_COROUTINES_VERSION"
        const val COROUTINES_ANDROID =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$KOTLIN_COROUTINES_VERSION"
    }

    object Injection {
        const val DAGGER = "com.google.dagger:dagger:$DAGGER_VERSION"
        const val DAGGER_COMPILER = "com.google.dagger:dagger-compiler:$DAGGER_VERSION"
        const val DAGGER_ANDROID = "com.google.dagger:dagger-android:$DAGGER_VERSION"
        const val DAGGER_ANDROID_SUPPORT =
            "com.google.dagger:dagger-android-support:$DAGGER_VERSION"
        const val DAGGER_ANDROID_PROCESSOR =
            "com.google.dagger:dagger-android-processor:$DAGGER_VERSION"

        fun DependencyHandler.addDaggerDependencies() {
            implementation(DAGGER)
            kapt(DAGGER_COMPILER)
        }

        // Koin for Kotlin
        const val KOIN_CORE = "org.koin:koin-core:$KOIN_VERSION"

        // Koin for Android
        const val KOIN = "org.koin:koin-android:$KOIN_VERSION"
        // Koin for Lifecycle scoping
        const val KOIN_SCOPE = "org.koin:koin-android-scope:$KOIN_VERSION"
        // Koin for Android Architecture ViewModel
        const val KOIN_VIEW_MODEL = "org.koin:koin-android-viewmodel:$KOIN_VERSION"

        const val TOOTHPICK_RUNTIME =
            "com.github.stephanenicolas.toothpick:toothpick-runtime:$TOOTHPICK_VERSION"
        const val TOOTHPICK_ANDROID =
            "com.github.stephanenicolas.toothpick:smoothie-androidx:$TOOTHPICK_VERSION"
        const val TOOTHPICK = "com.github.stephanenicolas.toothpick:ktp:$TOOTHPICK_VERSION"
        const val TOOTHPICK_COMPILER =
            "com.github.stephanenicolas.toothpick:toothpick-compiler:$TOOTHPICK_VERSION"

        const val KODEIN = "org.kodein.di:kodein-di-generic-jvm:$KODEIN_VERSION"
    }

    object Room {
        const val COMPILER = "android.arch.persistence.room:compiler:${Versions.ROOM_VERSION}"
        const val RUNTIME = "android.arch.persistence.room:runtime:${Versions.ROOM_VERSION}"
        const val COROUTINES = "androidx.room:room-coroutines:2.1.0-alpha04"
    }

    object ArchCore {
        const val RUMTIME = "androidx.arch.core:core-runtime:${Versions.ARCH_CORE_VERSION}"
        const val TESTING = "androidx.arch.core:core-testing:${Versions.ARCH_CORE_VERSION}"
    }

    object Network {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VERSION"
        const val RETROFIT_CONVERTER_GSON =
            "com.squareup.retrofit2:converter-gson:$RETROFIT_VERSION"
        const val RETROFIT_COROUTINES_ADAPTER =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"
        const val OKHTTP = "com.squareup.okhttp3:okhttp:$OKHTTP_VERSION"
        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:$OKHTTP_VERSION"
        const val GSON = "com.google.code.gson:gson:2.8.5"
    }

    object ImageProcessor {
        const val COIL = "io.coil-kt:coil:$COIL_VERSION"
        const val CROPPER = "com.theartofdev.edmodo:android-image-cropper:2.8.0"
        const val COMPRESSOR = "id.zelory:compressor:2.1.0"
        const val GLIDE = "com.github.bumptech.glide:glide:4.10.0"
        const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:4.9.0"
    }

    object Lifecycle {
        const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata:$LIFECYCLE_VERSION"
        const val LIFECYCLE_JAVA8 = "androidx.lifecycle:lifecycle-common-java8:$LIFECYCLE_VERSION"
        const val LIVEDATA_KTX = "androidx.lifecycle:lifecycle-livedata-ktx:$LIFECYCLE_VERSION"
        const val EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VERSION"
        const val COMPILER = "androidx.lifecycle:lifecycle-compiler:$LIFECYCLE_VERSION"
        const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel:$LIFECYCLE_VERSION"
        const val KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VERSION"
    }

    object Firebase {
        const val CORE = "com.google.firebase:firebase-core:16.0.8"
        const val ANALYTICS = "com.google.firebase:firebase-analytics:16.4.0"
        const val CRASH = "com.google.firebase:firebase-crash:16.2.1"
        const val CRASHLYTICS = "com.crashlytics.sdk.android:crashlytics:2.9.9"
        const val PERFORMANCE = "com.google.firebase:firebase-perf:16.2.4"
    }

    object Navigation {
        const val RUNTIME = "androidx.navigation:navigation-runtime:$NAVIGATION_VERSION"
        const val UI = "androidx.navigation:navigation-ui:$NAVIGATION_VERSION"
        const val UI_KTX = "androidx.navigation:navigation-ui-ktx:$NAVIGATION_VERSION"
        const val RUNTIME_KTX = "androidx.navigation:navigation-runtime-ktx:$NAVIGATION_VERSION"
        const val FRAGMENT = "androidx.navigation:navigation-fragment:$NAVIGATION_VERSION"
        const val FRAGMENT_KTX =
            "androidx.navigation:navigation-fragment-ktx:$NAVIGATION_VERSION"
        const val SAFE_ARGS =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$NAVIGATION_VERSION"

        fun DependencyHandler.addNavigationDependencies() {
            implementation(RUNTIME)
            implementation(UI)
            implementation(UI_KTX)
            implementation(RUNTIME_KTX)
            implementation(FRAGMENT)
            implementation(FRAGMENT_KTX)
        }
    }

    object Work {
        const val RUNTIME = "androidx.work:work-runtime:$WORK_VERSION"
        const val RUNTIME_KTX = "androidx.work:work-runtime-ktx:$WORK_VERSION"
        const val FIREBASE = "androidx.work:work-firebase:$WORK_VERSION"
    }

    object Facebook {
        const val FACEBOOK_LOGIN = "com.facebook.android:facebook-login:$FACEBOOK_LOGIN_VERSION"
    }

    object Log {
        const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
    }
}