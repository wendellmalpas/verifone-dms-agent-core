package com.verifone.dms.agent.core

interface ISystem {
    fun getModel()
    fun getSerialNumber()
    fun installPackage(filePath:String)
    fun uninstallPackage(filePath:String)
}