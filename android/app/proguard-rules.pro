# This is a configuration file for ProGuard.

# Android optimization
-optimizationpasses 5
-dontusemixedcaseclassnames
-verbose

# Keep application classes
-keep public class com.cerdasku.** { *; }

# Keep Android classes
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends androidx.fragment.app.Fragment

# Preserve line numbers for debugging
-keepattributes SourceFile,LineNumberTable
-renamesourcefileattribute SourceFile

# Firebase
-keep class com.google.firebase.** { *; }
-dontwarn com.google.firebase.**

# Retrofit
-keep class retrofit2.** { *; }
-keepattributes Signature
-keepattributes Exceptions
-dontwarn retrofit2.**

# Gson
-keepattributes Signature
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }
-keep class * extends com.google.gson.TypeAdapter

# Room
-keep class androidx.room.** { *; }
-dontwarn androidx.room.**

# Hilt
-keep class dagger.hilt.** { *; }
-dontwarn dagger.hilt.**