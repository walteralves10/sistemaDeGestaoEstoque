package aplicacaosalvaclass;

import OpIO.IO;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Venda extends AplicacaoSalvaClass{
    
    private static final int ENTRADA = 1;
    private static final int SAIDA = 2;
    Usuario user = new Usuario();
    Produto umProduto = new Produto();
    
    public Venda(){
    }
    
    public Venda(String nome, String descricao, int quantidade) throws IOException{
        user.setNome(nome);
        umProduto.setDescricao(descricao);
        umProduto.setQuantidade(quantidade);
        //IO.inserir("produtos.txt", umProduto);
    }
    
    public String toString() {

        return "Nome: " + user.getNome() + " Descrição: " + umProduto.getDescricao() + " Quantidade: " + umProduto.getQuantidade() + "\n";
    }
    
    public void adicionaVenda(String nome, String descricao, int quantidade) throws IOException{
        vendaList.add(new Venda(nome, descricao, quantidade));
    }
     
    public void removeVenda(String nome, String produto){
        for (int cont = 0; cont < vendaList.size(); cont++) {
            if (vendaList.get(cont).umProduto.getDescricao().contentEquals(produto) && 
                    vendaList.get(cont).user.getNome().contentEquals(nome)) {
                umProduto.ControleQuantidadeEstoque(produto, (int) vendaList.get(cont).umProduto.getQuantidade(), SAIDA);
                vendaList.remove(cont);
                break;
            }
        }
    }
    
    public void exibeVenda() {
        String exibeVenda = "";

        if (vendaList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vazio!");
        } else {
            for (Venda umaVenda : vendaList) {
                exibeVenda += umaVenda.toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, exibeVenda);
        }
    }
    
}
