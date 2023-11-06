package br.edu.poo.cc.strategy;

public class IPI implements Imposto{

    private double valor;

    public IPI(double valor){
        this.valor = valor;
    }
    @Override
    public double calcularImpostos() {
        return valor * 0.20;
    }
}
