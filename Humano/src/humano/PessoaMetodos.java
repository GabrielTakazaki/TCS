package humano;

public class PessoaMetodos implements PessoaInterface {
    private Pessoa p = new Pessoa();
    public PessoaMetodos(String nome, int idade, float altura, float velocidade, boolean andando) {
        p.setNome(nome);
        p.setIdade(idade);
        p.setAltura(altura);
        p.setVelocidade(velocidade);
        p.setAndando(andando);
    }

    public PessoaMetodos(String nome, int idade, float altura) {
        p.setNome(nome);
        p.setIdade(idade);
        p.setAltura(altura);
        p.setVelocidade(0);
        p.setAndando(false);
    }

    @Override
    public void correr() {
        p.setVelocidade(p.getVelocidade()+1.5f);
        System.out.println("Velocidade atual:"+p.getVelocidade());
    }

    @Override
    public void andar() {
        if(p.isAndando()) {
            System.out.println("Ja esta andando");
        }
        else p.setAndando(true);
    }

    @Override
    public void parar() {
        if(p.isAndando()) {
            p.setAndando(false);
            p.setVelocidade(0);
            System.out.println("Parado");
        }
        else System.out.println("Ja esta parado");
    }

    @Override
    public void velocidadeAtual() {
        System.out.println("Sua Velocidade "+p.getVelocidade());
    }
    public void informacoes () {
        System.out.println("Nome: "+p.getNome());
        System.out.println("Idade: "+p.getIdade());
        System.out.println("Altura: "+p.getAltura());
        System.out.println("Velocidade: "+p.getVelocidade());
        System.out.println("Andando: "+p.isAndando());
    }
}
