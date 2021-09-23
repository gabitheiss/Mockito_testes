package com.example.testesmockito.utils

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

@RunWith(JUnit4::class)
class CalcularTest {

        @Mock
        lateinit var conta: Conta

        @Mock
        lateinit var operacao: Operacao

        @Before
        fun setUp() {
            MockitoAnnotations.openMocks(this)
        }

        @Test
        fun calcular() {
            Mockito.`when`(conta.numero1).thenReturn(5)
            Mockito.`when`(conta.numero2).thenReturn(5)
            Mockito.`when`(conta.operacao).thenReturn(operacao)
            Mockito.`when`(operacao.op).thenReturn(OperacaoEnum.SOMAR)

            val result = Calcular().calculadora(conta)
            assertThat(result).isEqualTo(10)
        }

    }