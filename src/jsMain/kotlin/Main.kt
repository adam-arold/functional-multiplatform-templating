import _03_layouts.Homepage
import _02_partials.HomepageParams

fun main() {
    val homepage = Homepage().render(HomepageParams("title"))

    println(homepage)
}