class Livro {
    String titulo;
    int numeroPaginas;
    int anoPublicacao;
    double preco;

    public void cadastrar() {
        System.out.println("Livro cadastrado: " + titulo);
    }

    public void vender() {
        System.out.println("Livro vendido: " + titulo + " por R$" + preco);
    }

    public void reembolso() {
        System.out.println("Livro Reembolsado: " + titulo + " Valor Reembolsado: R$" + preco);
    }
}

