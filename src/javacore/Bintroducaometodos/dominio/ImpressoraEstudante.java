package javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    private int i=1;
    public void imprime(Estudante estudante) {
        System.out.printf("%do estudante%nNome: %s%nIdade: %d%nSexo: %c%n%n", i, estudante.nome, estudante.idade, estudante.sexo);
        i++;
    }

    public void alteraDadosDoEstudante(Estudante estudante01, Estudante estudante02) {
        estudante01.nome = "Milena";
        estudante01.idade = 21;
        estudante01.sexo = 'F';

        estudante02.nome = "Aira";
        estudante02.idade = 18;
        estudante02.sexo = 'F';
    }
}
