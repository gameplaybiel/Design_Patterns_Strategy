package br.edu.poo.cc.strategy;

public class ICMS implements Imposto{

    private double valor;

    public ICMS(double valor){
        this.valor = valor;
    }

    @Override
    public double calcularImpostos() {
        return  valor * 0.10;
    }
}
