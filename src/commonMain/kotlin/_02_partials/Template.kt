package _02_partials

import kotlinx.html.TagConsumer

abstract class Template<T> : Includable<T> {

    fun <U> TagConsumer<*>.include(includable: Includable<U>, data: U) {
        includable.root(this, data)
    }
}