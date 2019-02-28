package epsolutions.biz.dagger2example.annotation

import javax.inject.Qualifier

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION,
    AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)
@Retention(AnnotationRetention.SOURCE)
@MustBeDocumented
@Qualifier
annotation class HorsePower(val horsePower: String) {
}