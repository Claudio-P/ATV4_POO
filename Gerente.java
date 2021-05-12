import java.util.Scanner;

public class Gerente extends Funcionario {
    private int senha;
    private double salario;
    private int numFuncionarios;

    public Gerente() {
        senha = 0;
        salario = 0;
    }

    public Gerente(int senha, double salario, int numFuncionarios) {
        this.senha = senha;
        this.salario = salario;
        this.numFuncionarios = numFuncionarios;
    }

    public double calcularSal(double salario) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o núemro de vendas dos seus vendedores: ");
        int vendas = sc1.nextInt();

        double bonus = vendas * 100;
        salario = salario + bonus;
        sc1.close();
        return salario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    
}
