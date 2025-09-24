package com.portalsoup.mox.plugin

interface IMoxPlugin {
    val name: String
    val parentName: String?

    fun run(args: String): Unit
}