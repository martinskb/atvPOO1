public class ProjetoLivraria {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.titulo = "Senhor dos Mistérios, Vol. 1: O Palhaço, Parte 1";
        livro1.numeroPaginas = 580;
        livro1.anoPublicacao = 2025;
        livro1.preco = 137;

        livro2.titulo = "O Ponto de Vista do Leitor, Vol. 1";
        livro2.numeroPaginas = 260;
        livro2.anoPublicacao = 2025;
        livro2.preco = 93;

        System.out.println("Livro1: " + livro1.titulo + " - " + livro1.preco);
        System.out.println("Livro2: " + livro2.titulo + " - " + livro2.preco);

        livro1.cadastrar();
        livro2.vender();
    }
}
