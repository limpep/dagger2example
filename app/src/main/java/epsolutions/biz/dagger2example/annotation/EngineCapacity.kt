package epsolutions.biz.dagger2example.annotation

import javax.inject.Qualifier
import kotlin.annotation.MustBeDocumented

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Qualifier
annotation class EngineCapacity(val engineCapacity: String) {
}