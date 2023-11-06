package br.edu.poo.cc.strategy;

public class IPVA implements Imposto{

    private double valor;

    public IPVA(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularImpostos() {
        return valor * 0.04;
    }
}
