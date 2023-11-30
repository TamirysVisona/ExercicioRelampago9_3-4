public class Filial {
    private String nome;
    private Empresa empresa;
    private Cidade cidade;

    public Filial(String nome, Cidade cidade){
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Empresa getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cidade getCidade() {
        return this.cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
}
