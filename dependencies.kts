//用于 更新版本号的检测，这个文件对项目工程无影响
dependencies {
	implementation fileTree (include: ['*.jar'], dir: 'libs')

	//<editor-folder desc="support"
	implementation "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.11"
	implementation "androidx.appcompat:appcompat:1.0.2"
	implementation "androidx.recyclerview:recyclerview:1.0.0"
	implementation "com.google.android.material:material:1.0.0"
	implementation "androidx.constraintlayout:constraintlayout:1.1.3"
	implementation "androidx.cardview:cardview:1.0.0"
	//</editor-folder>

	//<editor-folder desc="单元测试">
	testImplementation "junit:junit:4.12"
	androidTestImplementation "androidx.test:runner:1.1.1"
	androidTestImplementation "androidx.test.espresso:espresso-core:3.1.1"
	//</editor-folder>

	//<editor-folder desc="Rx 相关">
	implementation "io.reactivex.rxjava2:rxandroid:2.1.0"
	implementation "io.reactivex.rxjava2:rxjava:2.2.3"
	implementation "io.reactivex.rxjava2:rxkotlin:2.3.0"
	implementation "com.jakewharton.rxbinding2:rxbinding:2.1.1"
	//</editor-folder>

	//<editor-folder desc="网络相关">
	implementation "com.squareup.retrofit2:retrofit:2.4.0"
	implementation "com.squareup.retrofit2:adapter-rxjava2:2.4.0"
	implementation "com.squareup.retrofit2:converter-gson:2.4.0"
	implementation "com.squareup.retrofit2:converter-scalars:2.3.0"
	//okhttp3
	implementation "com.squareup.okhttp3:okhttp:3.11.0"
	//gson
	implementation "com.google.code.gson:gson:2.8.5"
	//</editor-folder>

	//<editor-folder desc="注入工具">

	//dagger2
	implementation "com.google.dagger:dagger:2.19"
	kapt "com.google.dagger:dagger-compiler:2.19"

	implementation "com.jakewharton:butterknife:9.0.0-rc2"
	kapt "com.jakewharton:butterknife-compiler:9.0.0-rc2"
	//</editor-folder>

	//<editor-folder desc="性能监测">
	//leakcannary
	debugImplementation "com.squareup.leakcanary:leakcanary-android:1.6.1"
	releaseImplementation "com.squareup.leakcanary:leakcanary-android-no-op:1.6.1"
	//UI阻塞监控
	debugImplementation "com.github.markzhai:blockcanary-android:1.5.0"
	//</editor-folder>

	//<editor-folder desc="其他依赖库">
	//android job 1.3.0-alpha09
	implementation "com.evernote:android-job:1.2.6"
	//android utils
	implementation "com.blankj:utilcode:1.21.2"
	// jsoup HTML parser library @ https://jsoup.org/
	implementation "org.jsoup:jsoup:1.11.2"
	//lottie Android 炫酷动画依赖库
	implementation "com.airbnb.android:lottie:2.8.0"
	//</editor-folder>

	//<editor-folder desc="Architecture components LifeCycle & Room">
	implementation "androidx.lifecycle:lifecycle-runtime:2.0.0"
	implementation "androidx.lifecycle:lifecycle-extensions:2.0.0"
	kapt "androidx.lifecycle:lifecycle-compiler:2.0.0"

	implementation "androidx.room:room-runtime:2.0.0"
	implementation "androidx.room:room-rxjava2:2.0.0"
	kapt "androidx.room:room-compiler:2.0.0"

	implementation "androidx.paging:paging-runtime:2.0.0"
	implementation "android.arch.work:work-runtime:1.0.0-alpha13"
	implementation "android.arch.navigation:navigation-ui:1.0.0-alpha08"
	implementation "android.arch.navigation:navigation-fragment:1.0.0-alpha08"

	//</editor-folder>

}