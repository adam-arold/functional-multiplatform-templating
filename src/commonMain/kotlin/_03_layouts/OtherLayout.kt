package _03_layouts

import kotlinx.html.*

class OtherLayout : Layout<String>() {

    override fun <U> content(
        builder: TagConsumer<*>.(U) -> Unit,
        data: Pair<String, U>
    ) = content<String> {
        val (title, rest) = data
        html {
            include(Head, title)
            body {
                div {
                    h1 { +title }
                    builder(rest)
                }
            }
        }
    }

}