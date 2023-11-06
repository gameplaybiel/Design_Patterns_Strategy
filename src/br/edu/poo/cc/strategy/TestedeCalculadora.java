package br.edu.poo.cc.strategy;
public class TestedeCalculadora {
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("| Calculadora de Impostos |");
        System.out.println("===========================\n");

        CalculadoradeImpostos calculadora = new CalculadoradeImpostos();
        ICMS icms = new ICMS(200);
        IPI ipi = new IPI(150);
        IRPF irpf = new IRPF(300);
        IRPJ irpj = new IRPJ(500);
        IPVA ipva = new IPVA(600);
        IPTU iptu = new IPTU(700);

        System.out.println("========================================================");
        System.out.println("|                 Impostos brasileiros                 |");
        System.out.println("========================================================");
        System.out.println("Aqui estão alguns tipos de impostos brasileiros.");
        System.out.println("Imposto ICMS: " + calculadora.calcularImposto(icms) + " reais");
        System.out.println("Imposto IPI: " + calculadora.calcularImposto(ipi) + " reais");
        System.out.println("Imposto IRRF: " + calculadora.calcularImposto(irpf) + " reais");
        System.out.println("Imposto IRPJ: " + calculadora.calcularImposto(irpj) + " reais");
        System.out.println("Imposto IPVA: " + calculadora.calcularImposto(ipva) + " reais");
        System.out.println("Imposto IPTU: " + calculadora.calcularImposto(iptu) + " reais");
    }
}
