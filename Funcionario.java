public class Funcionario extends Pessoa {
    private double salario;
    private String departamento;
    private String dataDeEntrada;
    private String RG;
    private boolean estaNaEmpresa;

    public Funcionario() {
        salario = 0;
        departamento = "";
        dataDeEntrada = "";
        RG = "";
        estaNaEmpresa = false; 
    }

    public Funcionario(double salario, String departamento, String dataDeEntrada, String RG, boolean estaNaEmpresa) {
        this.salario = salario;
        this.departamento = departamento;
        this.dataDeEntrada = dataDeEntrada;
        this.RG = RG;
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(String dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }
}


