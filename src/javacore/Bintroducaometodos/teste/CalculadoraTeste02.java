package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        /**
         * O método multiplicaDoisNumeros precisa de dois argumentos para ser executado
         */

        calculadora.multiplicaDoisNumeros(2, 3);
        /**
         * 2 e 3 são argumentos
         */
    }
}
