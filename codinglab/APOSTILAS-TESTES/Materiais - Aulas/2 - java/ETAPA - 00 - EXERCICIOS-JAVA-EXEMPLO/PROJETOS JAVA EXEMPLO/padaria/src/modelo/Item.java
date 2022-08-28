/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gelvazio
 */
public class Item {
    int CodigoProduto;
    int NumeroVenda;
    int Quantidade;

    public Item(int CodigoProduto, int NumeroVenda, int Quantidade) {
        this.CodigoProduto = CodigoProduto;
        this.NumeroVenda = NumeroVenda;
        this.Quantidade = Quantidade;
    }

    
    public int getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(int CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    public int getNumeroVenda() {
        return NumeroVenda;
    }

    public void setNumeroVenda(int NumeroVenda) {
        this.NumeroVenda = NumeroVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }
    
    
    
    
}
