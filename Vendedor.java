public class Vendedor extends Funcionario {
    private int senha;
    private int comissao;
    private int gerenteResp;

    public Vendedor() {
        senha = 0;
        comissao = 0;
        gerenteResp = 0;
    }

    public Vendedor(int senha, int comissao, int gerenteResp) {
        this.senha = senha;
        this.comissao = comissao;
        this.gerenteResp = gerenteResp;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public int getGerenteResp() {
        return gerenteResp;
    }

    public void setGerenteResp(int gerenteResp) {
        this.gerenteResp = gerenteResp;
    }
}
