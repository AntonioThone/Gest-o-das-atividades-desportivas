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

}