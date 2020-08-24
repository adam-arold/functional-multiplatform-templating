package _02_partials

import kotlinx.html.*

object Head : Partial<String>() {
    override val root = _03_layouts.content<String> { title ->
        head {
            title(title)
            script {
                src = "/static/functional-multiplatform-templating.js"
            }
        }
    }
}