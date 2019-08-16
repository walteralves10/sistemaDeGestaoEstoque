package view;

import OpIO.IO;
import aplicacaosalvaclass.AplicacaoSalvaClass;
import aplicacaosalvaclass.Produto;
import aplicacaosalvaclass.Usuario;
import aplicacaosalvaclass.Venda;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class menuzao extends javax.swing.JFrame {

    private static final int ENTRADA = 1;
    private static final int SAIDA = 2;
    private static final String VENDA = "vendas.txt";
    private static final String PRODUTO = "produtos.txt";
    private static final String USUARIO = "usuarios.txt";
    Usuario user = new Usuario();
    Produto umProduto = new Produto();
    Venda umaVenda = new Venda();

    public menuzao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        textNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        textIdade = new javax.swing.JTextField();
        textCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoAdicionarClientes = new javax.swing.JToggleButton();
        botaoExcluirClientes = new javax.swing.JToggleButton();
        botaoListarClientes = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        textoDescricao = new javax.swing.JTextField();
        textoValor = new javax.swing.JTextField();
        textoQuantidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botaoAdicionarProdutos = new javax.swing.JToggleButton();
        botaoExcluirProdutos = new javax.swing.JToggleButton();
        botaoListarProdutos = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        textoNomeVenda = new javax.swing.JTextField();
        textoDescricaoVenda = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        textoQuantidadeVenda = new javax.swing.JTextField();
        botaoAdicionaVenda = new javax.swing.JButton();
        botaoExcluiVenda = new javax.swing.JButton();
        botaoListaVenda = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nome");

        jLabel2.setText("Idade");

        jLabel3.setText("CPF");

        botaoAdicionarClientes.setText("Adicionar");
        botaoAdicionarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarClientesActionPerformed(evt);
            }
        });

        botaoExcluirClientes.setText("Excluir");
        botaoExcluirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirClientesActionPerformed(evt);
            }
        });

        botaoListarClientes.setText("Listar");
        botaoListarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoExcluirClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionarClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoExcluirClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoListarClientes)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar Clientes", jPanel1);

        jLabel4.setText("Descrição");

        jLabel5.setText("Valor");

        jLabel6.setText("Quantidade");

        botaoAdicionarProdutos.setText("Adicionar");
        botaoAdicionarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarProdutosActionPerformed(evt);
            }
        });

        botaoExcluirProdutos.setText("Excluir");
        botaoExcluirProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirProdutosActionPerformed(evt);
            }
        });

        botaoListarProdutos.setText("Listar");
        botaoListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarProdutosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(135, 135, 135))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(textoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(textoDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoExcluirProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoListarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionarProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluirProdutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoListarProdutos)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastrar Produtos", jPanel2);

        textoNomeVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoNomeVendaActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome Cliente");

        jLabel8.setText("Descricao Produto");

        jLabel9.setText("Quantidade");

        botaoAdicionaVenda.setText("Adicionar");
        botaoAdicionaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionaVendaActionPerformed(evt);
            }
        });

        botaoExcluiVenda.setText("Excluir");
        botaoExcluiVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluiVendaActionPerformed(evt);
            }
        });

        botaoListaVenda.setText("Listar");
        botaoListaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListaVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textoNomeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textoDescricaoVenda)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(textoQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoExcluiVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoAdicionaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoListaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoNomeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDescricaoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoQuantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoAdicionaVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoExcluiVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoListaVenda)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Adicionar Vendas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAdicionarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarClientesActionPerformed
        try {
            user.adicionarUsuario(textNome.getText(), Integer.parseInt(textIdade.getText()), textCpf.getText());
            IO.inserir(USUARIO, user);

            JOptionPane.showMessageDialog(null, "Adicionado!");
            limparCampo();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoAdicionarClientesActionPerformed

    private void botaoExcluirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirClientesActionPerformed

        try {
            user = (Usuario) IO.ler(USUARIO);

            user.removeUsuario(textNome.getText());
            IO.inserir(USUARIO, user);

            JOptionPane.showMessageDialog(null, "Excluido!");
            limparCampo();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }//GEN-LAST:event_botaoExcluirClientesActionPerformed

    private void botaoListarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarClientesActionPerformed
        user = (Usuario) IO.ler(USUARIO);
        user.exibeUsuario();

    }//GEN-LAST:event_botaoListarClientesActionPerformed
//-----------------------------------------------PRODUTOS---------------------------------------------
    private void botaoAdicionarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarProdutosActionPerformed
        // TODO add your handling code here:

        try {
            umProduto.adicionaProduto(textoDescricao.getText(), Double.parseDouble(textoValor.getText()),
                    Integer.parseInt(textoQuantidade.getText()));
            IO.inserir(PRODUTO, umProduto);

            JOptionPane.showMessageDialog(null, "Adicionado!");
            limparCampo();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoAdicionarProdutosActionPerformed

    private void botaoExcluirProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirProdutosActionPerformed
        // TODO add your handling code here:
        try {
            umProduto = (Produto) IO.ler(PRODUTO);

            umProduto.removeProduto(textoDescricao.getText());
            IO.inserir(PRODUTO, umProduto);

            JOptionPane.showMessageDialog(null, "Excluido!");
            limparCampo();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoExcluirProdutosActionPerformed

    private void botaoListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarProdutosActionPerformed
        // TODO add your handling code here:
        umProduto = (Produto) IO.ler(PRODUTO);
        umProduto.exibeProduto();
    }//GEN-LAST:event_botaoListarProdutosActionPerformed

    private void textoNomeVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNomeVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoNomeVendaActionPerformed

    private void botaoAdicionaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionaVendaActionPerformed
        // TODO add your handling code here:
        try {
            umaVenda.adicionaVenda(textoNomeVenda.getText(), textoDescricaoVenda.getText(), Integer.parseInt(textoQuantidadeVenda.getText()));
            IO.inserir(VENDA, umaVenda);
            
            umProduto.ControleQuantidadeEstoque(textoDescricaoVenda.getText(), Integer.parseInt(textoQuantidadeVenda.getText()), ENTRADA);
            IO.inserir(PRODUTO, umProduto);

            JOptionPane.showMessageDialog(null, "Adicionado!");
            limparCampo();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoAdicionaVendaActionPerformed

    private void botaoExcluiVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluiVendaActionPerformed
        // TODO add your handling code here:
        try {
            umaVenda = (Venda) IO.ler(VENDA);
            umaVenda.removeVenda(textoNomeVenda.getText(), textoDescricaoVenda.getText());
            IO.inserir(VENDA, umaVenda);

            JOptionPane.showMessageDialog(null, "Excluido!");
            limparCampo();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_botaoExcluiVendaActionPerformed

    private void botaoListaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListaVendaActionPerformed
        // TODO add your handling code here:
        umaVenda = (Venda) IO.ler(VENDA);
        umaVenda.exibeVenda();
    }//GEN-LAST:event_botaoListaVendaActionPerformed

    private void limparCampo() {
        textNome.setText("");
        textCpf.setText("");
        textIdade.setText("");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuzao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAdicionaVenda;
    private javax.swing.JToggleButton botaoAdicionarClientes;
    private javax.swing.JToggleButton botaoAdicionarProdutos;
    private javax.swing.JButton botaoExcluiVenda;
    private javax.swing.JToggleButton botaoExcluirClientes;
    private javax.swing.JToggleButton botaoExcluirProdutos;
    private javax.swing.JButton botaoListaVenda;
    private javax.swing.JToggleButton botaoListarClientes;
    private javax.swing.JToggleButton botaoListarProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textIdade;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textoDescricao;
    private javax.swing.JTextField textoDescricaoVenda;
    private javax.swing.JTextField textoNomeVenda;
    private javax.swing.JTextField textoQuantidade;
    private javax.swing.JTextField textoQuantidadeVenda;
    private javax.swing.JTextField textoValor;
    // End of variables declaration//GEN-END:variables
}
