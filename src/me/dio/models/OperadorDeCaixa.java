package me.dio.models;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa() {
    }

    public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
        super(nome, documento, valorSalario, endereco);
    }


    @Override // sobreescrever o método to string
    public String toString() {
        return "operadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", valorSalario=" + valorSalario +
                ", endereco=" + endereco.getRua() +
                '}';
    }
}


