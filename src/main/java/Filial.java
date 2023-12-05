public class Filial extends Dados {
    private Empresa empresa;
    private Cidade cidade;

    public Filial(String nome, Empresa empresa, Cidade cidade){
        setNome(nome);
        setEmpresa(empresa);
        setCidade(cidade);
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
