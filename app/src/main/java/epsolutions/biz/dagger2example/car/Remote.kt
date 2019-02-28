package epsolutions.biz.dagger2example.car

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    fun setListener(car: Car) {
        Log.d("Car", "Remote connected")
    }

}
