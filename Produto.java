public class Produto {
    protected String nome;
    protected float preco;

    public Produto(String nome, Float preco){
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo(){
        System.out.println("Nome: "+ nome);
        System.out.println("Preço: "+ preco);
    }
}