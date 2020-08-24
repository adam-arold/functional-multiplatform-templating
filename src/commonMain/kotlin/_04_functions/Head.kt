package _04_functions

import kotlinx.html.head
import kotlinx.html.script
import kotlinx.html.title

val head: TemplateBuilder<String> = _05_extras.template { title ->
    head {
        title(title)
        script {
            src = "/static/functional-multiplatform-templating.js"
        }
    }
}