public class ListaPaginada<T> {

  private List<T> elementos;
  private int paginaAtual;
  private int totalPaginas;
  private int totalElementos;

  // Getters
  public List<T> getElementos() {
    return elementos;
  }

  public int getPaginaAtual() {
    return paginaAtual;
  }

  public int getTotalPaginas() {
    return totalPaginas;
  }

  public int getTotalElementos() {
    return totalElementos;
  }

  // Setters
  public void setElementos(List<T> elementos) {
    this.elementos = elementos;
  }

  public void setPaginaAtual(int paginaAtual) {
    if (paginaAtual <= 0 || paginaAtual > totalPaginas) {
      throw new IllegalArgumentException("Página inválida");
    }
    this.paginaAtual = paginaAtual;
  }

  public void setTotalPaginas(int totalPaginas) {
    this.totalPaginas = totalPaginas;
  }

  public void setTotalElementos(int totalElementos) {
    this.totalElementos = totalElementos;
  }