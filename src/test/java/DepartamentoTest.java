import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {
    @Test
    void deveRetornarEscolaridadeChefe(){
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("Minas Gerais", pais);
        Cidade cidade = new Cidade("Juiz de Fora", estado);

        Funcionario funcionarioPresidente = new Funcionario("Luiz", new Escolaridade(6));
        Grupo grupo = new Grupo("Grupo 1", funcionarioPresidente, pais);

        Funcionario funcionarioDiretor = new Funcionario("Ana", new Escolaridade(5));
        Empresa empresa = new Empresa("Empresa", grupo, funcionarioDiretor);

        Funcionario funcionarioChefe = new Funcionario("Maria", new Escolaridade(4));
        Departamento departamento = new Departamento("Financeiro", funcionarioChefe, empresa);

        assertEquals("Superior completo", departamento.getChefe().getEscolaridade().getNivelTecnico());
    }

}