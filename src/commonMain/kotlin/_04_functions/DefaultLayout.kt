package _04_functions

import kotlinx.html.body
import kotlinx.html.div
import kotlinx.html.html

val defaultLayout = layout<String> { title, template ->
    html {
        head(title)
        body {
            div {
                template()
            }
        }
    }
}
