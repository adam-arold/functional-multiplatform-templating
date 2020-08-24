package _03_layouts

import kotlinx.html.TagConsumer

fun <T> content(builder: TagConsumer<*>.(T) -> Unit) = builder
