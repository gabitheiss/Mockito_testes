package com.example.testesmockito.utils

//classe para testar, mockito faz o mapeamento de objetos mais ou menos como um json
//objeto dentro de objeto - criar mapeamento para acessar

data class Conta(

    val nome: String,
    val numero1: Int,
    val numero2: Int,
    val operacao: Operacao
)

data class Operacao(

    val nome: String,
    val op: OperacaoEnum
)

enum class OperacaoEnum {
    SOMAR,
    SUBTRAIR
}
