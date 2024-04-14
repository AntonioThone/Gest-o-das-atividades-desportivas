public class Atividade {

    private String nome;
    private String espaco;
    private SocioDirigente responsavel;

    // Construtor
    public Atividade(String nome, String espaco, SocioDirigente responsavel) {
        this.nome = nome;
        this.espaco = espaco;
        this.responsavel = responsavel;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEspaco() {
        return espaco;
    }

    public SocioDirigente getResponsavel() {
        return responsavel;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspaco(String espaco) {
        this.espaco = espaco;
    }

    public void setResponsavel(SocioDirigente responsavel) {
        this.responsavel = responsavel;
    }

    // Métodos adicionais
    public String exibirDetalhes() {
        return "Nome: " + nome + "\nEspaço: " + espaco + "\nResponsável: " + responsavel.getNome();
    }

    public boolean verificarResponsavel(SocioDirigente socioDirigente) {
        return socioDirigente.equals(responsavel);
    }

    // Método toString() para formatação de impressão
    @Override
    public String toString() {
        return "Atividade{" +
                "nome='" + nome + '\'' +
                ", espaco='" + espaco + '\'' +
                ", responsavel=" + responsavel +
                '}';
    }
}
