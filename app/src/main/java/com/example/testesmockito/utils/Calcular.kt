package com.example.testesmockito.utils

class Calcular {

    fun calculadora(conta: Conta) : Int{
        return if (conta.operacao.op == OperacaoEnum.SOMAR){
            conta.numero1 + conta.numero2
        }else{
            conta.numero1 - conta.numero2
        }
    }
}