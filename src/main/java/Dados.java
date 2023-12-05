import java.lang.String;
public class Dados {
    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome == null){
            throw new IllegalArgumentException("Nome invalido!");
        }
        this.nome = nome;
    }
}
