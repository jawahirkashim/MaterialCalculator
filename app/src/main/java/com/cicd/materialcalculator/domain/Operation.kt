package com.cicd.materialcalculator.domain

enum class Operation(val symbol: Char) {
    ADD('+'), SUBTRACT('-'), MULTIPLY('x'), DIVIDE('/'), PERCENTAGE('%')
}

val operationSymbols:String = Operation.values().map { it.symbol }.joinToString("")

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find {
        it.symbol == symbol
    } ?: throw IllegalArgumentException("Invalid symbol")
}