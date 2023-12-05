public class Departamento extends Dados {
    private Funcionario chefe;
    private Empresa empresa;

    public Departamento(String nome,Funcionario chefe, Empresa empresa){
        setNome(nome);
        setEmpresa(empresa);
        setChefe(chefe);
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
