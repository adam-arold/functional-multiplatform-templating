package _02_partials

import kotlinx.html.TagConsumer

fun <T> content(builder: TagConsumer<*>.(T) -> Unit) = builder
