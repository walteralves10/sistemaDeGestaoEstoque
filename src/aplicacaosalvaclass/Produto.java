package aplicacaosalvaclass;

import OpIO.IO;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Produto extends AplicacaoSalvaClass{
    
    private static final int ENTRADA = 1;
    private static final int SAIDA = 2;
    private String descricao ;
    private double valor ;
    private int quantidade ;
    
    public Produto(){
        setDescricao("");
        setValor(0.0);
        setQuantidade(0);
    }

    public Produto(String descricao, double valor, int quantidade) {
        setDescricao(descricao);
        setValor(valor);
        setQuantidade(quantidade);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String toString(){
        return "Descrição: " + getDescricao() + " Valor: " + getValor() + " Quantidade: " + getQuantidade() + "\n";
    }
    
    public void adicionaProduto(String descricao, double valor, int quantidade){
        produtoList.add(new Produto(descricao, valor, quantidade));
    }
    
    public void removeProduto(String descricao){
        for(int i=0; i < produtoList.size(); i++){
            if(produtoList.get(i).getDescricao().contentEquals(descricao)){
                produtoList.remove(i);
            }
        }
    }
    
    public void exibeProduto(){
        String exibeProduto = "";

        if (produtoList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vazio!");
        } else {
            for (Produto umProduto : produtoList) {
                exibeProduto += umProduto.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, exibeProduto);
        }
    }
    
    private void EntradaSaidaEstoque(int quantidade, int index, int tipo){
        if(tipo == SAIDA)
            produtoList.get(index).quantidade+= quantidade;
            
        if(tipo == ENTRADA)
            produtoList.get(index).quantidade-=quantidade;
    }
    
    public void ControleQuantidadeEstoque(String descricao, int quantidade, int tipo){
        for(int i=0; i < produtoList.size(); i++){
            if(produtoList.get(i).getDescricao().contentEquals(descricao)){
                EntradaSaidaEstoque(quantidade, i, tipo);
            }
        }
    }

//    public void EntradaEstoque(String descricao, int quantidade, int tipo){
//        for(int i=0; i < produtoList.size(); i++){
//            if(produtoList.get(i).getDescricao().contentEquals(descricao)){
//                EntradaSaidaEstoque(quantidade, i, tipo);
//            }
//        }
//    }
    
//    public static void main(String[] args) throws IOException {
//        
//        Produto umProduto = new Produto();
//        
//        umProduto.adicionaProduto("mause",50.0,12);
//        IO.inserir("produtos.txt", umProduto);
//        umProduto.exibeProduto();
//        
//        umProduto.ControleQuantidadeEstoque("mause", 2, ENTRADA);
//        IO.inserir("produtos.txt", umProduto);
//        umProduto.exibeProduto();
//        
//        umProduto.ControleQuantidadeEstoque("mause", 2, ENTRADA);
//        IO.inserir("produtos.txt", umProduto);
//        umProduto.exibeProduto();
//        
//        umProduto.ControleQuantidadeEstoque("mause", 8, SAIDA);
//        IO.inserir("produtos.txt", umProduto);
//        umProduto.exibeProduto();
//      /*umProduto.removeProduto("mause");
//        IO.inserir("produtos", umProduto);
//        umProduto.exibeProduto();*/
//    }
}
