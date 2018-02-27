package laboratoriografico.gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import laboratoriografico.model.Forma;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class JFramePrincipal extends javax.swing.JFrame {

    List<Forma> formas;
    private DefaultListModel lista;

    public JFramePrincipal() {
        formas = new ArrayList();
        lista = new DefaultListModel();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelViewPort = new javax.swing.JPanel();
        panelDesenho = new laboratoriografico.gui.JDesenho(formas);
        jPanelEsquerdo = new javax.swing.JPanel();
        jButtonDesenhar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFormas = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 570));
        setMinimumSize(new java.awt.Dimension(800, 570));
        setPreferredSize(new java.awt.Dimension(800, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 570));

        JPanelViewPort.setBorder(javax.swing.BorderFactory.createTitledBorder("ViewPort"));
        JPanelViewPort.setMaximumSize(new java.awt.Dimension(520, 520));
        JPanelViewPort.setMinimumSize(new java.awt.Dimension(520, 520));
        JPanelViewPort.setPreferredSize(new java.awt.Dimension(520, 520));
        JPanelViewPort.setRequestFocusEnabled(false);

        panelDesenho.setBackground(java.awt.Color.white);
        panelDesenho.setMaximumSize(new java.awt.Dimension(500, 500));
        panelDesenho.setMinimumSize(new java.awt.Dimension(500, 500));
        panelDesenho.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout panelDesenhoLayout = new javax.swing.GroupLayout(panelDesenho);
        panelDesenho.setLayout(panelDesenhoLayout);
        panelDesenhoLayout.setHorizontalGroup(
            panelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelDesenhoLayout.setVerticalGroup(
            panelDesenhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPanelViewPortLayout = new javax.swing.GroupLayout(JPanelViewPort);
        JPanelViewPort.setLayout(JPanelViewPortLayout);
        JPanelViewPortLayout.setHorizontalGroup(
            JPanelViewPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        JPanelViewPortLayout.setVerticalGroup(
            JPanelViewPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDesenho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButtonDesenhar.setText("Desenhar");
        jButtonDesenhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesenharActionPerformed(evt);
            }
        });

        jButtonApagar.setText("Apagar");
        jButtonApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApagarActionPerformed(evt);
            }
        });

        jListFormas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jListFormasComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jListFormas);

        javax.swing.GroupLayout jPanelEsquerdoLayout = new javax.swing.GroupLayout(jPanelEsquerdo);
        jPanelEsquerdo.setLayout(jPanelEsquerdoLayout);
        jPanelEsquerdoLayout.setHorizontalGroup(
            jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDesenhar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelEsquerdoLayout.setVerticalGroup(
            jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDesenhar)
                    .addComponent(jButtonApagar))
                .addContainerGap(291, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelEsquerdo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEsquerdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPanelViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDesenharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesenharActionPerformed
        JFrameDesenhar desenhar = new JFrameDesenhar(this);
        this.setEnabled(false);
        desenhar.setVisible(true);
    }//GEN-LAST:event_jButtonDesenharActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        formas.remove(jListFormas.getSelectedIndex());
        lista.remove(jListFormas.getSelectedIndex());
        panelDesenho.repaint();
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jListFormasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jListFormasComponentAdded
        panelDesenho.repaint();
    }//GEN-LAST:event_jListFormasComponentAdded

    public List<Forma> getFormas() {
        return formas;
    }

    public void setFormas(List<Forma> formas) {
        this.formas = formas;
    }

    public JPanel getPanelDesenho() {
        return panelDesenho;
    }

    public void setPanelDesenho(JPanel panelDesenho) {
        this.panelDesenho = panelDesenho;
    }

    public DefaultListModel getLista() {
        return lista;
    }

    public void setLista(DefaultListModel lista) {
        this.lista = lista;
    }

    public JList<String> getjListFormas() {
        return jListFormas;
    }

    public void setjListFormas(JList<String> jListFormas) {
        this.jListFormas = jListFormas;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelViewPort;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonDesenhar;
    private javax.swing.JList<String> jListFormas;
    private javax.swing.JPanel jPanelEsquerdo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDesenho;
    // End of variables declaration//GEN-END:variables
}
