
package model;

public class itemvenda {

    public int getIditemvenda() {
        return iditemvenda;
    }

    public void setIditemvenda(int iditemvenda) {
        this.iditemvenda = iditemvenda;
    }

    public int getNumerovenda() {
        return numerovenda;
    }

    public void setNumerovenda(int numerovenda) {
        this.numerovenda = numerovenda;
    }

    public int getIdlivro() {
        return idlivro;
    }

    public void setIdlivro(int idlivro) {
        this.idlivro = idlivro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorparcial() {
        return valorparcial;
    }

    public void setValorparcial(double valorparcial) {
        this.valorparcial = valorparcial;
    }
    
    private int iditemvenda, numerovenda, idlivro, quantidade;
    private double valorparcial;
}
