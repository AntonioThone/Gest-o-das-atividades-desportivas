public class Mandato {

    private SocioDirigente socioDirigente;
    private int anoInicio;
    private int anoFim;

    // Getters

    public SocioDirigente getSocioDirigente() {
        return socioDirigente;
    }

    public int getAnoInicio() {
        return anoInicio;
    }

    public int getAnoFim() {
        return anoFim;
    }

    // Setters

    public void setSocioDirigente(SocioDirigente socioDirigente) {
        this.socioDirigente = socioDirigente;
    }

    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public void setAnoFim(int anoFim) {
        this.anoFim = anoFim;
    }

    // Métodos Adicionais

    public boolean estaAtivo() {
        return Calendar.getInstance().get(Calendar.YEAR) >= anoInicio &&
                Calendar.getInstance().get(Calendar.YEAR) <= anoFim;
    }

    public int getDuracao() {
        return anoFim - anoInicio;
    }

    @Override
    public String toString() {
        return "Mandato{" +
                "socioDirigente=" + socioDirigente +
                ", anoInicio=" + anoInicio +
                ", anoFim=" + anoFim +
                '}';
    }
}
