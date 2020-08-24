package _04_functions

import kotlinx.html.*

val homepage: TemplateBuilder<List<Item>> = _05_extras.template { items ->
    div {
        ul {
            items.forEach { item ->
                li {
                    +item.name
                }
            }
        }
    }
}