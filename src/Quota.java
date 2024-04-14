public class Quota {

    private Associado socio;
    private int ano;
    private boolean pago;

    // Getters
    public Associado getSocio() {
        return socio;
    }

    public int getAno() {
        return ano;
    }

    public boolean isPago() {
        return pago;
    }

    // Setters
    public void setSocio(Associado socio) {
        this.socio = socio;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    // Métodos adicionais (exemplos)

    public void marcarComoPago() {
        setPago(true);
    }

    public void verificarPagamento() {
        if (isPago()) {
            System.out.println("Quota paga para o ano " + getAno());
        } else {
            System.out.println("Quota pendente para o ano " + getAno());
        }
    }
}
