public class Partida{
    private Campeonato campeonato;
    private int numeroPartida;
    private List<Equipa> equipasParticipantes;
    private Map<Equipa, Integer> posicoes;

    // Getters
    public Campeonato getCampeonato() {
    return campeonato;
    }

    public int getNumeroPartida() {
        return numeroPartida;
    }

    public List<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }

    public Map<Equipa, Integer> getPosicoes() {
        return posicoes;
    }

    //setters

    public void setCampeonato(Campeonato campeonato) {
    this.campeonato = campeonato;
    }

    public void setNumeroPartida(int numeroPartida) {
        this.numeroPartida = numeroPartida;
    }

    public void setEquipasParticipantes(List<Equipa> equipasParticipantes) {
        this.equipasParticipantes = equipasParticipantes;
    }

    public void setPosicoes(Map<Equipa, Integer> posicoes) {
        this.posicoes = posicoes;
    }

}