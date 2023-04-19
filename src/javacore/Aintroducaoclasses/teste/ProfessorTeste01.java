package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Luciana";
        professor.idade = 40;
        professor.sexo = 'F';

        System.out.printf("Nome: %s%nIdade: %d%nSexo: %c%n", professor.nome, professor.idade, professor.sexo);
    }
}
