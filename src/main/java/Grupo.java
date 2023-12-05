public class Grupo extends Dados {
    private Funcionario presidente;
    private Pais sede;

    public Grupo(String nome, Funcionario presidente, Pais sede){
        setNome(nome);
        setPresidente(presidente);
        setSede(sede);
    }

    public Funcionario getPresidente() {
        return this.presidente;
    }

    public void setPresidente(Funcionario presidente) {
        this.presidente = presidente;
    }

    public Pais getSede() {
        return this.sede;
    }

    public void setSede(Pais sede) {
        this.sede = sede;
    }
}
