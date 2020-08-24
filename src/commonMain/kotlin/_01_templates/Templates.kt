package _01_templates

import kotlinx.html.TagConsumer

fun <T> content(builder: TagConsumer<*>.(T) -> Unit) = builder
