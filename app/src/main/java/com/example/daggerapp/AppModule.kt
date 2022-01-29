package com.example.daggerapp

import android.app.Activity
import androidx.core.app.ActivityCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
//there are Component for everything like for activity - ActivityComponent, for view - ViewComponent ,fragment etc
object AppModule {

    //singleton to create only one instance
    @Singleton
    //provides just provide the data you shared here
    @Provides
    //named is used if you have more than 1 dependency of same type
    @Named("funName")
    fun anyFunName() = "This is from anyFunName"

    @Singleton
    @Provides
    @Named("randomName")
    fun anyRandomName() = "This is from anyRandomName"
}