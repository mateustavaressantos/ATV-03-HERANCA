public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("Diário de um Banana", 44.99F, "Jeff Kinney", 217, true);
        Camisa camisa = new Camisa("Camisa do JEC", 99.99F, "Preta", "GG", "Modal");

        livro.exibirInfo();
        camisa.exibirInfo();
    }
}