package epsolutions.biz.dagger2example.dagger

import javax.inject.Scope
import kotlin.annotation.Retention
import kotlin.annotation.MustBeDocumented

@Scope
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class PerActivity {
}