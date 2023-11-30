public class Empresa {
    private String nome;
    private Grupo grupo;
    private Funcionario diretor;

    public Empresa(String nome, Grupo grupo, Funcionario funcionario){
        this.nome = nome;
        this.grupo = grupo;
        this.diretor = funcionario;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
