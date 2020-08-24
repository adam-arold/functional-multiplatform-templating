package _03_layouts

import kotlinx.html.TagConsumer
import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.html

class DefaultLayout : Layout<String>() {

    override fun <U> content(
        builder: TagConsumer<*>.(U) -> Unit,
        data: Pair<String, U>
    ) = content<String> {
        val (title, rest) = data
        html {
            include(Head, title)
            body {
                div {
                    builder(rest)
                }
            }
        }
    }

}