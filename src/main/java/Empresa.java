public class Empresa extends Dados {
    private Grupo grupo;
    private Funcionario diretor;

    public Empresa(String nome, Grupo grupo, Funcionario diretor){
        setNome(nome);
        setGrupo(grupo);
        setDiretor(diretor);
    }

    public Grupo getGrupo() {
        return this.grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Funcionario getDiretor() {
        return this.diretor;
    }

    public void setDiretor(Funcionario diretor) {
        this.diretor = diretor;
    }
}
