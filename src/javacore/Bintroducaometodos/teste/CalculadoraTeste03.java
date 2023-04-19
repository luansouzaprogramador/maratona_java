package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.divideDoisNumeros(20, 2));

        double resultado = calculadora.divideDoisNumeros02(20, 2);
        System.out.println(resultado);

        calculadora.imprimeDivisaoDeDoisNumeros(20, 2);
        calculadora.imprimeDivisaoDeDoisNumeros02(20, 2);
    }
}
