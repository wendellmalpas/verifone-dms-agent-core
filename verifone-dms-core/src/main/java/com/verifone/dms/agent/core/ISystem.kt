package com.verifone.dms.agent.core

interface ISystem {
    fun getModel():String
    fun getSerialNumber():String
    fun getFirmwareVersion():Int
}