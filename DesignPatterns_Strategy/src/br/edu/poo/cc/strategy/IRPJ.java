package br.edu.poo.cc.strategy;

public class IRPJ implements Imposto{

    private double valor;

    public IRPJ(double valor){
        this.valor = valor;
    }
    @Override
    public double calcularImpostos() {
        return valor * 0.15;
    }
}
