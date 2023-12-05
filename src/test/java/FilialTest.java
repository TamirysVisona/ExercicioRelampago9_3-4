import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {
    @Test
    void deveRetornarEstadoCoordenador(){
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("Minas Gerais", pais);
        Cidade cidade = new Cidade("Juiz de Fora", estado);

        Funcionario funcionarioPresidente = new Funcionario("Luiz", new Escolaridade(6));
        Grupo grupo = new Grupo("Grupo 1", funcionarioPresidente, pais);

        Funcionario funcionarioDiretor = new Funcionario("Ana", new Escolaridade(5));
        Empresa empresa = new Empresa("Empresa", grupo, funcionarioDiretor);

        Filial filial = new Filial("Filial 1", empresa, cidade);
        Funcionario funcionario = new Funcionario("Joao", new Escolaridade(4));
        funcionario.setCoordenacao(filial);

        assertEquals("Minas Gerais", funcionario.getCoordenacao().getCidade().getEstado().getNome());
    }

    @Test
    void deveRetornarNomeDiretorEmpresa(){
        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("Minas Gerais", pais);
        Cidade cidade = new Cidade("Juiz de Fora", estado);

        Funcionario funcionarioPresidente = new Funcionario("Luiz", new Escolaridade(6));
        Grupo grupo = new Grupo("Grupo 1", funcionarioPresidente, pais);

        Funcionario funcionarioDiretor = new Funcionario("Ana", new Escolaridade(5));
        Empresa empresa = new Empresa("Empresa", grupo, funcionarioDiretor);

        Filial filial = new Filial("Filial 1", empresa, cidade);
        filial.setEmpresa(empresa);

        assertEquals("Ana", filial.getEmpresa().getDiretor().getNome());

    }
}