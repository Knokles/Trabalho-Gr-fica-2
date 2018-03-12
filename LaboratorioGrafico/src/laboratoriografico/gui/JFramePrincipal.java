package laboratoriografico.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import laboratoriografico.model.Forma;
import laboratoriografico.model.Linha;
import laboratoriografico.model.Matriz;
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

        Linha eixoX = new Linha("Eixo X", new Ponto(-1000.0, 0.0, Color.BLUE), new Ponto(1000.0, 0.0, Color.BLUE), Color.BLUE);
        Linha eixoY = new Linha("Eixo Y", new Ponto(0.0, -1000.0, Color.RED), new Ponto(0.0, 1000.0, Color.RED), Color.RED);
        formas.add(eixoX);
        formas.add(eixoY);
        lista.addElement(eixoX);
        lista.addElement(eixoY);

        initComponents();

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
        btnMatrizes = new javax.swing.JButton();
        btnBaixo = new javax.swing.JButton();
        btnCima = new javax.swing.JButton();
        btnDireita = new javax.swing.JButton();
        btnEsquerda = new javax.swing.JButton();
        btnZoonIn = new javax.swing.JButton();
        btnZoonOut = new javax.swing.JButton();
        jButtonDesenhar1 = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jListFormas);

        btnMatrizes.setBackground(new java.awt.Color(255, 0, 0));
        btnMatrizes.setText("Teste de Matrizes");
        btnMatrizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizesActionPerformed(evt);
            }
        });

        btnBaixo.setPreferredSize(new java.awt.Dimension(40, 40));
        btnBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaixoActionPerformed(evt);
            }
        });

        btnCima.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCimaActionPerformed(evt);
            }
        });

        btnDireita.setPreferredSize(new java.awt.Dimension(40, 40));
        btnDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaActionPerformed(evt);
            }
        });

        btnEsquerda.setPreferredSize(new java.awt.Dimension(40, 40));
        btnEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaActionPerformed(evt);
            }
        });

        btnZoonIn.setIcon(new javax.swing.ImageIcon("E:\\Repositorios\\Trabalho-Gr-fica-2\\LaboratorioGrafico\\imagens\\zoom-in.png")); // NOI18N
        btnZoonIn.setPreferredSize(new java.awt.Dimension(40, 40));
        btnZoonIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoonInActionPerformed(evt);
            }
        });

        btnZoonOut.setIcon(new javax.swing.ImageIcon("E:\\Repositorios\\Trabalho-Gr-fica-2\\LaboratorioGrafico\\imagens\\zoom-out.png")); // NOI18N
        btnZoonOut.setPreferredSize(new java.awt.Dimension(40, 40));
        btnZoonOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoonOutActionPerformed(evt);
            }
        });

        jButtonDesenhar1.setText("Editar");
        jButtonDesenhar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesenhar1ActionPerformed(evt);
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
                    .addComponent(btnMatrizes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelEsquerdoLayout.createSequentialGroup()
                        .addComponent(jButtonApagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDesenhar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(jButtonDesenhar1))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(btnMatrizes)
                .addContainerGap())
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
        panelDesenho.repaint();
    }//GEN-LAST:event_jButtonApagarActionPerformed

    private void jListFormasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jListFormasComponentAdded
        panelDesenho.repaint();
    }//GEN-LAST:event_jListFormasComponentAdded

    private void btnMatrizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizesActionPerformed
        System.out.println("\n<TESTE DE MATRIZES>");

        //Soma
        System.out.println("\n<----- Soma ----->");

        Matriz sm1 = new Matriz(3, 3, 4.0);
        System.out.println("\nMatriz sm1");
        sm1.imprimeMatriz();

        System.out.println("\nMatriz sm2");
        Matriz sm2 = Matriz.identidade(3);
        sm2.imprimeMatriz();

        System.out.println("\nMariz sm1+sm2");
        Matriz.soma(sm1, sm2).imprimeMatriz();

        //Multiplicação
        System.out.println("\n<----- Multiplicação ----->");
        Matriz mm1 = new Matriz(3, 2, 0.0);
        mm1.setValor(1, 1, 2);
        mm1.setValor(1, 2, 3);
        mm1.setValor(2, 1, 0);
        mm1.setValor(2, 2, 1);
        mm1.setValor(3, 1, -1);
        mm1.setValor(3, 2, 4);
        System.out.println("\nMatriz mm1");
        mm1.imprimeMatriz();

        Matriz mm2 = new Matriz(2, 3, 0.0);
        mm2.setValor(1, 1, 1);
        mm2.setValor(1, 2, 2);
        mm2.setValor(1, 3, 3);
        mm2.setValor(2, 1, -2);
        mm2.setValor(2, 2, 0);
        mm2.setValor(2, 3, 4);
        System.out.println("\nMatriz mm2");
        mm2.imprimeMatriz();

        System.out.println("\nMatriz mm1 x mm2");
        Matriz.multiplicacao(mm1, mm2).imprimeMatriz();

        System.out.println("\nMatriz mm2 x mm1");
        Matriz.multiplicacao(mm2, mm1).imprimeMatriz();

        System.out.println("\nMatriz mm1 x 2(escalar)");
        Matriz.multiplicacao(mm1, 2.0).imprimeMatriz();
    }//GEN-LAST:event_btnMatrizesActionPerformed

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

    private void jButtonDesenhar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesenhar1ActionPerformed
//        JFrameEditarForma editar = new JFrameEditarForma(this);
//        this.setEnabled(false);
//        editar.setVisible(true);
    }//GEN-LAST:event_jButtonDesenhar1ActionPerformed

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
    private javax.swing.JButton btnBaixo;
    private javax.swing.JButton btnCima;
    private javax.swing.JButton btnDireita;
    private javax.swing.JButton btnEsquerda;
    private javax.swing.JButton btnMatrizes;
    private javax.swing.JButton btnZoonIn;
    private javax.swing.JButton btnZoonOut;
    private javax.swing.JButton jButtonApagar;
    private javax.swing.JButton jButtonDesenhar;
    private javax.swing.JButton jButtonDesenhar1;
    private javax.swing.JList<String> jListFormas;
    private javax.swing.JPanel jPanelEsquerdo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDesenho;
    // End of variables declaration//GEN-END:variables
}
