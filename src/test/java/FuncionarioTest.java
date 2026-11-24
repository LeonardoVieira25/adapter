// Equivalente a AlunoTest.java do exemplo original (padroesestruturais.adapter)

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void deveRetornarSalarioMensalFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2200.0);

        assertEquals(2200.0, funcionario.getSalario());
    }

    @Test
    void deveRetornarValorHoraFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2200.0);

        assertEquals(10.0, funcionario.getValorHora());
    }

}
