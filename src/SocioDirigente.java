public class SocioDirigente extends Associado {

    private List<Mandato> mandatos;

    // Construtor
    public SocioDirigente(String nome, String cpf, Endereco endereco, List<Mandato> mandatos) {
        super(nome, cpf, endereco);
        this.mandatos = mandatos;
    }

    // Getters
    public List<Mandato> getMandatos() {
        return mandatos;
    }

    // Setters
    public void setMandatos(List<Mandato> mandatos) {
        this.mandatos = mandatos;
    }

    // Métodos adicionais
    public void adicionarMandato(Mandato mandato) {
        mandatos.add(mandato);
    }

    public void removerMandato(Mandato mandato) {
        mandatos.remove(mandato);
    }

    public boolean estaEmMandato() {
        return !mandatos.isEmpty();
    }

    @Override
    public String toString() {
        return "SocioDirigente{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", endereco=" + getEndereco() +
                ", mandatos=" + mandatos +
                '}';
    }
}