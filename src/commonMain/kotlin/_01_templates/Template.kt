package _01_templates

import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML

abstract class Template<T> {

    abstract val root: TagConsumer<*>.(T) -> Unit

    fun render(data: T): String {
        val sb = StringBuilder()
        val tagConsumer = sb.appendHTML()
        root(tagConsumer, data)
        return sb.toString()
    }
}