package facul.tests.calc;

import java.util.List;

public class Calcs {

    public Calcs() {
    }

    public static Integer soma(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static Integer subtracao(Integer num1, Integer num2) {
        return num1 - num2;
    }

    public static Integer multiplicacao(Integer num1, Integer num2) {
        return num1 * num2;
    }

    public static Integer divisao(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return num1 / num2;
    }

    public static Boolean parOuImpar(Integer num1) {
        return num1 % 2 == 0;
    }

    public static Integer calcularFatorial(Integer num1) {
        if (num1 == 0 || num1 == 1) {
            return 1;
        }
        return num1 * calcularFatorial(num1 - 1);
    }

    public static Double calcularMediaPonderada(List<Double> notas, List<Double> pesos) {
        if (notas.size() != pesos.size()) {
            throw new IllegalArgumentException("Listas de notas e pesos devem ter o mesmo tamanho!");
        }
        double somaNotas = 0;
        double somaPesos = 0;
        for (int i = 0; i < notas.size(); i++) {
            somaNotas += notas.get(i) * pesos.get(i);
            somaPesos += pesos.get(i);
        }
        return somaNotas / somaPesos;
    }

    public static List<Integer> ordenarNumeros(List<Integer> lista) {
        lista.sort((a, b) -> a - b);
        return lista;
    }

    public static Double calcularPotencia(Double base, Double expoente) {
        if (expoente == 0) {
            return 1.0;
        } else if (expoente % 2 == 0) {
            double temp = calcularPotencia(base, expoente / 2);
            return temp * temp;
        } else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }

    public static Integer gerarNumeroAleatorio(Integer min, Integer max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static Integer encontrarMenorNumero(List<Integer> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia!");
        }
        int menor = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < menor) {
                menor = lista.get(i);
            }
        }
        return menor;
    }
}

