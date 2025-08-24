class Cliente {
    int id;
    String nome;
    String email;
    String assinatura;

    public void cadastrar() {
        System.out.println("Cliente cadastrado: ID: " + id + " Nome: " + nome + " Email: " + email);
    }

    public void verificarAssinatura() {
        if (assinatura.equals("sim")) {
            System.out.println("Cliente: " + nome+",ID:"+id + " está com assinatura ativa.");
        } else {
            System.out.println("Cliente: " + nome+",ID:"+id + " não tem assinatura.");
        }
    }
}
