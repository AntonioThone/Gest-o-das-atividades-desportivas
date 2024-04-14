public class Campeonato {

    private Atividade atividade;
    private Date dataInicio;
    private Date dataFim;
    private List<Equipa> equipasParticipantes;
    private List<Partida> partidas;

    // Getters
    public Atividade getAtividade() {
        return atividade;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public List<Equipa> getEquipasParticipantes() {
        return equipasParticipantes;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    // Setters
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setEquipasParticipantes(List<Equipa> equipasParticipantes) {
        this.equipasParticipantes = equipasParticipantes;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    // Métodos Adicionais (exemplos)

    public void adicionarEquipa(Equipa equipa) {
        equipasParticipantes.add(equipa);
    }

    public void removerEquipa(Equipa equipa) {
        equipasParticipantes.remove(equipa);
    }

    public void adicionarPartida(Partida partida) {
        partidas.add(partida);
    }

    public void removerPartida(Partida partida) {
        partidas.remove(partida);
    }

    public boolean verificarDataValida() {
        return dataInicio.before(dataFim);
    }

    public Equipa getVencedora() {
    // Inicializar variáveis para armazenar a equipe vencedora e a maior pontuação
    Equipa equipaVencedora = null;
    int maiorPontuacao = 0;

    // Percorrer todas as equipes participantes
    for (Equipa equipa : equipasParticipantes) {
        int pontuacaoEquipa = 0;

        // Percorrer todas as partidas da equipe
        for (Partida partida : partidas) {
            if (equipa.equals(partida.getEquipaCasa()) && partida.getResultadoCasa() > partida.getResultadoVisitante()) {
                pontuacaoEquipa += 3; // Vitória da equipe da casa vale 3 pontos
            } else if (equipa.equals(partida.getEquipaVisitante()) && partida.getResultadoVisitante() > partida.getResultadoCasa()) {
                pontuacaoEquipa += 3; // Vitória da equipe visitante vale 3 pontos
            } else if (equipa.equals(partida.getEquipaCasa()) && partida.getResultadoCasa() == partida.getResultadoVisitante()) {
                pontuacaoEquipa += 1; // Empate vale 1 ponto
            }
        }

        // Atualizar a equipe vencedora e a maior pontuação se necessário
        if (pontuacaoEquipa > maiorPontuacao) {
            maiorPontuacao = pontuacaoEquipa;
            equipaVencedora = equipa;
        }
    }

    // Retornar a equipe vencedora
    return equipaVencedora;
}

}
