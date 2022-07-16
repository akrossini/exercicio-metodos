package basecamp;

import org.w3c.dom.ls.LSOutput;

public class Métodos {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Calculadora - exercício:");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,2.7);
        Calculadora.multiplicacao(4,8);
        Calculadora.divisao(1,5);

        //Mensagem
        System.out.println("Mensagem - exercício:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(3);

        //Empréstimo
        System.out.println("Empréstimo - exercício:");
        Empréstimo.calcular(1000, Empréstimo.getDuasParcelas());
        Empréstimo.calcular(1000, Empréstimo.getTresParcelas());
        Empréstimo.calcular(1000, 5);
        Empréstimo.calcular(1000, 2);

    }
}
