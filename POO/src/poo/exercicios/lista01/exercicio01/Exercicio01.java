package poo.exercicios.lista01.exercicio01;

import java.util.Scanner;


public class Exercicio01 {
    public static void main(String[] args) {
        int opcao = 0;
        Pessoa p = new Pessoa();

        Scanner teclado = new Scanner(System.in);
        while (opcao != 3) {            
            System.out.println("Menu:");
            System.out.println("1 - Criar Pessoa");
            System.out.println("2 - Mostrar Pessoa");
            System.out.println("3 - Sair");
            System.out.println("Escolha a opção desejada:");
            opcao = Integer.parseInt(teclado.nextLine());
            switch (opcao) {
                case 1:
                    //1 - Criar Pessoa
                    System.out.println("Digite o CPF");
                    p.setCpf(teclado.nextLine());
                    System.out.println("Digite o nome");
                    p.setNome(teclado.nextLine());
                    System.out.println("Digite o caracter do sexo");
                    p.setSexo(teclado.nextLine().charAt(0));
                    System.out.println("Digite a idade");
                    p.setIdade(Integer.parseInt(teclado.nextLine()));

                    break;
                case 2:
                    //2 - Mostrar Pessoa
                    System.out.println(p.imprimir());
                    break;
                case 3:
                    System.out.println("O sistema será fechado");
                    break;
                default:
                    System.out.println("Opção Inválida");
            }
        }
        teclado.close();
        
    }
}
