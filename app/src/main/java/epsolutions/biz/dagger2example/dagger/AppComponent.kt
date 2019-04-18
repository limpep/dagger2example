package epsolutions.biz.dagger2example.dagger

import dagger.Component
import epsolutions.biz.dagger2example.car.Driver
import javax.inject.Singleton

@Singleton
@Component(modules = [DriverModule::class])
interface AppComponent {
    fun getDriver(): Driver

}