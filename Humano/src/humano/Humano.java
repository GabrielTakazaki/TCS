package humano;

import java.util.Scanner;

public class Humano {

    public static void main(String[] args) {
        int opcao = 0, pessoa;
        Scanner entrada = new Scanner(System.in);
        PessoaMetodos homem = new PessoaMetodos("Vitor", 12, 1.47f, 12, true);
        PessoaMetodos mulher = new PessoaMetodos("Ana", 12, 1.50f);
        while (true) {
            System.out.println("1- Correr 2-Andar 3-Parar 4-Velocidade 5-Informacoes 6-Sair");
            opcao = Integer.parseInt(entrada.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Quem e voce? 1-Vitor 2-Ana");
                    pessoa = Integer.parseInt(entrada.nextLine());
                    if (pessoa == 1) homem.correr();
                    else if (pessoa == 2) mulher.correr();
                    break;
                case 2:
                    System.out.println("Quem e voce? 1-Vitor 2-Ana");
                    pessoa = Integer.parseInt(entrada.nextLine());
                    if (pessoa == 1) homem.andar();
                    else if (pessoa == 2) mulher.andar();
                    break;
                case 3:
                    System.out.println("Quem e voce? 1-Vitor 2-Ana");
                    pessoa = Integer.parseInt(entrada.nextLine());
                    if (pessoa == 1) homem.parar();
                    else if (pessoa == 2) mulher.parar();
                    break;
                case 4:
                    System.out.println("Quem e voce? 1-Vitor 2-Ana");
                    pessoa = Integer.parseInt(entrada.nextLine());
                    if (pessoa == 1) homem.velocidadeAtual();
                    else if (pessoa == 2) mulher.velocidadeAtual();
                    break;
                case 5:
                    System.out.println("Quem e voce? 1-Vitor 2-Ana");
                    pessoa = Integer.parseInt(entrada.nextLine());
                    if (pessoa == 1) homem.informacoes();
                    else if (pessoa == 2) mulher.informacoes();       
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
