package br.edu.poo.cc.strategy;

public class IPTU implements Imposto{

    private double valor;

    public IPTU(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularImpostos() {
        return valor * 0.03;
    }
}
