package _03_layouts

import kotlinx.html.*

class Homepage : Template<String, List<Item>>(OtherLayout()) {

    override val root = content<Pair<String, List<Item>>> { (title, items) ->
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
}