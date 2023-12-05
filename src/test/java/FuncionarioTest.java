import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPaisAlocacao(){
        Funcionario funcionarioPresidente = new Funcionario("Luiz", new Escolaridade(6));
        Grupo grupo = new Grupo("Grupo 1", funcionarioPresidente, new Pais("Brasil"));

        Funcionario funcionarioDiretor = new Funcionario("Ana", new Escolaridade(5));
        Empresa empresa = new Empresa("Empresa", grupo, funcionarioDiretor);

        Funcionario funcionarioChefe = new Funcionario("Maria", new Escolaridade(5));
        Departamento departamento = new Departamento("Financeiro", funcionarioChefe, empresa);

        Funcionario funcionario = new Funcionario("Joao", new Escolaridade(1));
        funcionario.setAlocacao(departamento);

        assertEquals("Brasil", funcionario.getAlocacao().getEmpresa().getGrupo().getSede().getNome());
    }
}