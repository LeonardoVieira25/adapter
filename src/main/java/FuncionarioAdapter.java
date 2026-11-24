public class FuncionarioAdapter extends SalarioHora {

    private static final Double HORAS_POR_MES = 220.0;

    private IFuncionario funcionarioMensal;

    public FuncionarioAdapter(IFuncionario funcionarioMensal) {
        this.funcionarioMensal = funcionarioMensal;
    }

    public Double recuperarSalario() {
        funcionarioMensal.setSalario(this.getValorHora() * HORAS_POR_MES);
        return funcionarioMensal.getSalario();
    }

    public void salvarSalario() {
        this.setValorHora(funcionarioMensal.getSalario() / HORAS_POR_MES);
    }
}
