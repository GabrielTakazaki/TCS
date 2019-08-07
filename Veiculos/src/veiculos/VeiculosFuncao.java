package veiculos;

import java.util.Scanner;

public class VeiculosFuncao extends Veiculos implements Automovel {

    Scanner leitura = new Scanner(System.in);

    @Override
    public void cadastro() {
        System.out.println("Cadastro de veiculo");
        System.out.println("Digite 1-Carro 2-Moto 3-Caminhao");
        int tipo = Integer.parseInt(leitura.nextLine());
        if (tipo > 0 && tipo < 4) {
            setTipo(tipo);
            System.out.println("Veiculo cadastrado");
        }else System.out.println("Tipo de veiculo inexistente"); 
    }

    @Override
    public void ligar() {
        if (isChave()) {
            System.out.println(getModelo() + " ja esta ligado");
        } else {
            System.out.println("Ligando " + getModelo());
            setChave(true);
            setTanque(getTanque() - 0.1f);
        }
    }

    @Override
    public void desligar() {
        if (isChave()) {
            System.out.println("Desligando " + getModelo());
            setChave(false);
        } else {
            System.out.println(getModelo() + " ja esta desligado");
        }
    }

    @Override
    public float combustivel() {
        if (getTipo() == 1) {
            if (getTanque() == 30) {
                System.out.println("Tanque cheio");
            }
        } else if (getTipo() == 2) {
            if (getTanque() == 20) {
                System.out.println("Tanque cheio");
            }
        } else if (getTipo() == 3) {
            if (getTanque() == 40) {
                System.out.println("Tanque cheio");
            }
        }
        if (getTanque() >= getTanque() / 2) {
            System.out.println("Acima de meio tanque");
        } else if (getTanque() > 5) {
            System.out.println("Abaixo do meio tanque");
        } else if (getTanque() > 0) {
            System.out.println("RESERVA");
        } else if (getTanque() == 0) {
            System.out.println("Tanque vazio");
            System.out.println("Desligando carro");
            setChave(false);
        }
        return getTanque();
    }

    @Override
    public float preco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float pneu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void acelerar() {
        int valor = 0;
        while (valor != 3) {
            System.out.println("1- Aumentar a velocidade\n2- Diminuir a velocidade\n3- Sair");
            valor = Integer.parseInt(leitura.nextLine());
            if (valor == 1) {
                setVelocidade(getVelocidade() + 10);
                System.out.println("Sua velocidade e: " + getVelocidade() + "km/h");
            } else if (valor == 2) {
                if (getVelocidade() > 0) {
                    setVelocidade(getVelocidade() - 10);
                    System.out.println("Sua velocidade e: " + getVelocidade() + "km/h");
                } else {
                    System.out.println("Carro esta parado");
                }
            }
        }
    }

    @Override
    public void status() {
        if (isChave()) {
            System.out.println(getModelo() + " esta ligado");
        } else {
            System.out.println(getModelo() + " esta desligado");
        }
        System.out.println("Tanque esta com: " + getTanque() + "l");
        System.out.println("Gasto do pneu: " + getPneu());
        System.out.println("Velocidade: " + getVelocidade() + "km/h");
    }
}
