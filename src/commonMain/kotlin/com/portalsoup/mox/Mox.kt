package com.portalsoup.mox

import com.github.ajalt.clikt.core.CoreCliktCommand
import com.portalsoup.mox.plugin.IMoxPlugin

class Mox(plugin: IMoxPlugin): CoreCliktCommand() {

    init {
        plugin.run("...")
    }
    override fun run() {
        print("Hello, Clikt!")
    }
}