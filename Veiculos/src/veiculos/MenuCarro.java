package veiculos;

import java.util.Scanner;

public class MenuCarro {
    public static void main(String args[]) {
        Scanner leitura = new Scanner (System.in);
        VeiculosFuncao metodos = new VeiculosFuncao();
        int valor = 10;
        metodos.cadastro();
        while (valor!= 0) {
            System.out.println("Selecione uma opcao");
            System.out.println("0-Sair\n1-Ligar Veiculo\n2-Desligar Veiculo\n3-Ver Tanque\n"
                    + "4-Acelerar ou Desacelerar Veiculo\n5-Status Geral\n");
            valor = Integer.parseInt(leitura.next());
            if (valor == 1) {
                metodos.ligar();
            }
            if (valor == 2) {
                metodos.desligar();
            }
            if (valor == 3) {
                metodos.combustivel();
            }
            if (valor == 4) {
                metodos.acelerar();
            }
            if (valor == 5){
                metodos.status();
            }
        }
    }
}
