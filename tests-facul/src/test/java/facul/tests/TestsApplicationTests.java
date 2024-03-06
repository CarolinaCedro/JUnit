package facul.tests;

import facul.tests.calc.Calcs;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CalcsTest {

    @Test
    void somaTest() {
        assertEquals(5, Calcs.soma(2, 3));
        assertEquals(-1, Calcs.soma(-2, 1));
    }

    @Test
    void subtracaoTest() {
        assertEquals(5, Calcs.subtracao(8, 3));
        assertEquals(-3, Calcs.subtracao(5, 8));
    }

    @Test
    void multiplicacaoTest() {
        assertEquals(15, Calcs.multiplicacao(3, 5));
        assertEquals(-12, Calcs.multiplicacao(3, -4));
    }

    @Test
    void divisaoTest() {
        assertEquals(2, Calcs.divisao(6, 3));
        assertThrows(ArithmeticException.class, () -> Calcs.divisao(6, 0));
    }

    @Test
    void parOuImparTest() {
        assertTrue(Calcs.parOuImpar(4));
        assertFalse(Calcs.parOuImpar(7));
    }

    @Test
    void calcularFatorialTest() {
        assertEquals(6, Calcs.calcularFatorial(3));
        assertEquals(1, Calcs.calcularFatorial(0));
    }

    @Test
    void calcularMediaPonderadaTest() {
        List<Double> notas = Arrays.asList(5.0, 7.0, 8.0);
        List<Double> pesos = Arrays.asList(2.0, 3.0, 1.0);
        double resultadoAtual = Calcs.calcularMediaPonderada(notas, pesos);
        double resultadoEsperado = 6.5;

        // Arredonda o resultado atual para duas casas decimais
        resultadoAtual = Math.round(resultadoAtual * 100.0) / 100.0;

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    void ordenarNumerosTest() {
        List<Integer> lista = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));
        List<Integer> listaOrdenada = Calcs.ordenarNumeros(lista);
        assertEquals(Arrays.asList(1, 1, 2, 3, 4, 5, 6, 9), listaOrdenada);
    }

    @Test
    void calcularPotenciaTest() {
        assertEquals(8.0, Calcs.calcularPotencia(2.0, 3.0));
        assertEquals(1.0, Calcs.calcularPotencia(5.0, 0.0));
    }

    @Test
    void gerarNumeroAleatorioTest() {
        int numeroAleatorio = Calcs.gerarNumeroAleatorio(1, 100);
        assertTrue(numeroAleatorio >= 1 && numeroAleatorio <= 100);
    }

    @Test
    void encontrarMenorNumeroTest() {
        List<Integer> lista = Arrays.asList(8, 4, 6, 2, 7, 3);
        assertEquals(2, Calcs.encontrarMenorNumero(lista));
    }
}
