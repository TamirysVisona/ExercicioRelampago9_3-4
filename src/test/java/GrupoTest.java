import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {

    @Test
    void deveRetornarEscolaridade(){
        Grupo grupo = new Grupo(new Pais("Brasil"));
        Funcionario funcionario = new Funcionario("Ana", new Escolaridade("Doutor"));
        grupo.setPresidente(funcionario);

        assertEquals("Doutor", grupo.getPresidente().getEscolaridade().getNivelTecnico());
    }

}