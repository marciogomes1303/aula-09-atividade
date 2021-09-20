public class agenda {
    private String nome;
    private int telefone;
    private String endereco;
    private String email;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public int getTelefone(int endereco) {
        return this.telefone;
    }

    public String getEndereco(String endereco) {
        return this.endereco;
    }

    public String getEmail(String email) {
        return this.email;
    }

    public String toString() {
        return "O nome é:" + this.nome + "O telefone é:" + this.telefone + "Endereço é:" + this.endereco
                + "E o e-mail: " + this.email;
    }
}