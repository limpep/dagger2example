package epsolutions.biz.dagger2example

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import epsolutions.biz.dagger2example.car.Car
import epsolutions.biz.dagger2example.dagger.ActivityComponent
import epsolutions.biz.dagger2example.dagger.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car

    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: ActivityComponent = DaggerActivityComponent.builder()
            .horsePower(120)
            .engineCapacity(1400)
            .appComponent((application as ExampleApp).getAppComponent())
            .build()

        component.inject(this)

        car1.drive()
        car2.drive()
    }
}
