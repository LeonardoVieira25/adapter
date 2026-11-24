public class FuncionarioMensal implements IFuncionario {

    private Double salario;

    @Override
    public Double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
