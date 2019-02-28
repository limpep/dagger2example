package epsolutions.biz.dagger2example.dagger

import dagger.Binds
import dagger.Module
import epsolutions.biz.dagger2example.car.Engine
import epsolutions.biz.dagger2example.car.PetrolEngine

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine

}