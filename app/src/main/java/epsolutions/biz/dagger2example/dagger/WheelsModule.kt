package epsolutions.biz.dagger2example.dagger

import dagger.Module
import dagger.Provides
import epsolutions.biz.dagger2example.car.Rims
import epsolutions.biz.dagger2example.car.Tires
import epsolutions.biz.dagger2example.car.Wheels

@Module
object WheelsModule {


    @JvmStatic
    @Provides
    fun provideRims(): Rims {
        return Rims()
    }

    @JvmStatic
    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()

        return tires
    }

    @JvmStatic
    @Provides
    fun provideWheels(rims: Rims, tires: Tires): Wheels {
        return Wheels(rims, tires)
    }

}