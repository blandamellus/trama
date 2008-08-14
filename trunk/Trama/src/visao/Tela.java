package visao;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.JTableHeader;
import negocio.TelaController;

/**
 *
 * @author  Fabio
 */
public class Tela extends javax.swing.JFrame {
   
    private JTableHeader header;
    protected JTableCustomizado jTable1 = new JTableCustomizado();
    private Object jScrollPane1;

    public Tela() {
        initComponents();
        //  setExtendedState( MAXIMIZED_BOTH );

        jTable1.addMouseListener( new java.awt.event.MouseAdapter() {
                              public void mouseClicked( java.awt.event.MouseEvent evt ) {
                                  jTable1MouseClicked( evt );
                              }
                          } );
        jScrollPane2.setViewportView( jTable1 );

        headerColunaClicked();

       // matriz = jTable1.tabe.matriz;
    }
    
    private void abrirProjeto(){

	}

	/**
	 * GEN-LAST:event_apagarLinhaColunaActionPerformed
	 */
	private void adicionarColuna(){

	}

	/**
	 * GEN-LAST:event_atualizarActionPerformed
	 */
	private void adicionarColunasModelo(){

	}

	/**
	 * GEN-LAST:event_apagarLinhaColunaActionPerformed
	 */
	private void adicionarLinha(){

	}

	/**
	 * GEN-LAST:event_apagarLinhaColunaActionPerformed
	 */
	private void adicionarLinhasModelo(){

	}

	/**
	 * GEN-LAST:event_novoProjetoActionPerformed1
	 */
	private void adicionarMatriz(){

	}

	/**
	 * GEN-LAST:event_apagarMatrizActionPerformed
	 */
	private void alterarPosicaoColuna(){

	}

	/**
	 * GEN-LAST:event_deslocar1ActionPerformed
	 */
	private void alterarPosicaoLinha(){

	}

	/**
	 * GEN-LAST:event_apagarLinhaColunaActionPerformed
	 */
	private void atualizarColuna(){

	}

	/**
	 * GEN-LAST:event_apagarLinhaColunaActionPerformed
	 */
	private void atualizarLinha(){

	}

	/**
	 * GEN-LAST:event_salvarProjetoActionPerformed
	 */
	private void criarNovoProjeto(){

	}

	/**
	 * GEN-LAST:event_deslocar2ActionPerformed
	 */
	private void destacarElementos(){

	}

	/**
	 * GEN-LAST:event_novaMatrizActionPerformed
	 */
	private void excluirMatriz(){

	}

	/**
	 * GEN-LAST:event_ordenarActionPerformed
	 */
	private void exclulirColuna(){

	}

	/**
	 * GEN-LAST:event_ordenarActionPerformed
	 */
	private void exclulirLinha(){

	}

	private void exportarImagem(){

	}

	private void exportarPDF(){

	}

	private void fecharProjeto(){

	}

	private void imprimir(){

	}

	/**
	 * GEN-LAST:event_importarActionPerformed
	 */
	private void ordenarColuna(){

	}

	/**
	 * GEN-LAST:event_importarActionPerformed
	 */
	private void ordenarLinha(){

	}

	/**
	 * 
	 * @param evt
	 */
	private void posisaoJTable(ActionEvent evt){

	}

	private void resetarDestaque(){

	}

	/**
	 * </editor-fold>                        
	 */
	private void salvarProjeto(){

	}

	/**
	 * GEN-LAST:event_destacarActionPerformed
	 */
	private void sincronizarColuna(){

	}

	/**
	 * GEN-LAST:event_destacarActionPerformed
	 */
	private void sincronizarLinha(){

	}

	/**
	 * GEN-LAST:event_destacarActionPerformed
	 */
	private void sincronizarMatriz(){

	}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        novoProjeto = new javax.swing.JButton();
        abrirProjeto = new javax.swing.JButton();
        salvarProjeto = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        novaMatriz = new javax.swing.JButton();
        apagarMatriz = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        cancelarEdicao = new javax.swing.JButton();
        okEdicao = new javax.swing.JButton();
        nomeTextField = new javax.swing.JTextField();
        deslocar1 = new javax.swing.JButton();
        deslocar2 = new javax.swing.JButton();
        destacar = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        novaLinhaColuna = new javax.swing.JButton();
        apagarLinhaColuna = new javax.swing.JButton();
        ordenar = new javax.swing.JButton();
        importar = new javax.swing.JButton();
        atualizar = new javax.swing.JButton();
        jToolBar6 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCustomizado1 = new visao.JTableCustomizado();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        novoProjetoMenu = new javax.swing.JMenuItem();
        abrirProjetoMenu = new javax.swing.JMenuItem();
        salvarProjetoMenu = new javax.swing.JMenuItem();
        fecharProjetoMenu = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JSeparator();
        salvarPDFMenu = new javax.swing.JMenuItem();
        salvarImagemMenu = new javax.swing.JMenuItem();
        imprimirMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trama");
        setMinimumSize(new java.awt.Dimension(800, 550));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(777, 36));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentX(0.0F);
        jToolBar1.setMaximumSize(new java.awt.Dimension(150, 35));
        jToolBar1.setMinimumSize(new java.awt.Dimension(158, 30));
        jToolBar1.setPreferredSize(new java.awt.Dimension(110, 45));

        novoProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add16.gif"))); // NOI18N
        novoProjeto.setText("Novo");
        novoProjeto.setFocusable(false);
        novoProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novoProjeto.setIconTextGap(1);
        novoProjeto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoProjetoActionPerformed(evt);
                novoProjetoActionPerformed1(evt);
            }
        });
        jToolBar1.add(novoProjeto);

        abrirProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Open16.gif"))); // NOI18N
        abrirProjeto.setText("Abrir");
        abrirProjeto.setFocusable(false);
        abrirProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        abrirProjeto.setIconTextGap(1);
        abrirProjeto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        abrirProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirProjetoActionPerformed(evt);
            }
        });
        jToolBar1.add(abrirProjeto);

        salvarProjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save16.gif"))); // NOI18N
        salvarProjeto.setText("Salvar");
        salvarProjeto.setFocusable(false);
        salvarProjeto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salvarProjeto.setIconTextGap(1);
        salvarProjeto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        salvarProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarProjetoActionPerformed(evt);
            }
        });
        jToolBar1.add(salvarProjeto);

        jPanel1.add(jToolBar1);

        jToolBar3.setRollover(true);
        jToolBar3.setAlignmentY(0.5F);
        jToolBar3.setMaximumSize(new java.awt.Dimension(50, 50));
        jToolBar3.setMinimumSize(new java.awt.Dimension(50, 50));
        jToolBar3.setPreferredSize(new java.awt.Dimension(80, 45));

        novaMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RowDelete16.gif"))); // NOI18N
        novaMatriz.setText("Novo");
        novaMatriz.setFocusable(false);
        novaMatriz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novaMatriz.setIconTextGap(1);
        novaMatriz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novaMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaMatrizActionPerformed(evt);
            }
        });
        jToolBar3.add(novaMatriz);

        apagarMatriz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Stop16.gif"))); // NOI18N
        apagarMatriz.setText("Apagar");
        apagarMatriz.setFocusable(false);
        apagarMatriz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        apagarMatriz.setIconTextGap(1);
        apagarMatriz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        apagarMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarMatrizActionPerformed(evt);
            }
        });
        jToolBar3.add(apagarMatriz);

        jPanel1.add(jToolBar3);

        jToolBar2.setRollover(true);
        jToolBar2.setMaximumSize(new java.awt.Dimension(400, 30));
        jToolBar2.setMinimumSize(new java.awt.Dimension(300, 30));
        jToolBar2.setPreferredSize(new java.awt.Dimension(340, 45));

        jLabel1.setText(null);
        jToolBar2.add(jLabel1);

        cancelarEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.gif"))); // NOI18N
        cancelarEdicao.setFocusable(false);
        cancelarEdicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelarEdicao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(cancelarEdicao);

        okEdicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_ok.gif"))); // NOI18N
        okEdicao.setFocusable(false);
        okEdicao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        okEdicao.setIconTextGap(1);
        okEdicao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar2.add(okEdicao);

        nomeTextField.setColumns(15);
        nomeTextField.setFont(new java.awt.Font("Arial", 0, 12));
        nomeTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        nomeTextField.setCaretColor(new java.awt.Color(255, 255, 255));
        nomeTextField.setMinimumSize(new java.awt.Dimension(10, 30));
        jToolBar2.add(nomeTextField);

        deslocar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Play16.gif"))); // NOI18N
        deslocar1.setText("Direita");
        deslocar1.setAlignmentX(0.5F);
        deslocar1.setFocusable(false);
        deslocar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deslocar1.setIconTextGap(1);
        deslocar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deslocar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslocar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(deslocar1);

        deslocar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Down16.gif"))); // NOI18N
        deslocar2.setText("Baixo");
        deslocar2.setFocusable(false);
        deslocar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deslocar2.setIconTextGap(1);
        deslocar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deslocar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deslocar2ActionPerformed(evt);
            }
        });
        jToolBar2.add(deslocar2);

        destacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Find16.gif"))); // NOI18N
        destacar.setText("Destacar");
        destacar.setFocusable(false);
        destacar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        destacar.setIconTextGap(1);
        destacar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        destacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destacarActionPerformed(evt);
            }
        });
        jToolBar2.add(destacar);

        jPanel1.add(jToolBar2);

        jToolBar4.setRollover(true);
        jToolBar4.setMaximumSize(new java.awt.Dimension(400, 30));
        jToolBar4.setMinimumSize(new java.awt.Dimension(200, 30));
        jToolBar4.setPreferredSize(new java.awt.Dimension(230, 45));

        novaLinhaColuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RowDelete16.gif"))); // NOI18N
        novaLinhaColuna.setText("Novo");
        novaLinhaColuna.setFocusable(false);
        novaLinhaColuna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        novaLinhaColuna.setIconTextGap(1);
        novaLinhaColuna.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        novaLinhaColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaLinhaColunaActionPerformed(evt);
            }
        });
        jToolBar4.add(novaLinhaColuna);

        apagarLinhaColuna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Volume16.gif"))); // NOI18N
        apagarLinhaColuna.setText("Apagar");
        apagarLinhaColuna.setFocusable(false);
        apagarLinhaColuna.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        apagarLinhaColuna.setIconTextGap(1);
        apagarLinhaColuna.setMaximumSize(new java.awt.Dimension(100, 100));
        apagarLinhaColuna.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        apagarLinhaColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apagarLinhaColunaActionPerformed(evt);
            }
        });
        jToolBar4.add(apagarLinhaColuna);

        ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Preferences16.gif"))); // NOI18N
        ordenar.setText("Ordenar");
        ordenar.setFocusable(false);
        ordenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ordenar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });
        jToolBar4.add(ordenar);

        importar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Import16.gif"))); // NOI18N
        importar.setText("Importar");
        importar.setFocusable(false);
        importar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        importar.setIconTextGap(1);
        importar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarActionPerformed(evt);
            }
        });
        jToolBar4.add(importar);

        atualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Refresh16.gif"))); // NOI18N
        atualizar.setText("Atualizar");
        atualizar.setFocusable(false);
        atualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        atualizar.setIconTextGap(1);
        atualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarActionPerformed(evt);
            }
        });
        jToolBar4.add(atualizar);

        jPanel1.add(jToolBar4);

        jToolBar6.setRollover(true);
        jPanel1.add(jToolBar6);

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 204));
        jTabbedPane1.setName("Requisitos X UC"); // NOI18N

        jScrollPane2.setViewportView(jTableCustomizado1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 854, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Requisitos X UC", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Requisitos X UC");

        jMenu1.setText("Arquivo");

        novoProjetoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New16.gif"))); // NOI18N
        novoProjetoMenu.setText("Novo Projeto...");
        jMenu1.add(novoProjetoMenu);

        abrirProjetoMenu.setText("Abrir Projeto...");
        jMenu1.add(abrirProjetoMenu);

        salvarProjetoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SaveAll16.gif"))); // NOI18N
        salvarProjetoMenu.setText("Salvar Projeto");
        jMenu1.add(salvarProjetoMenu);

        fecharProjetoMenu.setText("Fechar Projeto");
        jMenu1.add(fecharProjetoMenu);
        jMenu1.add(jSeparator3);

        salvarPDFMenu.setText("Salvar como PDF...");
        jMenu1.add(salvarPDFMenu);

        salvarImagemMenu.setText("Salvar como Imagem...");
        jMenu1.add(salvarImagemMenu);

        imprimirMenu.setText("Imprimir...");
        jMenu1.add(imprimirMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Matriz");

        jMenuItem6.setText("Nova Matriz");
        jMenu2.add(jMenuItem6);

        jMenu4.setText("Apagar Matriz");
        jMenu2.add(jMenu4);

        jMenuItem12.setText("Atualizar Matriz...");
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Linha/Coluna");

        jMenu6.setText("Nova Linha");
        jMenu5.add(jMenu6);

        jMenu8.setText("Apagar Linha");
        jMenu5.add(jMenu8);
        jMenu5.add(jSeparator1);

        jMenu7.setText("Nova Coluna");
        jMenu5.add(jMenu7);

        jMenu9.setText("Apagar Coluna");
        jMenu5.add(jMenu9);

        jMenuItem9.setText("Importar do Modelo");
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        jMenu10.setText("Ferramentas");

        jMenuItem10.setText("Ordenar");
        jMenu10.add(jMenuItem10);

        jMenuItem11.setText("Importar");
        jMenu10.add(jMenuItem11);

        jMenuItem13.setText("Destacar");
        jMenu10.add(jMenuItem13);

        jMenuItem14.setText("Resetar campos novos");
        jMenu10.add(jMenuItem14);

        jMenuBar1.add(jMenu10);

        jMenu3.setText("Ajuda");

        jMenuItem8.setText("Sobre");
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salvarProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarProjetoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_salvarProjetoActionPerformed

private void novoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProjetoActionPerformed
}//GEN-LAST:event_novoProjetoActionPerformed

private void abrirProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirProjetoActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_abrirProjetoActionPerformed

private void novoProjetoActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoProjetoActionPerformed1
}//GEN-LAST:event_novoProjetoActionPerformed1

private void novaMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaMatrizActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_novaMatrizActionPerformed

private void apagarMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarMatrizActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_apagarMatrizActionPerformed

private void deslocar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslocar1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_deslocar1ActionPerformed

private void deslocar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deslocar2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_deslocar2ActionPerformed

private void destacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destacarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_destacarActionPerformed

private void atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_atualizarActionPerformed

private void importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_importarActionPerformed

private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_ordenarActionPerformed

private void apagarLinhaColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apagarLinhaColunaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_apagarLinhaColunaActionPerformed

private void novaLinhaColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaLinhaColunaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_novaLinhaColunaActionPerformed

    private void jTable1MouseClicked( java.awt.event.MouseEvent evt ) {
        int linha = jTable1.getSelectedRow();
        int coluna = jTable1.getSelectedColumn();

        System.out.println( "Linha=" + ( linha + 1 ) + "   coluna= " + coluna );

    }

    private void headerColunaClicked() {
        header = jTable1.getTableHeader();

        header.addMouseListener( new MouseAdapter() {
                             @Override
                             public void mouseClicked( MouseEvent e ) {
                                 int coluna = header.columnAtPoint( e.getPoint() );

                                 System.out.println( "coluna= " + coluna );
                                // matriz.setTituloColuna( coluna, "coluna9999" );
                                 jTable1.getColumnModel().getColumn( coluna ).setHeaderValue( "45" );
                             }
                         } );
    }

	

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirProjeto;
    private javax.swing.JMenuItem abrirProjetoMenu;
    private javax.swing.JButton apagarLinhaColuna;
    private javax.swing.JButton apagarMatriz;
    private javax.swing.JButton atualizar;
    private javax.swing.JButton cancelarEdicao;
    private javax.swing.JButton deslocar1;
    private javax.swing.JButton deslocar2;
    private javax.swing.JButton destacar;
    private javax.swing.JMenuItem fecharProjetoMenu;
    private javax.swing.JButton importar;
    private javax.swing.JMenuItem imprimirMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private visao.JTableCustomizado jTableCustomizado1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JToolBar jToolBar6;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton novaLinhaColuna;
    private javax.swing.JButton novaMatriz;
    private javax.swing.JButton novoProjeto;
    private javax.swing.JMenuItem novoProjetoMenu;
    private javax.swing.JButton okEdicao;
    private javax.swing.JButton ordenar;
    private javax.swing.JMenuItem salvarImagemMenu;
    private javax.swing.JMenuItem salvarPDFMenu;
    private javax.swing.JButton salvarProjeto;
    private javax.swing.JMenuItem salvarProjetoMenu;
    // End of variables declaration//GEN-END:variables
}
