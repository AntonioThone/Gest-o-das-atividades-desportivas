public class Pessoa <T> {
  private String nome;
  private int dataNascimento;
  private String nacionalidade;

  public Pessoa<T>(String nome, int dataNascimento, String nacionalidade){
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.nacionalidade = nacionalidade;
  }

  
}