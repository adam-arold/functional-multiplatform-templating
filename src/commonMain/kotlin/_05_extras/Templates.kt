package _05_extras

import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML

typealias TemplateRenderer = TagConsumer<*>.() -> Unit

typealias TemplateBuilder<T> = TagConsumer<*>.(data: T) -> Unit

typealias LayoutBuilder<T> = TagConsumer<*>.(data: T, renderer: TemplateRenderer) -> Unit

fun buildHtml(renderer: TemplateRenderer) = StringBuilder().apply {
    appendHTML().renderer()
}.toString()

fun <T> template(
    builder: TemplateBuilder<T>
): TemplateBuilder<T> = { data ->
    builder(data)
}

fun <T> layout(
    builder: LayoutBuilder<T>
): LayoutBuilder<T> = { data, renderer ->
    builder(data, renderer)
}
