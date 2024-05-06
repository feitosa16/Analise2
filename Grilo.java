public class Grilo implements Ave.Cantante {
    private String nome;

    public Grilo(String nome) {
        this.nome = nome;
    }

    @Override
    public void canta() {
        System.out.println(nome + " está cricrilando!");
    }
}
