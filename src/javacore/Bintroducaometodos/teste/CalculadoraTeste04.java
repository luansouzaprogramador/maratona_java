package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int n1 = 1, n2 = 2;

        calculadora.alteraDoisNumeros(n1, n2);
        System.out.printf("Dentro do calculadoraTeste04%nn1 = %d%nn2 = %d%n", n1, n2);

        /**
         * Quando passamos valores do tipo primitivo para um metodo nao estamos passando a referencia desse objeto
         * em memoria, estamos fazendo uma copia e, consequentemente, a variavel original nunca sera alterada
         */
    }
}
