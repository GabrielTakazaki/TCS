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
        } else {
            System.out.println("Tipo de veiculo inexistente");
        }
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
            if (getVelocidade() == 0) {
                System.out.println("Desligando " + getModelo());
                setChave(false);
            } else {
                System.out.println("Carro em movimento");
            }
        } else {
            System.out.println(getModelo() + " ja esta desligado");
        }
    }

    @Override
    public void combustivel() {
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
        if (getTanque() >= getTanqueCheio() / 2 && getTanque() < getTanqueCheio()) {
            System.out.println("Acima de meio tanque");
        } else if (getTanque() < getTanqueCheio() / 2 && getTanque() > 5) {
            System.out.println("Abaixo do meio tanque");
        } else if (getTanque() < 5) {
            System.out.println("RESERVA");
        } else if (getTanque() == 0) {
            System.out.println("Tanque vazio");
            setChave(false);
        }
        System.out.println("Tanque esta com: " + getTanque() + "litros");
    }

    @Override
    public void preco() {
        float diferenca = 0;
        if (isChave()) {
            System.out.println("Desligue o " + getModelo());
        } else {
            System.out.println("Preco do litro R$ 4,00 \nSelecione uma opcao: 1-Encher Tanque\t2-Definir um valor");
            int opcao = Integer.parseInt(leitura.nextLine());
            if (opcao == 1) {
                diferenca = getTanqueCheio() - getTanque();
                System.out.println("Valor a pagar: " + diferenca * 4);
                setTanque(getTanqueCheio());
            } else if (opcao == 2) {
                System.out.println("Quantos reais pretende gastar: ");
                float pagamento = Float.parseFloat(leitura.nextLine());
                diferenca = pagamento / 4;
                if ((getTanque() + diferenca) > getTanqueCheio()) {
                    diferenca = getTanqueCheio() - getTanque();
                    setTanque(getTanqueCheio());
                    System.out.println("Foi abastecido " + diferenca);
                    System.out.println("Seu tanque ficou cheio e seu troco e: " + (pagamento - (diferenca * 4)));
                } else {
                    System.out.println("Foi abastecido: " + diferenca);
                    setTanque(getTanque() + diferenca);
                }
            }
        }
    }

    @Override
    public void pneu() {
        if (isChave()) {
            System.out.println("Desligue o "+getModelo());
        }
        else {
            System.out.println("Preco do pneu novo: R$100,00\n"
                    + "Pneu usado, metade do preco e desgastado na metade: R$50,00");
            System.out.println("1- Comprar pneu novo\t2- Comprar desgastado\t3- Sair");
            int op = Integer.parseInt(leitura.nextLine());
            if (op == 1) {
                System.out.println("Pague R$ 100,00");
                setPneu(50);
            }
            if (op == 2) {
                System.out.println("Pague R$ 50,00");
                setPneu(25);
            } 
        }
    }

    @Override
    public void acelerar() {
        int valor = 0;
        if (isChave()) {
            while (valor != 3) {
                System.out.println("1- Aumentar a velocidade\n2- Diminuir a velocidade\n3- Sair");
                valor = Integer.parseInt(leitura.nextLine());
                if (valor == 1 && getTanque() > 0) {
                    setVelocidade(getVelocidade() + 10);
                    setTanque(getTanque() - getVelocidade() / 10);
                    if (getTanque() <= 0) {
                        valor = 3;
                    } else {
                        System.out.println("Sua velocidade e: " + getVelocidade() + "km/h");
                        setPneu(getPneu() - getVelocidade() / 20);
                    }
                } else if (valor == 2) {
                    if (getVelocidade() > 0) {
                        setVelocidade(getVelocidade() - 10);
                        System.out.println("Sua velocidade e: " + getVelocidade() + "km/h");
                    } else {
                        System.out.println(getModelo() + " esta parado");
                    }
                }
            }
        } else {
            System.out.println(getModelo() + " esta desligado");
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
        System.out.println("Para encher o tanque e necessario R$" + ((getTanqueCheio() - getTanque()) * 4));
        System.out.println("Gasto do pneu: " + getPneu());
        System.out.println("Velocidade: " + getVelocidade() + "km/h");
    }
}
