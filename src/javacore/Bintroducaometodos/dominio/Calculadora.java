package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    /**
     * Abaixo temos a declaração de dois métodos públicos sem retorno e sem parâmetros<br>
     */
    public void somaDoisNumeros() {
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21-2);
    }

    /**
     * A seguir temos a declaração de um método público sem retorno e com dois parâmetros inteiros<br>
     */
    public void multiplicaDoisNumeros(int n1, int n2) {
        System.out.println(n1 * n2);
        /**
         * n1 e n2 são parâmetros
         */
    }

    /**
     * A seguir temos a declaração de um método público com retorno (double) e com dois parâmetros inteiros<br>
     */
    public double divideDoisNumeros(double n1, double n2) {
        if (n2 == 0)
            return 0;

        return n1/n2;
    }

    /**
     * Outras formas de fazer o mesmo método acima<br>
     */

    public double divideDoisNumeros02(double n1, double n2) {
        if (n2!=0) {
            return n1/n2;
        }
        return 0;

        /*
        if (n2!=0) {
            return n1/n2;
        } else {
            return 0;
        }
        */
    }

    public void imprimeDivisaoDeDoisNumeros(double n1, double n2) {
        if (n2==0) {
            System.out.println("Nao existe divisao por zero");
        } else {
            System.out.println(n1/n2);
        }
    }
    public void imprimeDivisaoDeDoisNumeros02(double n1, double n2) {
        /**
         * O return nesse caso funciona como um break para o tipo void
         */
        if (n2==0) {
            System.out.println("Nao existe divisao por zero");
            return;
        }
        System.out.println(n1/n2);

        /*
        if (n2==0) {
            System.out.println("Nao existe divisao por zero");
            return;
        } else {
            System.out.println(n1/n2);
        }
        */
    }

    public void alteraDoisNumeros(int n1, int n2) {
        n1 = 99;
        n2 = 33;
        System.out.printf("Dentro do alteraDoisNumeros%nn1 = %d%nn2 = %d%n", n1, n2);
    }
}
