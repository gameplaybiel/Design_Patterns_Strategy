package br.edu.poo.cc.strategy;

public class IRPF implements Imposto{
    private double valor;

    public IRPF(double valor){
        this.valor = valor;
    }
    @Override
    public double calcularImpostos() {
        return this.valor * 0.25;
    }
}