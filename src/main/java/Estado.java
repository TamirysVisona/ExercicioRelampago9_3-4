import java.lang.String;
public class Estado {
    private String nome;
    private Pais pais;

    public Estado (String nome){
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
