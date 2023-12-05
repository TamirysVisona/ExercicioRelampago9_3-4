import java.lang.String;
public class Estado extends Dados {
    private Pais pais;

    public Estado (String nome, Pais pais){
        setNome(nome);
        this.pais = pais;
    }
}
