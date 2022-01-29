package com.example.daggerapp

import android.app.Activity
import android.content.Context
import androidx.core.app.ActivityCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
//there are Component for everything like for activity - ActivityComponent, for view - ViewComponent ,fragment etc
object MainActivityModule {

    //same work as singleton to create only one instance but for an activity,
    // there is no singleton annotation that is why we use ActivityScoped here
    @ActivityScoped
    //provides just provide the data you shared here
    @Provides
    //named is used if you have more than 1 dependency of same type
    @Named("randomName2")
    fun anyRandomName2(@ApplicationContext context: Context,@Named("funName")funName2:String) = "${context.getString(R.string.string_to_inject)} - $funName2"
}