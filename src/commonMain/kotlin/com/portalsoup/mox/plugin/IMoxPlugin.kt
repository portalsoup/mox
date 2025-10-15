package com.portalsoup.mox.plugin

import com.portalsoup.mox.plugin.IMoxPlugin.RunResult.*

abstract class IMoxPlugin {
    sealed interface RunResult {
        val code: Int
        data class Success(override val code: Int = 0): RunResult
        data class Failure(override val code: Int = 0, val reason: String= ""): RunResult
    }

    abstract val name: String

    // null can mean root command is parent
    open val parentName: String? = null

    // if preRun returns Failure, don't run run() or postRun()
    open fun preRun(args: List<String>): RunResult = Success()
    open fun postRun(runResult: RunResult, args: List<String>): Unit = Unit

    abstract fun run(args: List<String>): RunResult
}

class TestPlugin: IMoxPlugin() {
    override val name: String = "test_plugin"
    override val parentName: String? = null

    override fun preRun(args: List<String>): RunResult {
        return args.takeIf { it.size == 1 }
            ?.let { Success() }
            ?: Failure(1, "Invalid argument count")
    }

    override fun run(args: List<String>): RunResult {
        return Failure(1)
    }

    override fun postRun(runResult: RunResult, args: List<String>) {
        when (runResult) {
            is Success -> println("Success")
            is Failure -> println("Failure: ${runResult.code} ${runResult.reason}")
        }
    }
}
