package laboratoriografico.gui;

import java.text.DecimalFormat;
import laboratoriografico.model.Forma;
import laboratoriografico.model.Matriz;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 13/03/2018
 *
 */
public class JFrameEditarForma extends javax.swing.JFrame {

    private JFramePrincipal frmPai = null;
    private Forma forma;
    DecimalFormat df = new DecimalFormat("#0.00");

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

        jcbRotacionarVertice.addItem("");
        for (int i = 1; i < forma.getArestas().getLinhas() + 1; i++) {
            jcbRotacionarVertice.addItem("x = " + df.format(forma.getArestas().getValor(i, 1))
                    + "; y = " + df.format(forma.getArestas().getValor(i, 2))
                    + "; z = " + df.format(forma.getArestas().getValor(i, 3)));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        bgRotacionar = new javax.swing.ButtonGroup();
        bgEscalonar = new javax.swing.ButtonGroup();
        bgEixo = new javax.swing.ButtonGroup();
        bgReflexao = new javax.swing.ButtonGroup();
        jTabbedPaneTransformadas = new javax.swing.JTabbedPane();
        jPanelTranslacao = new javax.swing.JPanel();
        lblDx = new javax.swing.JLabel();
        txfDx = new javax.swing.JTextField();
        txfDy = new javax.swing.JTextField();
        lblDy = new javax.swing.JLabel();
        lblDz = new javax.swing.JLabel();
        txfDz = new javax.swing.JTextField();
        jPanelRotacao = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txfAngulo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jrbRotacionarOrigem = new javax.swing.JRadioButton();
        jrbRotacionarVertice = new javax.swing.JRadioButton();
        jrbRotacionarCentro = new javax.swing.JRadioButton();
        jcbRotacionarVertice = new javax.swing.JComboBox<>();
        jrbRotacionarPonto = new javax.swing.JRadioButton();
        jtfRotacionarPontoX = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfRotacionarPontoY = new javax.swing.JTextField();
        jtfRotacionarPontoZ = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbEixoX = new javax.swing.JRadioButton();
        rbEixoZ = new javax.swing.JRadioButton();
        rbEixoY = new javax.swing.JRadioButton();
        jPanelEscalonamento = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblSx = new javax.swing.JLabel();
        txfSx = new javax.swing.JTextField();
        txfSy = new javax.swing.JTextField();
        lblSy = new javax.swing.JLabel();
        lblSz = new javax.swing.JLabel();
        txfSz = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jrbEscalonaSimples = new javax.swing.JRadioButton();
        jrbEscalonaOrigem = new javax.swing.JRadioButton();
        jrbEscalonaCentro = new javax.swing.JRadioButton();
        jPanelReflexao = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rbPlanoYZ = new javax.swing.JRadioButton();
        rbPlanoXZ = new javax.swing.JRadioButton();
        rbPlanoXY = new javax.swing.JRadioButton();
        jPanelCisalhamento = new javax.swing.JPanel();
        lblShYZ = new javax.swing.JLabel();
        txfShXZ = new javax.swing.JTextField();
        txfShYZ = new javax.swing.JTextField();
        lblShXZ = new javax.swing.JLabel();
        lblShXY = new javax.swing.JLabel();
        txfShXY = new javax.swing.JTextField();
        lblShYX = new javax.swing.JLabel();
        txfShYX = new javax.swing.JTextField();
        lblShZY = new javax.swing.JLabel();
        txfShZY = new javax.swing.JTextField();
        lblShZX = new javax.swing.JLabel();
        txfShZX = new javax.swing.JTextField();
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

        lblDx.setText("Dx");

        txfDx.setText("0");

        txfDy.setText("0");

        lblDy.setText("Dy");

        lblDz.setText("Dz");

        txfDz.setText("0");

        org.jdesktop.layout.GroupLayout jPanelTranslacaoLayout = new org.jdesktop.layout.GroupLayout(jPanelTranslacao);
        jPanelTranslacao.setLayout(jPanelTranslacaoLayout);
        jPanelTranslacaoLayout.setHorizontalGroup(
            jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelTranslacaoLayout.createSequentialGroup()
                .add(32, 32, 32)
                .add(jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(lblDy)
                    .add(lblDx)
                    .add(lblDz))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(txfDz)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txfDx, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, txfDy))
                .add(26, 26, 26))
        );
        jPanelTranslacaoLayout.setVerticalGroup(
            jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelTranslacaoLayout.createSequentialGroup()
                .add(60, 60, 60)
                .add(jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfDx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblDx))
                .add(8, 8, 8)
                .add(jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfDy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblDy))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelTranslacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfDz, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblDz))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPaneTransformadas.addTab("Translação", jPanelTranslacao);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Ângulo de Rotação"));

        jLabel1.setText("Ângulo");

        txfAngulo.setText("0");

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

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bgRotacionar.add(jrbRotacionarOrigem);
        jrbRotacionarOrigem.setSelected(true);
        jrbRotacionarOrigem.setText("Rotacionar da Origem");
        jrbRotacionarOrigem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbRotacionarMouseClicked(evt);
            }
        });

        bgRotacionar.add(jrbRotacionarVertice);
        jrbRotacionarVertice.setText("Rotacinar em torno do vértice");
        jrbRotacionarVertice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbRotacionarMouseClicked(evt);
            }
        });

        bgRotacionar.add(jrbRotacionarCentro);
        jrbRotacionarCentro.setText("Rotacionar em torno do centro da forma");
        jrbRotacionarCentro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbRotacionarMouseClicked(evt);
            }
        });

        jcbRotacionarVertice.setModel(new javax.swing.DefaultComboBoxModel<>());
        jcbRotacionarVertice.setEnabled(false);

        bgRotacionar.add(jrbRotacionarPonto);
        jrbRotacionarPonto.setText("Rotacinar em torno do ponto X:");
        jrbRotacionarPonto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbRotacionarMouseClicked(evt);
            }
        });

        jtfRotacionarPontoX.setEnabled(false);

        jLabel2.setText("Y:");

        jtfRotacionarPontoY.setEnabled(false);

        jtfRotacionarPontoZ.setEnabled(false);

        jLabel3.setText("Z:");

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(jPanel4Layout.createSequentialGroup()
                            .add(jrbRotacionarVertice)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jcbRotacionarVertice, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel4Layout.createSequentialGroup()
                            .add(jrbRotacionarPonto)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jtfRotacionarPontoX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jLabel2)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jtfRotacionarPontoY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jLabel3)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jtfRotacionarPontoZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jrbRotacionarOrigem)
                    .add(jrbRotacionarCentro))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jrbRotacionarOrigem)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jrbRotacionarCentro)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jrbRotacionarVertice)
                    .add(jcbRotacionarVertice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jrbRotacionarPonto)
                    .add(jtfRotacionarPontoX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2)
                    .add(jtfRotacionarPontoY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jtfRotacionarPontoZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3)))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eixo"));

        bgEixo.add(rbEixoX);
        rbEixoX.setText("Eixo X");

        bgEixo.add(rbEixoZ);
        rbEixoZ.setSelected(true);
        rbEixoZ.setText("Eixo Z");

        bgEixo.add(rbEixoY);
        rbEixoY.setText("Eixo Y");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rbEixoX)
                    .add(rbEixoY)
                    .add(rbEixoZ))
                .add(0, 78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(rbEixoX)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbEixoY)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbEixoZ)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanelRotacaoLayout = new org.jdesktop.layout.GroupLayout(jPanelRotacao);
        jPanelRotacao.setLayout(jPanelRotacaoLayout);
        jPanelRotacaoLayout.setHorizontalGroup(
            jPanelRotacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelRotacaoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelRotacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanelRotacaoLayout.createSequentialGroup()
                        .add(jPanel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelRotacaoLayout.setVerticalGroup(
            jPanelRotacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelRotacaoLayout.createSequentialGroup()
                .add(jPanelRotacaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPaneTransformadas.addTab("Rotação", jPanelRotacao);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor"));

        lblSx.setText("Sx");

        txfSx.setText("1");

        txfSy.setText("1");

        lblSy.setText("Sy");

        lblSz.setText("Sz");

        txfSz.setText("1");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(lblSx)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txfSx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lblSy)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txfSy)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lblSz)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(txfSz, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(txfSy, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(lblSy)
                        .add(lblSz)
                        .add(txfSz, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(lblSx)
                        .add(txfSx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bgEscalonar.add(jrbEscalonaSimples);
        jrbEscalonaSimples.setSelected(true);
        jrbEscalonaSimples.setText("Escalonamento Simples");

        bgEscalonar.add(jrbEscalonaOrigem);
        jrbEscalonaOrigem.setText("Escalonamento em relação a origem");

        bgEscalonar.add(jrbEscalonaCentro);
        jrbEscalonaCentro.setText("Escalonamento ao redor do centro da forma");

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jrbEscalonaSimples)
                    .add(jrbEscalonaOrigem)
                    .add(jrbEscalonaCentro))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(jrbEscalonaSimples)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jrbEscalonaOrigem)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jrbEscalonaCentro))
        );

        org.jdesktop.layout.GroupLayout jPanelEscalonamentoLayout = new org.jdesktop.layout.GroupLayout(jPanelEscalonamento);
        jPanelEscalonamento.setLayout(jPanelEscalonamentoLayout);
        jPanelEscalonamentoLayout.setHorizontalGroup(
            jPanelEscalonamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelEscalonamentoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelEscalonamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelEscalonamentoLayout.setVerticalGroup(
            jPanelEscalonamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelEscalonamentoLayout.createSequentialGroup()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPaneTransformadas.addTab("Escalonamento", jPanelEscalonamento);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Refletir"));

        bgReflexao.add(rbPlanoYZ);
        rbPlanoYZ.setText("Em torno do plano Y/Z");

        bgReflexao.add(rbPlanoXZ);
        rbPlanoXZ.setText("Em torno do plano X/Z");

        bgReflexao.add(rbPlanoXY);
        rbPlanoXY.setText("Em torno do plano X/Y");

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(rbPlanoXY)
                    .add(rbPlanoXZ)
                    .add(rbPlanoYZ))
                .addContainerGap(311, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(rbPlanoYZ)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbPlanoXZ)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(rbPlanoXY)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout jPanelReflexaoLayout = new org.jdesktop.layout.GroupLayout(jPanelReflexao);
        jPanelReflexao.setLayout(jPanelReflexaoLayout);
        jPanelReflexaoLayout.setHorizontalGroup(
            jPanelReflexaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelReflexaoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelReflexaoLayout.setVerticalGroup(
            jPanelReflexaoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelReflexaoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPaneTransformadas.addTab("Reflexão", jPanelReflexao);

        lblShYZ.setText("Sh YZ");

        txfShXZ.setText("0");

        txfShYZ.setText("0");

        lblShXZ.setText("Sh XZ");

        lblShXY.setText("Sh XY");

        txfShXY.setText("0");

        lblShYX.setText("Sh YX");

        txfShYX.setText("0");

        lblShZY.setText("Sh ZY");

        txfShZY.setText("0");

        lblShZX.setText("Sh ZX");

        txfShZX.setText("0");

        org.jdesktop.layout.GroupLayout jPanelCisalhamentoLayout = new org.jdesktop.layout.GroupLayout(jPanelCisalhamento);
        jPanelCisalhamento.setLayout(jPanelCisalhamentoLayout);
        jPanelCisalhamentoLayout.setHorizontalGroup(
            jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanelCisalhamentoLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelCisalhamentoLayout.createSequentialGroup()
                        .add(lblShXY)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(txfShXY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 42, Short.MAX_VALUE)
                        .add(lblShYX)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(txfShYX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jPanelCisalhamentoLayout.createSequentialGroup()
                        .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelCisalhamentoLayout.createSequentialGroup()
                                .add(lblShYZ)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txfShYZ))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jPanelCisalhamentoLayout.createSequentialGroup()
                                .add(lblShXZ)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(txfShXZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 175, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblShZX)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, lblShZY))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(txfShZX, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .add(txfShZY))))
                .addContainerGap())
        );
        jPanelCisalhamentoLayout.setVerticalGroup(
            jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanelCisalhamentoLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfShXY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblShXY)
                    .add(txfShYX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblShYX))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfShXZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblShXZ)
                    .add(txfShZX, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblShZX))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelCisalhamentoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(txfShYZ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblShYZ)
                    .add(txfShZY, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblShZY))
                .add(48, 48, 48))
        );

        jTabbedPaneTransformadas.addTab("Cisalhamento", jPanelCisalhamento);

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
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelBotoes, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jTabbedPaneTransformadas))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jTabbedPaneTransformadas, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanelBotoes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        Matriz trans = Matriz.identidade(4);
        Matriz auxTrans = Matriz.identidade(4);
        Matriz nArestas = forma.getArestas();
        nArestas.addColuna(1.0);

        switch (jTabbedPaneTransformadas.getSelectedIndex()) {
            case 0:     //Translação
                double dX = Double.parseDouble(txfDx.getText().replace(",", "."));
                double dY = Double.parseDouble(txfDy.getText().replace(",", "."));
                double dZ = Double.parseDouble(txfDz.getText().replace(",", "."));

                trans.setValor(4, 1, dX);
                trans.setValor(4, 2, dY);
                trans.setValor(4, 3, dZ);

                break;

            case 1:     //Rotação
                double alfa = Double.parseDouble(txfAngulo.getText().replace(",", "."));
                double pontoX = 0;
                double pontoY = 0;
                double pontoZ = 0;

                if (jrbRotacionarOrigem.isSelected()) {
                    pontoX = 0;
                    pontoY = 0;
                    pontoZ = 0;
                } else if (jrbRotacionarCentro.isSelected()) {
                    pontoX = forma.getPontoMedioX();
                    pontoY = forma.getPontoMedioY();
                    pontoZ = forma.getPontoMedioZ();
                } else if (jrbRotacionarVertice.isSelected()) {
                    pontoX = forma.getArestas().getValor(jcbRotacionarVertice.getSelectedIndex(), 1);
                    pontoY = forma.getArestas().getValor(jcbRotacionarVertice.getSelectedIndex(), 2);
                    pontoZ = forma.getArestas().getValor(jcbRotacionarVertice.getSelectedIndex(), 3);
                } else if (jrbRotacionarPonto.isSelected()) {
                    pontoX = Double.parseDouble(jtfRotacionarPontoX.getText().replace(",", "."));
                    pontoY = Double.parseDouble(jtfRotacionarPontoY.getText().replace(",", "."));
                    pontoZ = Double.parseDouble(jtfRotacionarPontoZ.getText().replace(",", "."));
                }

                trans.setValor(4, 1, -pontoX);
                trans.setValor(4, 2, -pontoY);
                trans.setValor(4, 3, -pontoZ);

                //Verifica em que eixo a rotação será feita
                if (rbEixoZ.isSelected()) {
                    auxTrans.setValor(1, 1, Math.cos(Math.PI / 180 * alfa));
                    auxTrans.setValor(1, 2, Math.sin(Math.PI / 180 * alfa));
                    auxTrans.setValor(2, 1, -Math.sin(Math.PI / 180 * alfa));
                    auxTrans.setValor(2, 2, Math.cos(Math.PI / 180 * alfa));
                } else if (rbEixoY.isSelected()) {
                    auxTrans.setValor(1, 1, Math.cos(Math.PI / 180 * alfa));
                    auxTrans.setValor(1, 3, -Math.sin(Math.PI / 180 * alfa));
                    auxTrans.setValor(3, 1, Math.sin(Math.PI / 180 * alfa));
                    auxTrans.setValor(3, 3, Math.cos(Math.PI / 180 * alfa));
                } else {
                    auxTrans.setValor(2, 2, Math.cos(Math.PI / 180 * alfa));
                    auxTrans.setValor(2, 3, Math.sin(Math.PI / 180 * alfa));
                    auxTrans.setValor(3, 2, -Math.sin(Math.PI / 180 * alfa));
                    auxTrans.setValor(3, 3, Math.cos(Math.PI / 180 * alfa));
                }

                trans = Matriz.multiplicacao(trans, auxTrans);

                auxTrans = Matriz.identidade(4);
                auxTrans.setValor(4, 1, pontoX);
                auxTrans.setValor(4, 2, pontoY);
                auxTrans.setValor(4, 3, pontoZ);
                trans = Matriz.multiplicacao(trans, auxTrans);

                break;

            case 2:     //Escalonamento
                double sX = Double.parseDouble(txfSx.getText().replace(",", "."));
                double sY = Double.parseDouble(txfSy.getText().replace(",", "."));
                double sZ = Double.parseDouble(txfSz.getText().replace(",", "."));

                if (jrbEscalonaSimples.isSelected()) {
                    trans.setValor(1, 1, sX);
                    trans.setValor(2, 2, sY);
                    trans.setValor(3, 3, sZ);
                } else if (jrbEscalonaOrigem.isSelected()) {
                    //Implementar para o ponto mais próximo
                    double desX = forma.getArestas().getValor(1, 1);
                    double desY = forma.getArestas().getValor(1, 2);
                    double desZ = forma.getArestas().getValor(1, 3);

                    trans.setValor(4, 1, -desX);
                    trans.setValor(4, 2, -desY);
                    trans.setValor(4, 3, -desZ);

                    auxTrans.setValor(1, 1, sX);
                    auxTrans.setValor(2, 2, sY);
                    auxTrans.setValor(3, 3, sZ);

                    trans = Matriz.multiplicacao(trans, auxTrans);

                    auxTrans = Matriz.identidade(4);
                    auxTrans.setValor(4, 1, desX);
                    auxTrans.setValor(4, 2, desY);
                    auxTrans.setValor(4, 3, desZ);

                    trans = Matriz.multiplicacao(trans, auxTrans);
                } else if (jrbEscalonaCentro.isSelected()) {
                    double medioX = forma.getPontoMedioX();
                    double medioY = forma.getPontoMedioY();
                    double medioZ = forma.getPontoMedioZ();

                    trans.setValor(4, 1, -medioX);
                    trans.setValor(4, 2, -medioY);
                    trans.setValor(4, 3, -medioZ);

                    auxTrans.setValor(1, 1, sX);
                    auxTrans.setValor(2, 2, sY);
                    auxTrans.setValor(3, 3, sZ);

                    trans = Matriz.multiplicacao(trans, auxTrans);

                    auxTrans = Matriz.identidade(4);
                    auxTrans.setValor(4, 1, medioX);
                    auxTrans.setValor(4, 2, medioY);
                    auxTrans.setValor(4, 3, medioZ);

                    trans = Matriz.multiplicacao(trans, auxTrans);
                }
                break;
            case 3:     //Reflexão
                if (rbPlanoYZ.isSelected()) {
                    trans.setValor(1, 1, -1);
                }
                if (rbPlanoXZ.isSelected()) {
                    trans.setValor(2, 2, -1);
                }
                if (rbPlanoXY.isSelected()) {
                    trans.setValor(3, 3, -1);
                }
                break;
            case 4:     //Cizalhamento
                double shXY = Double.parseDouble(txfShXY.getText().replace(",", "."));
                double shYX = Double.parseDouble(txfShYX.getText().replace(",", "."));
                double shXZ = Double.parseDouble(txfShXZ.getText().replace(",", "."));
                double shZX = Double.parseDouble(txfShZX.getText().replace(",", "."));
                double shYZ = Double.parseDouble(txfShYZ.getText().replace(",", "."));
                double shZY = Double.parseDouble(txfShZY.getText().replace(",", "."));

                trans.setValor(1, 2, shXY);
                trans.setValor(1, 3, shXZ);
                trans.setValor(2, 1, shYX);
                trans.setValor(2, 3, shYZ);
                trans.setValor(3, 1, shZX);
                trans.setValor(3, 2, shZY);

                //Montgem da matriz de cizalhamento em 3D
                //   1     2    3    4
                //   X     Y    Z    O
                //1X|1     xy   xz   0|
                //2Y|yx    1    yz   0|
                //3Z|zx    zy   1    0|
                //4O|0     0    0    1|

                break;
        }

        nArestas = Matriz.multiplicacao(nArestas, trans);
        nArestas.remColuna(4);
        forma.setArestas(nArestas);

        frmPai.getPanelDesenho().repaint();
        frmPai.getjListFormas().repaint();
        close();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jrbRotacionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbRotacionarMouseClicked
        if (jrbRotacionarVertice.isSelected()) {
            jcbRotacionarVertice.setEnabled(true);
        } else {
            jcbRotacionarVertice.setEnabled(false);
            jcbRotacionarVertice.setSelectedIndex(0);
        }
        if (jrbRotacionarPonto.isSelected()) {
            jtfRotacionarPontoX.setEnabled(true);
            jtfRotacionarPontoY.setEnabled(true);
            jtfRotacionarPontoZ.setEnabled(true);
        } else {
            jtfRotacionarPontoX.setText("");
            jtfRotacionarPontoX.setEnabled(false);
            jtfRotacionarPontoY.setText("");
            jtfRotacionarPontoY.setEnabled(false);
            jtfRotacionarPontoZ.setText("");
            jtfRotacionarPontoZ.setEnabled(false);
        }
    }//GEN-LAST:event_jrbRotacionarMouseClicked

    private void close() {
        if (frmPai != null) {
            frmPai.setEnabled(true);
            frmPai.limpaSelecao();
        }
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEixo;
    private javax.swing.ButtonGroup bgEscalonar;
    private javax.swing.ButtonGroup bgReflexao;
    private javax.swing.ButtonGroup bgRotacionar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelCisalhamento;
    private javax.swing.JPanel jPanelEscalonamento;
    private javax.swing.JPanel jPanelReflexao;
    private javax.swing.JPanel jPanelRotacao;
    private javax.swing.JPanel jPanelTranslacao;
    private javax.swing.JTabbedPane jTabbedPaneTransformadas;
    private javax.swing.JComboBox<String> jcbRotacionarVertice;
    private javax.swing.JRadioButton jrbEscalonaCentro;
    private javax.swing.JRadioButton jrbEscalonaOrigem;
    private javax.swing.JRadioButton jrbEscalonaSimples;
    private javax.swing.JRadioButton jrbRotacionarCentro;
    private javax.swing.JRadioButton jrbRotacionarOrigem;
    private javax.swing.JRadioButton jrbRotacionarPonto;
    private javax.swing.JRadioButton jrbRotacionarVertice;
    private javax.swing.JTextField jtfRotacionarPontoX;
    private javax.swing.JTextField jtfRotacionarPontoY;
    private javax.swing.JTextField jtfRotacionarPontoZ;
    private javax.swing.JLabel lblDx;
    private javax.swing.JLabel lblDy;
    private javax.swing.JLabel lblDz;
    private javax.swing.JLabel lblShXY;
    private javax.swing.JLabel lblShXZ;
    private javax.swing.JLabel lblShYX;
    private javax.swing.JLabel lblShYZ;
    private javax.swing.JLabel lblShZX;
    private javax.swing.JLabel lblShZY;
    private javax.swing.JLabel lblSx;
    private javax.swing.JLabel lblSy;
    private javax.swing.JLabel lblSz;
    private javax.swing.JRadioButton rbEixoX;
    private javax.swing.JRadioButton rbEixoY;
    private javax.swing.JRadioButton rbEixoZ;
    private javax.swing.JRadioButton rbPlanoXY;
    private javax.swing.JRadioButton rbPlanoXZ;
    private javax.swing.JRadioButton rbPlanoYZ;
    private javax.swing.JTextField txfAngulo;
    private javax.swing.JTextField txfDx;
    private javax.swing.JTextField txfDy;
    private javax.swing.JTextField txfDz;
    private javax.swing.JTextField txfShXY;
    private javax.swing.JTextField txfShXZ;
    private javax.swing.JTextField txfShYX;
    private javax.swing.JTextField txfShYZ;
    private javax.swing.JTextField txfShZX;
    private javax.swing.JTextField txfShZY;
    private javax.swing.JTextField txfSx;
    private javax.swing.JTextField txfSy;
    private javax.swing.JTextField txfSz;
    // End of variables declaration//GEN-END:variables
}
