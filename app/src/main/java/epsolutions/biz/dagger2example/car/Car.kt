package epsolutions.biz.dagger2example.car

import android.util.Log
import epsolutions.biz.dagger2example.dagger.PerActivity
import javax.inject.Inject

@PerActivity
class Car @Inject constructor(var driver: Driver,
                              var engine: Engine,
                              var wheels: Wheels) {

    @Inject
    fun enableRemote(remote: Remote) {
        remote.setListener(this)
    }

    fun drive() {
        engine.start()
        Log.d("Car","$driver drives $this")
    }
}