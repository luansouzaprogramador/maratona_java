package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Luan";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Marly";
        estudante02.idade = 49;
        estudante02.sexo = 'F';

        /**
         * Ao passar objetos como argumentos voce esta passando a referência de onde ele está guardado<br>
         * Em sintese, voce passa a mesma referencia da variavel de referencia e, consequentemente, a variavel original podera ser alterada<br>
         */
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        // System.out.printf("estudante01%nNome: %s%nIdade: %d%nSexo: %c%n%n", estudante01.nome, estudante01.idade, estudante01.sexo);
        // System.out.printf("estudante02%nNome: %s%nIdade: %d%nSexo: %c%n", estudante02.nome, estudante02.idade, estudante02.sexo);

        /**
         * No exemplo abaixo, as variaveis originais estudante01 e estudante02 foram modificadas por meio do metodo
         * alteraDadosDoEstudante dentro da classe ImpressoraEstudante, uma vez que tais variaveis sao do
         * tipo referencia e ao serem alteradas dentro de algum metodo, mesmo que em outra classe, serao alteradas
         * na classe originaria onde foram criadas, pois nao passamos uma copia como argumento, e sim sua referencia,
         * ou seja, tudo que voce fizer, independentemente da classe em que o metodo esteja, afetara diretamente
         * o funcionamento da variavel original
         */
        impressora.alteraDadosDoEstudante(estudante01, estudante02);
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
