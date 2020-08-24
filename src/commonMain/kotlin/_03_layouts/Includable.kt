package _03_layouts

import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML

interface Includable<T> {

    val root: TagConsumer<*>.(T) -> Unit

    fun render(data: T): String {
        val sb = StringBuilder()
        val tagConsumer = sb.appendHTML()
        root(tagConsumer, data)
        return sb.toString()
    }
}