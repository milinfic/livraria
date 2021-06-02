
package model;

public class Venda {
    
    private int numerovenda;
    private String datavenda, cpf;
    private double valorpagar;

    public int getNumerovenda() {
        return numerovenda;
    }

    public void setNumerovenda(int numerovenda) {
        this.numerovenda = numerovenda;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorpagar() {
        return valorpagar;
    }

    public void setValorpagar(double valorpagar) {
        this.valorpagar = valorpagar;
    }
}
