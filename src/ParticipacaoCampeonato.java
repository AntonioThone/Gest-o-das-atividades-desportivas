public class ParticipacaoCampeonato {

    private Equipa equipa;
    private Campeonato campeonato;
    private int posicao;

    // Construtor
    public ParticipacaoCampeonato(Equipa equipa, Campeonato campeonato, int posicao) {
        this.equipa = equipa;
        this.campeonato = campeonato;
        this.posicao = posicao;
    }

    // Getters
    public Equipa getEquipa() {
        return equipa;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public int getPosicao() {
        return posicao;
    }

    // Setters
    public void setEquipa(Equipa equipa) {
        this.equipa = equipa;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    // Métodos adicionais
    public String getInformacao() {
        return String.format("Equipa: %s, Campeonato: %s, Posição: %d", equipa.getNome(), campeonato.getNome(), posicao);
    }

    public boolean isVencedor() {
        return posicao == 1;
    }
}
