package laboratoriografico.gui;

import laboratoriografico.model.Forma;
import laboratoriografico.model.Ponto;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 13/03/2018
 *
 */
public class JFrameEditarForma extends javax.swing.JFrame {

    private JFramePrincipal frmPai = null;
    private Forma forma;

    /**
     * Creates new form JFrameDesenhar
     *
     * @param frmPai
     * @param forma
     *
     */
    public JFrameEditarForma(JFramePrincipal frmPai, Forma forma) {
        this.frmPai = frmPai;
        this.forma = forma;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPaneTransformadas = new javax.swing.JTabbedPane();
        jPanelPonto = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblDx = new javax.swing.JLabel();
        txfDx = new javax.swing.JTextField();
        txfDy = new javax.swing.JTextField();
        lblDy = new javax.swing.JLabel();
        jPanelLinha = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfAngulo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelMultiLinha = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSx = new javax.swing.JLabel();
        txfSx = new javax.swing.JTextField();
        txfSy = new javax.swing.JTextField();
        lblSy = new javax.swing.JLabel();
        ckbEscalonamentoOrigem = new javax.swing.JCheckBox();
        jPanelBotoes = new javax.swing.JPanel();
        jButtonEditar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        jInternalFrame1.setVisible(true);

        org.jdesktop.layout.GroupLayout jInternalFrame1Layout = new org.jdesktop.layout.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor de Translação"));

        lblDx.setText("Dx");

        lblDy.setText("Dy");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblDx)
                    .add(lblDy))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(txfDx, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .add(txfDy))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblDx)
                    .add(txfDx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfDy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblDy))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanelPontoLayout = new org.jdesktop.layout.GroupLayout(jPanelPonto);
        jPanelPonto.setLayout(jPanelPontoLayout);
        jPanelPontoLayout.setHorizontalGroup(
            jPanelPontoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelPontoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPontoLayout.setVerticalGroup(
            jPanelPontoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelPontoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPaneTransformadas.addTab("Translação", jPanelPonto);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ângulo de Rotação"));

        jLabel1.setText("Ângulo");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txfAngulo)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                .add(jLabel1)
                .add(txfAngulo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Rotacionar"));

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Rotacionar da Origem");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jRadioButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jRadioButton1)
        );

        org.jdesktop.layout.GroupLayout jPanelLinhaLayout = new org.jdesktop.layout.GroupLayout(jPanelLinha);
        jPanelLinha.setLayout(jPanelLinhaLayout);
        jPanelLinhaLayout.setHorizontalGroup(
            jPanelLinhaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelLinhaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLinhaLayout.setVerticalGroup(
            jPanelLinhaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPaneTransformadas.addTab("Rotação", jPanelLinha);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor de Escalonamento"));

        lblSx.setText("Sx");

        lblSy.setText("Sy");

        ckbEscalonamentoOrigem.setText("Em relação a origem");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(lblSx)
                            .add(lblSy))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(txfSx, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .add(txfSy)))
                    .add(ckbEscalonamentoOrigem))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblSx)
                    .add(txfSx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfSy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblSy))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(ckbEscalonamentoOrigem)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanelMultiLinhaLayout = new org.jdesktop.layout.GroupLayout(jPanelMultiLinha);
        jPanelMultiLinha.setLayout(jPanelMultiLinhaLayout);
        jPanelMultiLinhaLayout.setHorizontalGroup(
            jPanelMultiLinhaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelMultiLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMultiLinhaLayout.setVerticalGroup(
            jPanelMultiLinhaLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelMultiLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTransformadas.addTab("Escalonamento", jPanelMultiLinha);

        jPanelBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanelBotoesLayout = new org.jdesktop.layout.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonCancelar)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonEditar)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelBotoesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonCancelar)
                    .add(jButtonEditar))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jTabbedPaneTransformadas)
                    .add(jPanelBotoes, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jTabbedPaneTransformadas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 173, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelBotoes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        close();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        close();
    }//GEN-LAST:event_formWindowClosed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        switch (jTabbedPaneTransformadas.getSelectedIndex()) {
            case 0:
                double dX = Double.parseDouble(txfDx.getText().replace(",", "."));
                double dY = Double.parseDouble(txfDy.getText().replace(",", "."));
                for (Ponto ponto : forma.getArestas()) {
                    ponto.setCordX(ponto.getCordX() + dX);
                    ponto.setCordY(ponto.getCordY() + dY);
                }
                break;
            case 1:
                double alfa = Double.parseDouble(txfAngulo.getText().replace(",", "."));

                for (Ponto ponto : forma.getArestas()) {
                    double x = ponto.getCordX();
                    double y = ponto.getCordY();
                    ponto.setCordX((x * Math.cos(Math.PI / 180 * alfa))
                            - (y * Math.sin(Math.PI / 180 * alfa)));
                    ponto.setCordY((x * Math.sin(Math.PI / 180 * alfa))
                            + (y * Math.cos(Math.PI / 180 * alfa)));
                }
                break;
            case 2:
                double sX = Double.parseDouble(txfSx.getText().replace(",", "."));
                double sY = Double.parseDouble(txfSy.getText().replace(",", "."));
                if (ckbEscalonamentoOrigem.isSelected()) {
                    //Implementar para o ponto mais próximo
                    double desX = forma.getArestas().get(0).getCordX();
                    double desY = forma.getArestas().get(0).getCordY();
                    for (Ponto ponto : forma.getArestas()) {
                        ponto.setCordX(((ponto.getCordX() - desX) * sX) + desX);
                        ponto.setCordY(((ponto.getCordY() - desY) * sY) + desY);
                    }
                } else {
                    for (Ponto ponto : forma.getArestas()) {
                        ponto.setCordX(ponto.getCordX() * sX);
                        ponto.setCordY(ponto.getCordY() * sY);
                    }
                }
                break;
        }
        frmPai.getPanelDesenho().repaint();
        frmPai.getjListFormas().repaint();
        close();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void close() {
        if (frmPai != null) {
            frmPai.setEnabled(true);
        }
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ckbEscalonamentoOrigem;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelLinha;
    private javax.swing.JPanel jPanelMultiLinha;
    private javax.swing.JPanel jPanelPonto;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTabbedPane jTabbedPaneTransformadas;
    private javax.swing.JLabel lblDx;
    private javax.swing.JLabel lblDy;
    private javax.swing.JLabel lblSx;
    private javax.swing.JLabel lblSy;
    private javax.swing.JTextField txfAngulo;
    private javax.swing.JTextField txfDx;
    private javax.swing.JTextField txfDy;
    private javax.swing.JTextField txfSx;
    private javax.swing.JTextField txfSy;
    // End of variables declaration//GEN-END:variables
}
