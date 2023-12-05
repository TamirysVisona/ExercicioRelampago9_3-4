import java.lang.String;
public class Funcionario extends Dados {
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;

    public Funcionario(String nome, Escolaridade nivel){
        setNome(nome);
        setEscolaridade(nivel);
    }

    public Escolaridade getEscolaridade() {
        return this.escolaridade;
    }

    public void setEscolaridade(Escolaridade nivel) {
        this.escolaridade = nivel;
    }

    public Departamento getAlocacao() {
        return this.alocacao;
    }

    public void setAlocacao(Departamento alocacao) {
        if(alocacao == null){
            throw new IllegalArgumentException("Alocacao invalida!");
        }
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return this.coordenacao;
    }

    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }
}
