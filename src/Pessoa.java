public class Pessoa <T> {
  private String nome;
  private int dataNascimento;
  private String nacionalidade;

  public Pessoa<T>(String nome, int dataNascimento, String nacionalidade){
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.nacionalidade = nacionalidade;
  }

  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public int getDataNascimento(){
    return dataNascimento;
  }
  public void setDataNascimento(int dataNascimento){
    this.dataNascimento = dataNascimento;
  }

  public String getNacionalidade(){
    return nacionalidade;
  }
  public void setNacionalidade(String nacionalidade){
    this.nacional = nacionalidade;
  }

}