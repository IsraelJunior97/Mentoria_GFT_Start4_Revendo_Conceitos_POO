package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("Rua funcionario",
                "Complemento funicionario","Bairro funcionario"); // Pedir computador abrir um espaço de memória;


        System.out.println("-----");

        Vendedor vendedor =new Vendedor();

        vendedor.setNome("Israel");
        vendedor.setDocumento("15454464");
        vendedor.setValorSalario(1000d);
        vendedor.setEndereco(endereco);
        vendedor.calculaBonificacao(2d);
        System.out.println(vendedor);

        System.out.println("------");

        OperadorDeCaixa operadorDeCaixa = new OperadorDeCaixa("Israel op Caixa","745411213",2000d,endereco);
        System.out.println(operadorDeCaixa);

        System.out.println("------");

        Gerente gerente = new Gerente();

        gerente.setNome("Camila Gerente");
        gerente.setDocumento("456.123.789-00");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(3d);

        System.out.println(gerente);

        System.out.println("------");




    }
}
