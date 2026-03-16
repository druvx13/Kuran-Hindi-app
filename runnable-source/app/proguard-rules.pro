# Add project specific ProGuard rules here.
# For more details, see http://developer.android.com/guide/developing/tools/proguard.html

# Keep Firebase classes
-keep class com.google.firebase.** { *; }
-keep class com.google.android.gms.** { *; }

# Keep application classes
-keep class com.muslim.** { *; }

# Keep RecyclerView FastScroll
-keep class com.futuremind.recyclerviewfastscroll.** { *; }
-keep class com.recyclerview.** { *; }
