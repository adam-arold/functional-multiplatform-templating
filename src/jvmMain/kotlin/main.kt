import _05_extras.Item
import _05_extras.buildHtml
import _05_extras.homepage
import _05_extras.pageLayout

fun main() {

    val items = listOf(
        Item("one"), Item("two"), Item("three")
    )

    val html = buildHtml {
        pageLayout("title") {
            homepage(items)
        }
    }

    println(html)
}
