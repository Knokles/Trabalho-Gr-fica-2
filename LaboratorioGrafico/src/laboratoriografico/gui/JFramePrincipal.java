package laboratoriografico.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import laboratoriografico.model.Forma;
import laboratoriografico.model.Mundo;
import laboratoriografico.model.Ponto;
import laboratoriografico.model.ViewPort;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class JFramePrincipal extends javax.swing.JFrame {

    private List<Forma> formas;
    private DefaultListModel lista;
    private Mundo mundo;
    private ViewPort vp;

    public JFramePrincipal() {
        formas = new ArrayList();
        lista = new DefaultListModel();
        mundo = new Mundo(-1000.0, 1000.0, -1000.0, 1000.0);
        vp = new ViewPort(mundo);

        Forma eixoX = new Forma("Eixo X", new Ponto(-1000.0, 0.0), Color.BLUE, false);
        eixoX.addAresta(new Ponto(1000.0, 0.0));
        Forma eixoY = new Forma("Eixo Y", new Ponto(0.0, -1000.0), Color.RED, false);
        eixoY.addAresta(new Ponto(0.0, 1000.0));
        formas.add(eixoX);
        formas.add(eixoY);
        lista.addElement(eixoX);
        lista.addElement(eixoY);

        initComponents();

        jButtonApagar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jListFormas.setModel(lista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelViewPort = new javax.swing.JPanel();
        panelDesenho = new laboratoriografico.gui.JDesenho(formas, vp);
        jPanelEsquerdo = new javax.swing.JPanel();
        jButtonDesenhar = new javax.swing.JButton();
        jButtonApagar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListFormas = new javax.swing.JList<>();
        btnBaixo = new javax.swing.JButton();
        btnCima = new javax.swing.JButton();
        btnDireita = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        btnZoonIn = new javax.swing.JButton();
        btnZoonOut = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();

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

        jPanelEsquerdo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanelEsquerdoFocusGained(evt);
            }
        });

        jButtonDesenhar.setText("Desenhar");
        jButtonDesenhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesenharActionPerformed(evt);
            }
        });

        jButtonApagar.setText("Apagar");
        jButtonApagar.setPreferredSize(new java.awt.Dimension(79, 23));
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
        jListFormas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListFormasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListFormas);

        btnBaixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratoriografico/imagens/baixo.png"))); // NOI18N
        btnBaixo.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixoActionPerformed(evt);
            }
        });

        btnCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratoriografico/imagens/cima.png"))); // NOI18N
        btnCima.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCimaActionPerformed(evt);
            }
        });

        btnDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratoriografico/imagens/direita.png"))); // NOI18N
        btnDireita.setPreferredSize(new java.awt.Dimension(40, 40));
        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });

        btnEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratoriografico/imagens/esquerda.png"))); // NOI18N
        btnEsquerda.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });

        btnZoonIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratoriografico/imagens/zoom-in.png"))); // NOI18N
        btnZoonIn.setPreferredSize(new java.awt.Dimension(40, 40));
        btnZoonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoonInActionPerformed(evt);
            }
        });

        btnZoonOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratoriografico/imagens/zoom-out.png"))); // NOI18N
        btnZoonOut.setPreferredSize(new java.awt.Dimension(40, 40));
        btnZoonOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoonOutActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEsquerdoLayout = new javax.swing.GroupLayout(jPanelEsquerdo);
        jPanelEsquerdo.setLayout(jPanelEsquerdoLayout);
        jPanelEsquerdoLayout.setHorizontalGroup(
            jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDesenhar))))
            .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnZoonIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZoonOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanelEsquerdoLayout.setVerticalGroup(
            jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEsquerdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDesenhar)
                    .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEditar))
                .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEsquerdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnZoonIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnZoonOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelEsquerdo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(JPanelViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDesenharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesenharActionPerformed
        JFrameDesenharForma desenhar = new JFrameDesenharForma(this);
        this.setEnabled(false);
        desenhar.setVisible(true);
    }//GEN-LAST:event_jButtonDesenharActionPerformed

    private void jButtonApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApagarActionPerformed
        formas.remove(jListFormas.getSelectedIndex());
        lista.remove(jListFormas.getSelectedIndex());
        limpaSelecao();
        panelDesenho.repaint();
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jListFormasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jListFormasComponentAdded
        panelDesenho.repaint();
    }//GEN-LAST:event_jListFormasComponentAdded

    private void btnZoonInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoonInActionPerformed
        vp.setZoom(vp.getZoom() * 2);
        panelDesenho.repaint();
    }//GEN-LAST:event_btnZoonInActionPerformed

    private void btnZoonOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoonOutActionPerformed
        vp.setZoom(vp.getZoom() / 2);
        panelDesenho.repaint();
    }//GEN-LAST:event_btnZoonOutActionPerformed

    private void btnCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCimaActionPerformed
        vp.setDesY(vp.getDesY() + 10);
        panelDesenho.repaint();
    }//GEN-LAST:event_btnCimaActionPerformed

    private void btnBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaixoActionPerformed
        vp.setDesY(vp.getDesY() - 10);
        panelDesenho.repaint();
    }//GEN-LAST:event_btnBaixoActionPerformed

    private void btnEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaActionPerformed
        vp.setDesX(vp.getDesX() - 10);
        panelDesenho.repaint();
    }//GEN-LAST:event_btnEsquerdaActionPerformed

    private void btnDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaActionPerformed
        vp.setDesX(vp.getDesX() + 10);
        panelDesenho.repaint();
    }//GEN-LAST:event_btnDireitaActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        JFrameEditarForma editar = new JFrameEditarForma(this, formas.get(jListFormas.getSelectedIndex()));
        this.setEnabled(false);
        editar.setVisible(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jListFormasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListFormasMouseClicked
        if (jListFormas.getSelectedIndex() > 0) {
            jButtonApagar.setEnabled(true);
            jButtonEditar.setEnabled(true);
        }
    }//GEN-LAST:event_jListFormasMouseClicked

    private void jPanelEsquerdoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelEsquerdoFocusGained
        jListFormas.setSelectedIndex(-1);
        jButtonApagar.setEnabled(false);
        jButtonEditar.setEnabled(false);
    }//GEN-LAST:event_jPanelEsquerdoFocusGained

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

    public void limpaSelecao() {
        jListFormas.setSelectedIndex(-1);
        jButtonApagar.setEnabled(false);
        jButtonEditar.setEnabled(false);
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
    private javax.swing.JButton btnBaixo;
    private javax.swing.JButton btnCima;
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JButton btnZoonIn;
    private javax.swing.JButton btnZoonOut;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonDesenhar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JList<String> jListFormas;
    private javax.swing.JPanel jPanelEsquerdo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDesenho;
    // End of variables declaration//GEN-END:variables
}
