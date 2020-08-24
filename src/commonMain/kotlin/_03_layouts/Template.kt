package _03_layouts

import kotlinx.html.TagConsumer
import kotlinx.html.stream.appendHTML

abstract class Template<L, T>(
    private val layout: Layout<L>
) : Includable<Pair<L, T>> {

    fun <U> TagConsumer<*>.include(includable: Includable<U>, data: U) {
        includable.root(this, data)
    }

    override fun render(data: Pair<L, T>): String {
        val sb = StringBuilder()
        val consumer = sb.appendHTML()

        layout.render(consumer, content { root(consumer, data) }, data)

        return sb.toString()
    }
}