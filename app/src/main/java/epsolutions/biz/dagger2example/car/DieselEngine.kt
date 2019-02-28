package epsolutions.biz.dagger2example.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(var horsePower: Int): Engine {

    override fun start() {
        Log.d("Car", "Diesel Engine started, horsepower:  $horsePower")
    }
}