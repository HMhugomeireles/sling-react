package com.cathcart93.sling.core

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
@Deprecated("This annotation is not supported anymore")
annotation class ReactProp(val name: String = "")