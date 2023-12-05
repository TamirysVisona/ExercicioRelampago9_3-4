import java.lang.String;
public class Cidade extends Dados {
    private Estado estado;

    public Cidade(String nome, Estado estado){
        setNome(nome);
        setEstado(estado);
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
