package br.edu.poo.cc.strategy;

public class CalculadoradeImpostos {
    public double calcularImposto(Imposto imposto){
        return imposto.calcularImpostos();
    }
}
