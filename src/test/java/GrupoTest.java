import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    @Test
    void deveRetornarEscolaridadePresidente(){
        Funcionario funcionario = new Funcionario("Ana", new Escolaridade(5));
        Grupo grupo = new Grupo("Grupo 1", funcionario, new Pais("Brasil"));
        grupo.setPresidente(funcionario);

        assertEquals("Mestrado", grupo.getPresidente().getEscolaridade().getNivelTecnico());
    }

}