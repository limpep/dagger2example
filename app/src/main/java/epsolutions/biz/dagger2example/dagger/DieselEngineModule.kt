package epsolutions.biz.dagger2example.dagger

import dagger.Binds
import dagger.Module
import dagger.Provides
import epsolutions.biz.dagger2example.car.DieselEngine
import epsolutions.biz.dagger2example.car.Engine

@Module
class DieselEngineModule constructor(var horsePower: Int) {

    @Provides
    fun provideHorsePower() :Int {
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine {
        return engine
    }
}