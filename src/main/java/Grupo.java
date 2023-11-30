public class Grupo {

    private Funcionario presidente;
    private Pais sede;

    public Grupo(Pais sede){
        this.sede = sede;
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
