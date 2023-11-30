import java.lang.String;
public class Funcionario {

    private String nome;
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Funcionario(String nome, Escolaridade escolaridade){
        this.nome = nome;
        this.escolaridade = escolaridade;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return this.alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return this.coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }
}
