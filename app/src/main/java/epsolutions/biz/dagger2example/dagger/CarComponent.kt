package epsolutions.biz.dagger2example.dagger

import dagger.BindsInstance
import dagger.Component
import epsolutions.biz.dagger2example.MainActivity
import epsolutions.biz.dagger2example.annotation.EngineCapacity
import epsolutions.biz.dagger2example.annotation.HorsePower
import epsolutions.biz.dagger2example.car.Car

@Component(modules = [WheelsModule::class,
    PetrolEngineModule::class//,
//    DieselEngineModule::class
])
interface CarComponent {
    fun getCar(): Car

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun horsePower(@HorsePower("horse power") horsePower: Int): Builder

        @BindsInstance
        fun engineCapacity(@EngineCapacity("engine capacity") engineCapacity: Int): Builder

        fun build(): CarComponent

    }

}