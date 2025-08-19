
package View;

//Imports
import Builder.CardapioDadosBuilder;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import ru.CardapioDados;

public class Janela extends javax.swing.JFrame {

    //Configura a janela, inicializa os componentes
    public Janela() {
        
        setTitle("Adicionar o cardápio da semana");

        setVisible(true);
        initComponents();
        Table.getSelectionModel().addListSelectionListener(e -> DiaDadosMostar());
        
    }

    //Parte do codigo que criar, configurar e organizar os elementos da interface gráfica da janela
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbDia = new javax.swing.JLabel();
        lbBebida = new javax.swing.JLabel();
        lbSobremesa = new javax.swing.JLabel();
        lbPrato = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        tfBebida = new javax.swing.JTextField();
        tfPrato = new javax.swing.JTextField();
        tfSobremesa = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btNovo = new javax.swing.JButton();
        btAdicionar = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitle.setText("Cardápio");

        lbDia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbDia.setText("Dia da semana:");

        lbBebida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBebida.setText("Bebida:");

        lbSobremesa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbSobremesa.setText("Sobremesa:");

        lbPrato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPrato.setText("Prato principal:");

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAdicionar.setText("Adicionar");
        btAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarActionPerformed(evt);
            }
        });

        btDelete.setText("Deletar");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dia da Semana"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPrato, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAdicionar)
                        .addGap(12, 12, 12)
                        .addComponent(btDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSair)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(147, 147, 147))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDia)
                    .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPrato)
                    .addComponent(tfPrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBebida)
                    .addComponent(tfBebida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSobremesa)
                    .addComponent(tfSobremesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNovo)
                    .addComponent(btAdicionar)
                    .addComponent(btDelete)
                    .addComponent(btSair))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    //Parte que configura o botão Adicionar
    private void btAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarActionPerformed
        
        CardapioDados cardapio = new CardapioDadosBuilder()
            .comDiaSemana(tfDia.getText())
            .comPrato(tfPrato.getText())
            .comBebida(tfBebida.getText())
            .comSobremesa(tfSobremesa.getText())
            .build();

        cardapioDados.add(cardapio);

        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.addRow(new String[] { tfDia.getText() });        
    }//GEN-LAST:event_btAdicionarActionPerformed
    
    //Parte que configura o botão Novo
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        Novo();
            
    }//GEN-LAST:event_btNovoActionPerformed
    
    //Parte que configura o botão Deletar
    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed

        DeletarDado();
    }//GEN-LAST:event_btDeleteActionPerformed

    //Parte que configura o botão Sair
    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
            
    encerraApp();
    
    }//GEN-LAST:event_btSairActionPerformed

    //Parte do código configura o visual da interface gráfica (ANB)
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btAdicionar;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbBebida;
    private javax.swing.JLabel lbDia;
    private javax.swing.JLabel lbPrato;
    private javax.swing.JLabel lbSobremesa;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField tfBebida;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfPrato;
    private javax.swing.JTextField tfSobremesa;
    // End of variables declaration//GEN-END:variables
    private List<CardapioDados> cardapioDados = new ArrayList<>();
    private CardapioDados CardapioRU;

    //Função que adiciona uma linha na tabela e adiciona os dados nessa linha da tabela
    private void AddDados(){
        
        CardapioRU = new CardapioDados(tfDia.getText(),tfPrato.getText(),tfBebida.getText(),tfSobremesa.getText());
        
        cardapioDados.add(CardapioRU);
        
        DefaultTableModel model = (DefaultTableModel) Table.getModel();
        model.addRow(new String[] {tfDia.getText()});
        
    }
    
    //Função que limpa os JTextFields
    private void Novo(){
        
    tfDia.setText(" ");
    tfPrato.setText(" ");
    tfBebida.setText(" ");
    tfSobremesa.setText(" ");
   
    }
    
    //Função que encerra o aplicativo
    private void encerraApp(){

        String title = "Confirmação";
        String message = "Deseja Sair?";
        
        int retry = JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_OPTION);
        if(retry == 0) System.exit(0);

    }
   
    //Função que preenche os JTextFields com os valores da linha da lista selecionada
    private void DiaDadosMostar(){
        
        int selectedRow = Table.getSelectedRow();
        if(selectedRow != -1){
            
            CardapioDados diaselec = cardapioDados.get(selectedRow);
            tfDia.setText(diaselec.getDiaSemana());
            tfPrato.setText(diaselec.getPrato());
            tfBebida.setText(diaselec.getBebida());
            tfSobremesa.setText(diaselec.getSobremesa());
            
        }
        
    }
    
    //Função que deleta os dados salvos em uma linha da lista selecionada
    private void DeletarDado(){
        
        int selectedRow = Table.getSelectedRow();
            if (selectedRow != -1) {
                
                cardapioDados.remove(selectedRow);
                
                DefaultTableModel model = (DefaultTableModel) Table.getModel();
                model.removeRow(selectedRow);
                Novo();
                
            }
        
    }
}