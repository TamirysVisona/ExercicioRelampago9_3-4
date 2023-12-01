import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarPais(){
        Funcionario funcionario = new Funcionario("Ana", new Escolaridade("Graduada"));
        Departamento departamento = new Departamento("Financeiro", funcionario, new Empresa("Empresa", new Grupo(new Pais("Brasil")), funcionario));
        funcionario.setAlocacao(departamento);

        assertEquals("Brasil", funcionario.getAlocacao().getEmpresa().getGrupo().getSede().getNome());
    }

    @Test
    void deveRetornarEstadoFilial(){
        Funcionario funcionario = new Funcionario("Ana", new Escolaridade("Graduado"));
        Filial filial = new Filial("Filial 1", new Empresa("Empresa", new Grupo(new Pais("Brasil")), funcionario),new Cidade("Juiz de Fora", new Estado("Minas Gerais")));
        funcionario.setCoordenacao(filial);

        assertEquals("Minas Gerais", funcionario.getCoordenacao().getCidade().getEstado().getNome());
    }
}