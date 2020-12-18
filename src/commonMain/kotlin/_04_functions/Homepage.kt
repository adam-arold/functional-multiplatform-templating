package _04_functions

import kotlinx.html.*

val homepage: TemplateBuilder<List<Item>> = template { items ->
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
