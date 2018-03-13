package laboratoriografico.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import laboratoriografico.model.Forma;
import laboratoriografico.model.Ponto;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 26/02/2018
 *
 */
public class JFrameDesenharForma extends javax.swing.JFrame {
    
    private JFramePrincipal frmPai = null;
    private List<Ponto> pontosForma;
    private DefaultListModel listaForma;
    private Color corForma;

    /**
     * Creates new form JFrameDesenhar
     *
     * @param frmPai
     */
    public JFrameDesenharForma(JFramePrincipal frmPai) {
        this.frmPai = frmPai;
        pontosForma = new ArrayList();
        listaForma = new DefaultListModel();
        corForma = Color.BLACK;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanelForma = new javax.swing.JPanel();
        jPanelFormaInserirAresta = new javax.swing.JPanel();
        jTextFieldFormaCoordenadaX = new javax.swing.JTextField();
        jTextFieldFormaCoordenadaY = new javax.swing.JTextField();
        jLabelFormaFinalCoordenadaX1 = new javax.swing.JLabel();
        jLabelFormaFinalCoordenadaY1 = new javax.swing.JLabel();
        jButtonAdicionarAresta = new javax.swing.JButton();
        jPanelFormaArestas = new javax.swing.JPanel();
        jScrollPanePoligonoArestas = new javax.swing.JScrollPane();
        jListFormaArestas = new javax.swing.JList<>();
        btnRemoverAresta = new javax.swing.JButton();
        jLabeFormaNome = new javax.swing.JLabel();
        jTextFieldFormaNome = new javax.swing.JTextField();
        jPanelFormaCor = new javax.swing.JPanel();
        ckbPoligono = new javax.swing.JCheckBox();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonDesenhar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanelFormaInserirAresta.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Aresta"));

        jLabelFormaFinalCoordenadaX1.setText("Coordenada X:");

        jLabelFormaFinalCoordenadaY1.setText("Coordenada Y:");

        jButtonAdicionarAresta.setText("Adicionar");
        jButtonAdicionarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarArestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormaInserirArestaLayout = new javax.swing.GroupLayout(jPanelFormaInserirAresta);
        jPanelFormaInserirAresta.setLayout(jPanelFormaInserirArestaLayout);
        jPanelFormaInserirArestaLayout.setHorizontalGroup(
            jPanelFormaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaInserirArestaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormaInserirArestaLayout.createSequentialGroup()
                        .addComponent(jLabelFormaFinalCoordenadaX1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFormaCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormaInserirArestaLayout.createSequentialGroup()
                        .addComponent(jLabelFormaFinalCoordenadaY1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFormaCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonAdicionarAresta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelFormaInserirArestaLayout.setVerticalGroup(
            jPanelFormaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaInserirArestaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFormaFinalCoordenadaX1)
                    .addComponent(jTextFieldFormaCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelFormaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFormaCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFormaFinalCoordenadaY1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAdicionarAresta))
        );

        jPanelFormaArestas.setBorder(javax.swing.BorderFactory.createTitledBorder("Arestas"));

        jScrollPanePoligonoArestas.setViewportView(jListFormaArestas);

        btnRemoverAresta.setText("Remover");
        btnRemoverAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverArestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormaArestasLayout = new javax.swing.GroupLayout(jPanelFormaArestas);
        jPanelFormaArestas.setLayout(jPanelFormaArestasLayout);
        jPanelFormaArestasLayout.setHorizontalGroup(
            jPanelFormaArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaArestasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormaArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePoligonoArestas, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnRemoverAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFormaArestasLayout.setVerticalGroup(
            jPanelFormaArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaArestasLayout.createSequentialGroup()
                .addComponent(jScrollPanePoligonoArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverAresta)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jLabeFormaNome.setText("Nome:");

        jPanelFormaCor.setBackground(new java.awt.Color(0, 0, 0));
        jPanelFormaCor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelFormaCorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormaCorLayout = new javax.swing.GroupLayout(jPanelFormaCor);
        jPanelFormaCor.setLayout(jPanelFormaCorLayout);
        jPanelFormaCorLayout.setHorizontalGroup(
            jPanelFormaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanelFormaCorLayout.setVerticalGroup(
            jPanelFormaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        ckbPoligono.setText("Poligono");
        ckbPoligono.setEnabled(false);

        javax.swing.GroupLayout jPanelFormaLayout = new javax.swing.GroupLayout(jPanelForma);
        jPanelForma.setLayout(jPanelFormaLayout);
        jPanelFormaLayout.setHorizontalGroup(
            jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormaLayout.createSequentialGroup()
                        .addComponent(jPanelFormaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelFormaInserirAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelFormaLayout.createSequentialGroup()
                                .addComponent(ckbPoligono)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormaLayout.createSequentialGroup()
                        .addComponent(jLabeFormaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldFormaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelFormaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelFormaLayout.setVerticalGroup(
            jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFormaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabeFormaNome)
                        .addComponent(jTextFieldFormaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelFormaCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFormaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelFormaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelFormaLayout.createSequentialGroup()
                        .addComponent(jPanelFormaInserirAresta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ckbPoligono)))
                .addContainerGap())
        );

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonDesenhar.setText("Desenhar");
        jButtonDesenhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesenharActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDesenhar)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonDesenhar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanelForma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        close();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        close();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonDesenharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesenharActionPerformed
        Forma forma = new Forma(jTextFieldFormaNome.getText(), pontosForma.get(0), corForma, ckbPoligono.isSelected());
        for (int i = 1; i < pontosForma.size(); i++) {
            forma.addAresta(pontosForma.get(i));
        }
        frmPai.getFormas().add(forma);
        frmPai.getPanelDesenho().repaint();
        frmPai.getLista().addElement(forma);
        frmPai.getjListFormas().setModel(frmPai.getLista());
        close();
    }//GEN-LAST:event_jButtonDesenharActionPerformed

    private void jPanelFormaCorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelFormaCorMouseClicked
        JFrameCor cor = new JFrameCor(this, corForma);
        this.setEnabled(false);
        cor.setVisible(true);
    }//GEN-LAST:event_jPanelFormaCorMouseClicked

    private void btnRemoverArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverArestaActionPerformed
        pontosForma.remove(jListFormaArestas.getSelectedIndex());
        listaForma.remove(jListFormaArestas.getSelectedIndex());
        if (listaForma.size() < 3) {
            ckbPoligono.setSelected(false);
            ckbPoligono.setEnabled(false);
        }
    }//GEN-LAST:event_btnRemoverArestaActionPerformed

    private void jButtonAdicionarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarArestaActionPerformed
        Ponto ponto = new Ponto(
                Double.parseDouble(jTextFieldFormaCoordenadaX.getText().replace(",", ".")),
                Double.parseDouble(jTextFieldFormaCoordenadaY.getText().replace(",", ".")));
        pontosForma.add(ponto);
        listaForma.addElement(ponto);
        jListFormaArestas.setModel(listaForma);
        jTextFieldFormaCoordenadaX.setText("");
        jTextFieldFormaCoordenadaY.setText("");
        if (listaForma.size() > 2) {
            ckbPoligono.setEnabled(true);
        }
    }//GEN-LAST:event_jButtonAdicionarArestaActionPerformed
    
    public JPanel getjPanelFormaCor() {
        return jPanelFormaCor;
    }
    
    public void setjPanelFormaCor(JPanel jPanelFormaCor) {
        this.jPanelFormaCor = jPanelFormaCor;
    }
    
    public Color getCorForma() {
        return corForma;
    }
    
    public void setCorPoligono(Color corForma) {
        this.corForma = corForma;
    }
    
    private void close() {
        if (frmPai != null) {
            frmPai.setEnabled(true);
        }
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoverAresta;
    private javax.swing.JCheckBox ckbPoligono;
    private javax.swing.JButton jButtonAdicionarAresta;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDesenhar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabeFormaNome;
    private javax.swing.JLabel jLabelFormaFinalCoordenadaX1;
    private javax.swing.JLabel jLabelFormaFinalCoordenadaY1;
    private javax.swing.JList<String> jListFormaArestas;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelForma;
    private javax.swing.JPanel jPanelFormaArestas;
    private javax.swing.JPanel jPanelFormaCor;
    private javax.swing.JPanel jPanelFormaInserirAresta;
    private javax.swing.JScrollPane jScrollPanePoligonoArestas;
    private javax.swing.JTextField jTextFieldFormaCoordenadaX;
    private javax.swing.JTextField jTextFieldFormaCoordenadaY;
    private javax.swing.JTextField jTextFieldFormaNome;
    // End of variables declaration//GEN-END:variables
}
