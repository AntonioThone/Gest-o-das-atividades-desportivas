public abstract class Pessoa {

    private String nome;
    private String numeroBilheteIdentidade;
    private String numeroContribuinte;
    private String morada;
    private String telefone;
    private String email;

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNumeroBilheteIdentidade() {
        return numeroBilheteIdentidade;
    }

    public String getNumeroContribuinte() {
        return numeroContribuinte;
    }

    public String getMorada() {
        return morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroBilheteIdentidade(String numeroBilheteIdentidade) {
        this.numeroBilheteIdentidade = numeroBilheteIdentidade;
    }

    public void setNumeroContribuinte(String numeroContribuinte) {
        this.numeroContribuinte = numeroContribuinte;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Additional method (example)
    public String getIdentificacaoCompleta() {
        return "Nome: " + nome + "\n" +
                "Bilhete de Identidade: " + numeroBilheteIdentidade + "\n" +
                "Numero Contribuinte: " + numeroContribuinte;
    }
}
