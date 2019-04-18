package epsolutions.biz.dagger2example.dagger

import dagger.Module
import dagger.Provides
import epsolutions.biz.dagger2example.car.Driver
import javax.inject.Singleton

@Module
object DriverModule {

    @JvmStatic
    @Provides
    @Singleton
    fun provideDriver(): Driver {
        return Driver()
    }
}