package _03_layouts

import kotlinx.html.*

object Head : Partial<String>() {
    override val root = content<String> { title ->
        head {
            title(title)
            script {
                src = "/static/functional-multiplatform-templating.js"
            }
        }
    }
}