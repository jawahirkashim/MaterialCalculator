package com.cicd.materialcalculator.domain

sealed interface ExpressionPart{
    data class Number(val number: Double):ExpressionPart
    data class Op(val operation: Operation):ExpressionPart
    data class Parentheses(val parenthesesType: ParenthesesType):ExpressionPart
}

sealed interface ParenthesesType{
    object Opening:ParenthesesType
    object Closing:ParenthesesType
}