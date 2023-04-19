package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        /**
         * Aqui temos uma variável de referência do tipo estudante e para <b>instanciar(criar)</b> objetos sempre utilizamos a palavra <b>new</b><br>
         */

        Estudante estudante = new Estudante(); //

        /**
         * Na linha acima temos uma variável de referência do tipo estudante e um objeto do tipo estudante<br>
         * A variável de referência faz referência a um objeto e através do "nomezinho(estudante)" da variável de referência você consegue acessar os "atributos" dentro dessa classe<br>
         */

        estudante.nome = "Luan";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
        /**
         * Nesse caso será impresso o <b>endereço de memória</b> da variável de referência -> é nesse espaço em memória que o nosso objeto está alocado<br>
         */
    }
}
