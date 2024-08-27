package com.example.retrofit_compose

//=====================================================================================================

/*
in the build.gradle(project level)---

id("com.google.dagger.hilt.android") version "2.51.1" apply false

*/

//=====================================================================================================

/*
in the plugins in build.gradle (app level)
id("kotlin-kapt")
id("com.google.dagger.hilt.android")

 */

//=====================================================================================================

/*
in dependencies curly bracket build.gradle(app level)---

val lifecycle_version = "2.8.4"
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycle_version")

//retrofit
val retrofit_version = "2.11.0"
implementation ("com.squareup.retrofit2:retrofit:$retrofit_version")
implementation("com.squareup.retrofit2:converter-gson:$retrofit_version")


//dagger hilt
val daggerhitl_version = "2.51.1"
implementation("com.google.dagger:hilt-android:$daggerhitl_version")
kapt("com.google.dagger:hilt-android-compiler:$daggerhitl_version")

*/

//=====================================================================================================

/*
out of dependencies curly bracket build.gradle(app level)---

kapt {
   correctErrorTypes = true
}

*/
