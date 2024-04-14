public class Associado {

  private String nome;
  private int numeroSocio;
  private String numeroBilheteIdentidade;
  private String numeroContribuinte;
  private String morada;
  private String telefone;
  private String email;
  private TipoSocio tipoSocio;
  private Date dataInscricao;
  private List<InscricaoAtividade> inscricoesAtividade;
  private List<Quota> quotas;

  // Getters
  public String getNome() {
    return nome;
  }

  public int getNumeroSocio() {
    return numeroSocio;
  }

  public String getNumeroBilheteIdentidade() {
    return numeroBilheteIdentidade;
  }

  public String getNumeroContribuinte() {
    return numeroContribuinte;
  }

  public String getMorada() {
    return morada;
  }

  public String getTelefone() {
    return telefone;
  }

  public String getEmail() {
    return email;
  }

  public TipoSocio getTipoSocio() {
    return tipoSocio;
  }

  public Date getDataInscricao() {
    return dataInscricao;
  }

  public List<InscricaoAtividade> getInscricoesAtividade() {
    return inscricoesAtividade;
  }

  public List<Quota> getQuotas() {
    return quotas;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNumeroSocio(int numeroSocio) {
    this.numeroSocio = numeroSocio;
  }

  public void setNumeroBilheteIdentidade(String numeroBilheteIdentidade) {
    this.numeroBilheteIdentidade = numeroBilheteIdentidade;
  }

  public void setNumeroContribuinte(String numeroContribuinte) {
    this.numeroContribuinte = numeroContribuinte;
  }

  public void setMorada(String morada) {
    this.morada = morada;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTipoSocio(TipoSocio tipoSocio) {
    this.tipoSocio = tipoSocio;
  }

  public void setDataInscricao(Date dataInscricao) {
    this.dataInscricao = dataInscricao;
  }

  // Additional methods (consider these examples)
  public boolean estaEmDiaComAsQuotas() {
    // Implement logic to check if quotas are up-to-date
    return true; // Replace with actual logic
  }

  public String obterDadosParaCartao() {
    return String.format("%s (%d)", nome, numeroSocio);
  }
}
