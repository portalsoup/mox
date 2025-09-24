@file:OptIn(ExperimentalForeignApi::class)

package com.portalsoup.mox.plugin

import kotlinx.cinterop.CStructVar
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.NativePtr
import kotlinx.cinterop.objcPtr

//@CStruct("MoxPlugin")
class MoxPlugin(rawPtr: NativePtr): IMoxPlugin, CStructVar(rawPtr) {
    override val name: String
        get() = TODO("Not yet implemented")
    override val parentName: String?
        get() = TODO("Not yet implemented")

    override fun run(args: String) = this.objcPtr()

//    companion object : Type(sizeOf<MoxPlugin>(), alignOf<MoxPlugin>())
}
