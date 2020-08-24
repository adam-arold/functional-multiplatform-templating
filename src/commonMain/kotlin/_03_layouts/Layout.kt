package _03_layouts

import kotlinx.html.TagConsumer

abstract class Layout<T> {

    abstract fun <U> content(
        builder: TagConsumer<*>.(U) -> Unit,
        data: Pair<T, U>
    ): TagConsumer<*>.(T) -> Unit

    fun <U> TagConsumer<*>.include(includable: Includable<U>, data: U) {
        includable.root(this, data)
    }

    fun <U> render(
        consumer: TagConsumer<*>,
        template: TagConsumer<*>.(U) -> Unit,
        data: Pair<T, U>
    ) {
        content(template, data)(consumer, data.first)
    }

}