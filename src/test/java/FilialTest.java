import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {
    @Test
    void deveRetornarDiretorFilial(){
        Funcionario funcionario = new Funcionario("Ana", new Escolaridade("Metre"));
        Empresa empresa = new Empresa("Empresa", new Grupo(new Pais("Brasil")), funcionario);
        empresa.setDiretor(funcionario);
        Filial filial = new Filial("Filial 2", new Cidade("Juiz de Fora", new Estado("Minas Gerais")));
        filial.setEmpresa(empresa);

        assertEquals("Ana", filial.getEmpresa().getDiretor().getNome());
    }

}