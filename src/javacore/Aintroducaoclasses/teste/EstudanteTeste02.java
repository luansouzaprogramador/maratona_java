package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        /**
         * Podemos criar um objeto sem nenhuma variável de referência, porém não conseguiremos acessar os atributos desse objeto, uma vez que ele não tem nenhuma variável de referência apontando para ele<br>
         */
        new Estudante();

        /**
         * Ao criar um atributo diretamente numa classe, tem-se os <b>valores de inicialização padrão</b> aplicados a ele, ou seja, você pode utilizar mesmo que não tenha sido inicializado.<br>
         * Entretando, se utilizarmos o nome para fazer alguma coisa com ele teremos uma exceção, porque não tem nenhum objeto sendo referenciado pela variável de referência nome que é uma String<br>
         */
        Estudante estudante = new Estudante();
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante.nome);
    }
}
