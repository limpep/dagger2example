package epsolutions.biz.dagger2example.car

import android.util.Log
import epsolutions.biz.dagger2example.annotation.EngineCapacity
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine @Inject constructor(@Named("horse power") var horsePower: Int,
                                       @EngineCapacity("engine capacity") var engineCapacity: Int): Engine {

    override fun start() {
        Log.d("Car", "Petrol Engine started." +
                "\n Horsepower: $horsePower"
                +"\n EngineCapacity: $engineCapacity")
    }
}