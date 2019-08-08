package veiculos;

public abstract class Veiculos {

    private float tanqueCheio;
    private int tipo; //1- Carro 2- Moto 3-Caminhao
    private boolean chave;
    private float tanque;
    private float preco;
    private float pneu;
    private float velocidade;

    /**
     * @return the chave
     */
    public boolean isChave() {
        return chave;
    }

    /**
     * @param chave the chave to set
     */
    public void setChave(boolean chave) {
        this.chave = chave;
    }

    /**
     * @return the tanque
     */
    public float getTanque() {
        return tanque;
    }

    /**
     * @param tanque the tanque to set
     */
    public void setTanque(float tanque) {
        if (tanque > 0) {
            this.tanque = tanque;
        } else {
            this.tanque = 0;
            System.out.println("Tanque Vazio, desligando " + getModelo());
            setVelocidade(0);
            setChave(false);
        }
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the pneu
     */
    public float getPneu() {
        return pneu;
    }

    /**
     * @param pneu the pneu to set
     */
    public void setPneu(float pneu) {
        if (pneu > 0 && pneu < 10) {
            System.out.println("Compre um pneu, pneu careca");
            this.pneu = pneu;
        }
        else if (pneu <= 0) {
            System.out.println("Estourou pneu, compre um pneu, desligando" + getModelo());
            setChave(false);
        } else {
            this.pneu = pneu;
        }
    }

    /**
     * @return the velocidade
     */
    public float getVelocidade() {
        return velocidade;
    }

    /**
     * @param velocidade the velocidade to set
     */
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * @return the tipo
     */
    public String getModelo() {
        if (getTipo() == 1) {
            return "Carro";
        } else if (getTipo() == 2) {
            return "Moto";
        } else if (getTipo() == 3) {
            return "Caminhao";
        } else {
            return "Modelo Inexistente";
        }
    }

    public int getTipo() {
        return this.tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
        if (this.tipo == 1) {
            setTanqueCheio(30);
            setTanque(30);
            setVelocidade(0);
            setChave(false);
            setVelocidade(0);
            setPneu(50);
        } else if (this.tipo == 2) {
            setTanqueCheio(20);
            setTanque(20);
            setVelocidade(0);
            setChave(false);
            setVelocidade(0);
            setPneu(50);
        } else if (this.tipo == 3) {
            setTanqueCheio(40);
            setTanque(40);
            setVelocidade(0);
            setChave(false);
            setVelocidade(0);
            setPneu(50);
        }
    }

    /**
     * @return the tanqueCheio
     */
    public float getTanqueCheio() {
        return tanqueCheio;
    }

    /**
     * @param tanqueCheio the tanqueCheio to set
     */
    public void setTanqueCheio(float tanqueCheio) {
        this.tanqueCheio = tanqueCheio;
    }

}
