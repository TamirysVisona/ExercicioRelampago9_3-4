public class Departamento {

    private String nome;
    private Funcionario chefe;
    private Empresa empresa;

    public Departamento(String nome,Funcionario chefe, Empresa empresa){
        this.nome = nome;
        this.chefe = chefe;
        this.empresa = empresa;
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

    public Funcionario getChefe() {
        return this.chefe;
    }

    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
}
