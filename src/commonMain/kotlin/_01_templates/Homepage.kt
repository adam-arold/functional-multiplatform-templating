package _01_templates

import kotlinx.html.*

class Homepage : Template<String>() {
    override val root = content<String> { title ->
        html {
            head {
                title(title)
            }
            body {
                div {
                    +"content"
                }
            }
        }
    }
}