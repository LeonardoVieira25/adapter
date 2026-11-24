public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(2200.0);
        System.out.println("Salario mensal: R$ " + funcionario.getSalario());
        System.out.println("Valor por hora: R$ " + funcionario.getValorHora());

        funcionario.setSalario(4400.0);
        System.out.println("Salario mensal: R$ " + funcionario.getSalario());
        System.out.println("Valor por hora: R$ " + funcionario.getValorHora());
    }
}
