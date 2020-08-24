import _03_layouts.Homepage
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.content.resources
import io.ktor.http.content.static
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 8080
    embeddedServer(
        Netty,
        watchPaths = listOf("functional-multiplatform-templating"),
        port = port,
        module = Application::module
    ).start(wait = true)
}

fun Application.module() {
    routing {
        get("/") {
            call.respondText(
                Homepage().render("title" to listOf()),
                ContentType.Text.Html
            )
        }
        static("/static") {
            resources("")
        }
    }
}