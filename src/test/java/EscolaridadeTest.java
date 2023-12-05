import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {

    @Test
    void deveRetornarAnalfabeto(){
        Escolaridade escolaridade = new Escolaridade(1);

        assertEquals("Analfabeto", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarFundamentalCompleto(){
        Escolaridade escolaridade = new Escolaridade(2);

        assertEquals("Fundamental completo", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarMedioCompleto(){
        Escolaridade escolaridade = new Escolaridade(3);

        assertEquals("Médio completo", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarSuperiorCompleto(){
        Escolaridade escolaridade = new Escolaridade(4);

        assertEquals("Superior completo", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarMestrado(){
        Escolaridade escolaridade = new Escolaridade(5);

        assertEquals("Mestrado", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarDoutorado(){
        Escolaridade escolaridade = new Escolaridade(6);

        assertEquals("Doutorado ou +", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarTecnico(){
        Escolaridade escolaridade = new Escolaridade(7);

        assertEquals("Técnico", escolaridade.getNivelTecnico());
    }

    @Test
    void deveRetornarValorInvalido(){
        try {
            Escolaridade escolaridade = new Escolaridade(0);
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Valor inválido!", e.getMessage());
        }
    }
}