package epsolutions.biz.dagger2example.car

import android.util.Log
import epsolutions.biz.dagger2example.annotation.EngineCapacity
import epsolutions.biz.dagger2example.annotation.HorsePower
import javax.inject.Inject

class PetrolEngine @Inject constructor(@HorsePower("horse power") var horsePower: Int,
                                       @EngineCapacity("engine capacity") var engineCapacity: Int): Engine {

    override fun start() {
        Log.d("Car", "Petrol Engine started." +
                "\n Horsepower: $horsePower"
                +"\n EngineCapacity: $engineCapacity")
    }
}