import com.github.ajalt.clikt.core.main
import com.portalsoup.mox.Mox

fun main(args: Array<String>) {
//    val plugins = mutableListOf<IMoxPlugin>()

//    val pluginNames: List<String> = listOf("foo", "bar")

//    pluginNames.forEach {
//        plugins.add(dlopen("path/to/$it").let { /* transform to */ } as IMoxPlugin)
//    }

    Mox().main(args)
}
