package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca Bala";
        carro1.modelo = "Sport";
        carro1.ano = 1969;

        carro2.nome = "Mustang";
        carro2.modelo = "GT 500";
        carro2.ano = 1968;

        System.out.printf("Carro 1%nNome: %s%nModelo: %s%nAno: %d%n%n", carro1.nome, carro1.modelo, carro1.ano);
        System.out.printf("Carro 2%nNome: %s%nModelo: %s%nAno: %d%n", carro2.nome, carro2.modelo, carro2.ano);

        /**
         * No exemplo abaixo o carro1 faz referência para o mesmo espaço em memória que o carro2 está referenciando<br>
         * <b>Observação</b>: Só podemos fazer isso quando estamos trabalhando com objetos do mesmo tipo, na mesma linha de herança
         */
        carro1 = carro2;
        System.out.printf("Carro 1%nNome: %s%nModelo: %s%nAno: %d%n%n", carro1.nome, carro1.modelo, carro1.ano);
        System.out.printf("Carro 2%nNome: %s%nModelo: %s%nAno: %d%n", carro2.nome, carro2.modelo, carro2.ano);
    }
}
