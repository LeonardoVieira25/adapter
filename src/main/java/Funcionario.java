public class Funcionario {

    IFuncionario salarioMensal;
    FuncionarioAdapter persistencia;

    public Funcionario() {
        salarioMensal = new FuncionarioMensal();
        persistencia = new FuncionarioAdapter(salarioMensal);
    }

    public void setSalario(Double salario) {
        salarioMensal.setSalario(salario);
        persistencia.salvarSalario();
    }

    public Double getSalario() {
        return persistencia.recuperarSalario();
    }

    public Double getValorHora() {
        return persistencia.getValorHora();
    }

}
