package _02_partials

import kotlinx.html.*

class Homepage : Template<String>() {
    override val root = _03_layouts.content<String> {
        html {
            include(Head, "title")
            body {
                div {
                    +"content"
                }
            }
        }
    }
}