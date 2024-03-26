package Pessoas;

public class Funcionario extends Pessoas{
    private int matricula;
    private String cargo;
    private Double salario;
    private String dataAdmissao;

    public Funcionario(int matricula, String cargo, Double salario, String dataAdmissao) {
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    private void reajustarSalario(double percentual) {
        this.salario = this.salario * (1 +(percentual/100));
    }
    public void promover(String novoCargo) {
        cargo = novoCargo;

    }
    public int getMatribula() {
        return matricula;
    }

    public void setMatribula(int matribula) {
        this.matricula = matribula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
