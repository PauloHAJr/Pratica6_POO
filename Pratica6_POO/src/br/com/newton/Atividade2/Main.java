package br.com.newton.Atividade2;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Pedro", "pedroalberto5@gmail.com", "99999-9999",
                "Financeiro", 5000.00, "14/01/2012", "12435765");
        Funcionario funcionario2 = new Funcionario("Flávio", "flavinhodopneu@email.com", "98888-8888",
                "Relaçoes Humanas", 4000.00, "22/07/2015", "524398761");

        Funcionario[] funcionarios = {funcionario1, funcionario2};
        for (Funcionario funcionario : funcionarios) {
            funcionario.mostrarDados();
        }

        Empresa empresa = new Empresa("Bandai", "981453289");
        empresa.adicionarFuncionario(funcionario1);
        empresa.adicionarFuncionario(funcionario2);
        empresa.mostrarFuncionarios();
    }

}
