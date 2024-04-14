public class Equipa {

    private String nome;
    private String mascote;
    private List<Associado> membros;
    private List<ParticipacaoCampeonato> participacoesCampeonato;

    // Getter para o nome
    public String getNome() {
        return nome;
    }

    // Setter para o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para a mascote
    public String getMascote() {
        return mascote;
    }

    // Setter para a mascote
    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    // Getter para a lista de membros
    public List<Associado> getMembros() {
        return membros;
    }

    // Setter para a lista de membros
    public void setMembros(List<Associado> membros) {
        this.membros = membros;
    }

    // Getter para a lista de participações em campeonatos
    public List<ParticipacaoCampeonato> getParticipacoesCampeonato() {
        return participacoesCampeonato;
    }

    // Setter para a lista de participações em campeonatos
    public void setParticipacoesCampeonato(List<ParticipacaoCampeonato> participacoesCampeonato) {
        this.participacoesCampeonato = participacoesCampeonato;
    }
}
