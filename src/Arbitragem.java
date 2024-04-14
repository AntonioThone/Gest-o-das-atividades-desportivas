public class Arbitragem {

    private Campeonato campeonato;
    private List<SocioDirigente> arbitros;

    // Construtor
    public Arbitragem(Campeonato campeonato) {
        this.campeonato = campeonato;
        this.arbitros = new ArrayList<>();
    }

    // Getters
    public Campeonato getCampeonato() {
        return campeonato;
    }

    public List<SocioDirigente> getArbitros() {
        return arbitros;
    }

    // Setters
    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    public void setArbitros(List<SocioDirigente> arbitros) {
        this.arbitros = arbitros;
    }

    // Métodos Adicionais
    public void adicionarArbitro(SocioDirigente arbitro) {
        if (!arbitros.contains(arbitro)) {
            arbitros.add(arbitro);
        }
    }

    public void removerArbitro(SocioDirigente arbitro) {
        arbitros.remove(arbitro);
    }

    public boolean isArbitroEscalado(SocioDirigente arbitro, Partida partida) {
        if (partida.getArbitro() == null) {
            return false;
        }
        return partida.getArbitro().equals(arbitro);
    }

    public List<Partida> getPartidasArbitradasPor(SocioDirigente arbitro) {
        List<Partida> partidasArbitradas = new ArrayList<>();
        for (Partida partida : campeonato.getPartidas()) {
            if (isArbitroEscalado(arbitro, partida)) {
                partidasArbitradas.add(partida);
            }
        }
        return partidasArbitradas;
    }
}
