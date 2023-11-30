import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarEscolaridadeChefe(){
        Funcionario funcionario = new Funcionario("Ana", new Escolaridade("Mestre"));
        Departamento departamento = new Departamento("Financeiro", new Empresa("Empresa", new Grupo(new Pais("Brasil")), funcionario));
        departamento.setChefe(funcionario);

        assertEquals("Mestre", funcionario.getEscolaridade().getNivelTecnico());
    }

}
