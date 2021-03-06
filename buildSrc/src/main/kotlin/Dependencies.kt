object Versions {
    const val aboutLibraries = "8.6.6"
    const val androidGradlePlugin = "7.0.0-alpha04"
    const val androidxActivity = "1.2.0-rc01"
    const val androidxAppCompat = "1.3.0-beta01"
    const val androidxBrowser = "1.3.0"
    const val androidxConstraintLayout = "2.1.0-alpha2"
    const val androidxCore = "1.5.0-beta01"
    const val androidxFragment = "1.3.0-rc01"
    const val androidxHilt = "1.0.0-alpha02"
    const val androidxLifecycle = "2.3.0-rc01"
    const val androidxPreference = "1.1.1"
    const val androidxRecyclerView = "1.2.0-beta01"
    const val androidxRoom = "2.3.0-alpha04"
    const val androidxSecurity = "1.1.0-alpha03"
    const val androidxSwipeRefreshLayout = "1.2.0-alpha01"
    const val androidxTest = "1.3.1-alpha03"
    const val androidxTestExt = "1.1.2"
    const val androidxViewPager2 = "1.1.0-alpha01"
    const val androidxWork = "2.5.0-rc01"
    const val apacheCommonsText = "1.9"
    const val barista = "3.7.0"
    const val betterLinkMovementMethod = "2.2.0"
    const val chucker = "3.4.0"
    const val coil = "1.1.1"
    const val coilAccompanist = "0.4.2"
    const val compose = "1.0.0-alpha10"
    const val daggerHilt = "2.30.1-alpha"
    const val detekt = "1.15.0"
    const val espresso = "3.1.0"
    const val firebaseBom = "26.3.0"
    const val firebaseCrashlyticsGradlePlugin = "2.4.1"
    const val googleServices = "4.3.4"
    const val insetter = "0.4.0"
    const val intellijMarkdown = "0.1.45"
    const val jUnit = "4.13"
    const val klock = "2.0.3"
    const val kotlin = "1.4.21"
    const val kotlinxCoroutines = "1.4.2"
    const val ktlint = "0.40.0"
    const val ktlintGradle = "9.4.1"
    const val markwon = "4.6.1"
    const val materialComponents = "1.3.0-rc01"
    const val metalavaGradlePlugin = "0.1.6"
    const val mockito = "3.7.7"
    const val mockitoKotlin = "2.2.0"
    const val moshi = "1.11.0"
    const val okHttp = "4.9.0"
    const val playCore = "1.9.0"
    const val prism4j = "2.0.0"
    const val processPhoenix = "2.0.0"
    const val retrofit = "2.9.0"
    const val robolectric = "4.5-alpha-3"
    const val screenshotTesting = "0.13.0"
    const val timber = "4.7.1"
}

object Dep {
    const val aboutLibrariesCore = "com.mikepenz:aboutlibraries-core:${Versions.aboutLibraries}"
    const val aboutLibrariesGradlePlugin = "com.mikepenz.aboutlibraries.plugin:aboutlibraries-plugin:${Versions.aboutLibraries}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    const val androidxActivity = "androidx.activity:activity-ktx:${Versions.androidxActivity}"
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"
    const val androidxBrowser = "androidx.browser:browser:${Versions.androidxBrowser}"
    const val androidxConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintLayout}"
    const val androidxCore = "androidx.core:core-ktx:${Versions.androidxCore}"
    const val androidxFragment = "androidx.fragment:fragment-ktx:${Versions.androidxFragment}"
    const val androidxHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.androidxHilt}"
    const val androidxHiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.androidxHilt}"
    const val androidxHiltWork = "androidx.hilt:hilt-work:${Versions.androidxHilt}"
    const val androidxLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidxLifecycle}"
    const val androidxPreference = "androidx.preference:preference:${Versions.androidxPreference}"
    const val androidxRecyclerView = "androidx.recyclerview:recyclerview:${Versions.androidxRecyclerView}"
    const val androidxRoomKtx = "androidx.room:room-ktx:${Versions.androidxRoom}"
    const val androidxRoomProcessor = "androidx.room:room-compiler:${Versions.androidxRoom}"
    const val androidxRoomRuntime = "androidx.room:room-runtime:${Versions.androidxRoom}"
    const val androidxSecurity = "androidx.security:security-crypto:${Versions.androidxSecurity}"
    const val androidxSwipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.androidxSwipeRefreshLayout}"
    const val androidxViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidxLifecycle}"
    const val androidxViewPager2 = "androidx.viewpager2:viewpager2:${Versions.androidxViewPager2}"
    const val androidxWork = "androidx.work:work-runtime-ktx:${Versions.androidxWork}"
    const val apacheCommonsText = "org.apache.commons:commons-text:${Versions.apacheCommonsText}"
    const val betterLinkMovementMethod = "me.saket:better-link-movement-method:${Versions.betterLinkMovementMethod}"
    const val chucker = "com.github.chuckerteam.chucker:library:${Versions.chucker}"
    const val chuckerNoOp = "com.github.chuckerteam.chucker:library-no-op:${Versions.chucker}"
    const val coil = "io.coil-kt:coil:${Versions.coil}"
    const val coilAccompanist = "dev.chrisbanes.accompanist:accompanist-coil:${Versions.coilAccompanist}"
    const val composeCore = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    const val composeLayout = "androidx.compose.foundation:foundation-layout:${Versions.compose}"
    const val composeLiveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    const val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    const val composeMaterialIcons = "androidx.compose.material:material-icons-core:${Versions.compose}"
    const val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val daggerHiltAndroid = "com.google.dagger:hilt-android:${Versions.daggerHilt}"
    const val daggerHiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.daggerHilt}"
    const val daggerHiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerHilt}"
    const val detektGradlePlugin = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detekt}"
    const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
    const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
    const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics"
    const val firebaseCrashlyticsGradlePlugin = "com.google.firebase:firebase-crashlytics-gradle:${Versions.firebaseCrashlyticsGradlePlugin}"
    const val googleServicesPlugin = "com.google.gms:google-services:${Versions.googleServices}"
    const val insetter = "dev.chrisbanes.insetter:insetter:${Versions.insetter}"
    const val intellijMarkdown = "org.jetbrains:markdown:${Versions.intellijMarkdown}"
    const val klock = "com.soywiz.korlibs.klock:klock:${Versions.klock}"
    const val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val kotlinCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutines}"
    const val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinxCoroutines}"
    const val ktlintGradlePlugin = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlintGradle}"
    const val markwonCore = "io.noties.markwon:core:${Versions.markwon}"
    const val markwonHtml = "io.noties.markwon:html:${Versions.markwon}"
    const val markwonImageCoil = "io.noties.markwon:image-coil:${Versions.markwon}"
    const val markwonInline = "io.noties.markwon:inline-parser:${Versions.markwon}"
    const val markwonLatex = "io.noties.markwon:ext-latex:${Versions.markwon}"
    const val markwonLinkify = "io.noties.markwon:linkify:${Versions.markwon}"
    const val markwonStrikethrough = "io.noties.markwon:ext-strikethrough:${Versions.markwon}"
    const val markwonSyntaxHighlight = "io.noties.markwon:syntax-highlight:${Versions.markwon}"
    const val markwonTables = "io.noties.markwon:ext-tables:${Versions.markwon}"
    const val markwonTaskList = "io.noties.markwon:ext-tasklist:${Versions.markwon}"
    const val materialComponents = "com.google.android.material:material:${Versions.materialComponents}"
    const val metalavaGradlePlugin = "me.tylerbwong.gradle:metalava-gradle:${Versions.metalavaGradlePlugin}"
    const val moshi = "com.squareup.moshi:moshi:${Versions.moshi}"
    const val moshiKotlinCodegen = "com.squareup.moshi:moshi-kotlin-codegen:${Versions.moshi}"
    const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    const val okHttpLogger = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
    const val okHttpMock = "com.squareup.okhttp3:mockwebserver:${Versions.okHttp}"
    const val playCore = "com.google.android.play:core:${Versions.playCore}"
    const val prism4jBundler = "io.noties:prism4j-bundler:${Versions.prism4j}"
    const val processPhoenix = "com.jakewharton:process-phoenix:${Versions.processPhoenix}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val androidxTestCore = "androidx.test:core-ktx:${Versions.androidxTest}"
    const val androidxTestExt = "androidx.test.ext:junit-ktx:${Versions.androidxTestExt}"
    const val androidxTestRunner = "androidx.test:runner:${Versions.androidxTest}"
    const val barista = "com.schibsted.spain:barista:${Versions.barista}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val mockito = "org.mockito:mockito-core:${Versions.mockito}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"
    const val screenshotTestingPlugin = "com.facebook.testing.screenshot:plugin:${Versions.screenshotTesting}"
}
