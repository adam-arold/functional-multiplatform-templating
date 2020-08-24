package _05_extras

import kotlinx.html.*

val heading: TemplateBuilder<String> = template { title ->
    head {
        title(title)
    }
}

val pageLayout = layout<String> { title, template ->
    html {
        heading(title)
        body {
            navLayout(title) {

            }
            div {
                template()
            }
        }
    }
}

val navLayout = layout<String> { title, navigation ->
    body {
        div {
            navigation()
        }
    }
}

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