import java.lang.String;
public class Escolaridade {
    private String nivelTecnico;

    public Escolaridade(int nivelTecnico){
        setNivelTecnico(nivelTecnico);
    }

    public String getNivelTecnico() {
        return this.nivelTecnico;
    }

    public void setNivelTecnico(int nivel) {
        switch (nivel){
            case 1:
                this.nivelTecnico = "Analfabeto";
                break;
            case 2:
                this.nivelTecnico = "Fundamental completo";
                break;
            case 3:
                this.nivelTecnico = "Médio completo";
                break;
            case 4:
                this.nivelTecnico = "Superior completo";
                break;
            case 5:
                this.nivelTecnico = "Mestrado";
                break;
            case 6:
                this.nivelTecnico = "Doutorado ou +";
                break;
            case 7:
                this.nivelTecnico = "Técnico";
            default:
                throw new IllegalArgumentException("Valor inválido!");
        }
    }
}

/*OBS: Nível 1 - Analfabeto
       Nível 2 - Fundamental completo
       Nível 3 - Médio completo
       Nível 4 - Superior completo
       Nível 5 - Mestrado
       Nível 6 - Doutorado +
       Nivel 7 - Técnico
 */
