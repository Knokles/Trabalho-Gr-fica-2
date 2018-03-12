package laboratoriografico.gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import laboratoriografico.model.Linha;
import laboratoriografico.model.MultiLinha;
import laboratoriografico.model.Poligono;
import laboratoriografico.model.Ponto;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 26/02/2018
 *
 */
public class JFrameDesenharForma extends javax.swing.JFrame {

    private JFramePrincipal frmPai = null;
    private List<Ponto> pontosMultiLinha;
    private List<Ponto> pontosPoligono;
    private DefaultListModel listaMultiLinha;
    private DefaultListModel listaPoligono;
    private Color corPonto;
    private Color corLinha;
    private Color corMultiLinha;
    private Color corPoligono;

    /**
     * Creates new form JFrameDesenhar
     *
     * @param frmPai
     */
    public JFrameDesenharForma(JFramePrincipal frmPai) {
        this.frmPai = frmPai;
        pontosMultiLinha = new ArrayList();
        pontosPoligono = new ArrayList();
        listaMultiLinha = new DefaultListModel();
        listaPoligono = new DefaultListModel();
        corPonto = Color.BLACK;
        corLinha = Color.BLACK;
        corMultiLinha = Color.BLACK;
        corPoligono = Color.BLACK;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jTabbedPaneFormas = new javax.swing.JTabbedPane();
        jPanelPonto = new javax.swing.JPanel();
        jTextFieldPontoNome = new javax.swing.JTextField();
        jLabelPontoNome = new javax.swing.JLabel();
        jPanelPontoCoordenadas = new javax.swing.JPanel();
        jPanelPontoCoordenadaX = new javax.swing.JPanel();
        jTextFieldPontoCoordenadaX = new javax.swing.JTextField();
        jLabelPontoCoordenadaX = new javax.swing.JLabel();
        jPanelPontoCoordenadaY = new javax.swing.JPanel();
        jLabelPontoCoordenadaY = new javax.swing.JLabel();
        jTextFieldPontoCoordenadaY = new javax.swing.JTextField();
        btnPontoCor = new javax.swing.JButton();
        jPanelPontoCor = new javax.swing.JPanel();
        jPanelLinha = new javax.swing.JPanel();
        jLabelLinhaNome = new javax.swing.JLabel();
        jTextFieldLinhaNome = new javax.swing.JTextField();
        jPanelLinhaInicialCoordenadas1 = new javax.swing.JPanel();
        jPanelLinhaFinalCoordenadaX = new javax.swing.JPanel();
        jTextFieldLinhaFinalCoordenadaX = new javax.swing.JTextField();
        jLabelLinhaFinalCoordenadaX = new javax.swing.JLabel();
        jPanelLinhaFinalCoordenadaY = new javax.swing.JPanel();
        jLabelLinhaFinalCoordenadaY = new javax.swing.JLabel();
        jTextFieldLinhaFinalCoordenadaY = new javax.swing.JTextField();
        jPanelLinhaInicialCoordenadas = new javax.swing.JPanel();
        jPanelLinhaInicialCoordenadaX = new javax.swing.JPanel();
        jTextFieldLinhaInicialCoordenadaX = new javax.swing.JTextField();
        jLabelLinhaIncialCoordenadaX = new javax.swing.JLabel();
        jPanelLinhaInicialCoordenadaY = new javax.swing.JPanel();
        jLabelLinhaIncialCoordenadaY = new javax.swing.JLabel();
        jTextFieldLinhaInicialCoordenadaY = new javax.swing.JTextField();
        btnLinhaCor = new javax.swing.JButton();
        jPanelLinhaCor = new javax.swing.JPanel();
        jPanelMultiLinha = new javax.swing.JPanel();
        jPanelMultilinhaInserirAresta = new javax.swing.JPanel();
        jTextFieldMultiLinhaCoordenadaX = new javax.swing.JTextField();
        jTextFieldMultiLinhaCoordenadaY = new javax.swing.JTextField();
        jLabelMultiLinhaFinalCoordenadaX = new javax.swing.JLabel();
        jLabelMultiLinhaFinalCoordenadaY = new javax.swing.JLabel();
        jButtonMultiLinhaAdicionarAresta = new javax.swing.JButton();
        jPanelMultiLinhaArestas = new javax.swing.JPanel();
        jScrollPaneMultiLinhaArestas = new javax.swing.JScrollPane();
        jListMultiLinhaArestas = new javax.swing.JList<>();
        btnRemoverMultilinha = new javax.swing.JButton();
        jLabelMultiLinhaNome = new javax.swing.JLabel();
        jTextFieldMultiLinhaNome = new javax.swing.JTextField();
        btnMultilinhaCor = new javax.swing.JButton();
        jPanelMultilinhaCor = new javax.swing.JPanel();
        jPanelPoligono = new javax.swing.JPanel();
        jPanelPoligonoInserirAresta = new javax.swing.JPanel();
        jTextFieldPoligonoCoordenadaX = new javax.swing.JTextField();
        jTextFieldPoligonoCoordenadaY = new javax.swing.JTextField();
        jLabelPoligonoFinalCoordenadaX1 = new javax.swing.JLabel();
        jLabelPoligonoFinalCoordenadaY1 = new javax.swing.JLabel();
        jButtonPoligonoAdicionarAresta = new javax.swing.JButton();
        jPanelPoligonoArestas = new javax.swing.JPanel();
        jScrollPanePoligonoArestas = new javax.swing.JScrollPane();
        jListPoligonoArestas = new javax.swing.JList<>();
        btnRemoverPoligono = new javax.swing.JButton();
        jLabePoligonoNome = new javax.swing.JLabel();
        jTextFieldPoligonoNome = new javax.swing.JTextField();
        btnPoligonoCor = new javax.swing.JButton();
        jPanelPoligonoCor = new javax.swing.JPanel();
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

        jLabelPontoNome.setText("Nome:");

        jPanelPontoCoordenadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas"));

        jPanelPontoCoordenadaX.setPreferredSize(new java.awt.Dimension(215, 50));

        jLabelPontoCoordenadaX.setText("X:");

        javax.swing.GroupLayout jPanelPontoCoordenadaXLayout = new javax.swing.GroupLayout(jPanelPontoCoordenadaX);
        jPanelPontoCoordenadaX.setLayout(jPanelPontoCoordenadaXLayout);
        jPanelPontoCoordenadaXLayout.setHorizontalGroup(
            jPanelPontoCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPontoCoordenadaXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPontoCoordenadaX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPontoCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );
        jPanelPontoCoordenadaXLayout.setVerticalGroup(
            jPanelPontoCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoCoordenadaXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPontoCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPontoCoordenadaX)
                    .addComponent(jTextFieldPontoCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelPontoCoordenadaY.setPreferredSize(new java.awt.Dimension(215, 50));

        jLabelPontoCoordenadaY.setText("Y:");

        javax.swing.GroupLayout jPanelPontoCoordenadaYLayout = new javax.swing.GroupLayout(jPanelPontoCoordenadaY);
        jPanelPontoCoordenadaY.setLayout(jPanelPontoCoordenadaYLayout);
        jPanelPontoCoordenadaYLayout.setHorizontalGroup(
            jPanelPontoCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoCoordenadaYLayout.createSequentialGroup()
                .addComponent(jLabelPontoCoordenadaY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPontoCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        jPanelPontoCoordenadaYLayout.setVerticalGroup(
            jPanelPontoCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoCoordenadaYLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPontoCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPontoCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPontoCoordenadaY))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPontoCoordenadasLayout = new javax.swing.GroupLayout(jPanelPontoCoordenadas);
        jPanelPontoCoordenadas.setLayout(jPanelPontoCoordenadasLayout);
        jPanelPontoCoordenadasLayout.setHorizontalGroup(
            jPanelPontoCoordenadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoCoordenadasLayout.createSequentialGroup()
                .addComponent(jPanelPontoCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanelPontoCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelPontoCoordenadasLayout.setVerticalGroup(
            jPanelPontoCoordenadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPontoCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jPanelPontoCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnPontoCor.setText("Cor");
        btnPontoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoCorActionPerformed(evt);
            }
        });

        jPanelPontoCor.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPontoCor.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelPontoCorLayout = new javax.swing.GroupLayout(jPanelPontoCor);
        jPanelPontoCor.setLayout(jPanelPontoCorLayout);
        jPanelPontoCorLayout.setHorizontalGroup(
            jPanelPontoCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanelPontoCorLayout.setVerticalGroup(
            jPanelPontoCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPontoLayout = new javax.swing.GroupLayout(jPanelPonto);
        jPanelPonto.setLayout(jPanelPontoLayout);
        jPanelPontoLayout.setHorizontalGroup(
            jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPontoCoordenadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPontoLayout.createSequentialGroup()
                        .addComponent(jLabelPontoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPontoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPontoCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPontoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPontoLayout.setVerticalGroup(
            jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPontoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPontoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelPontoNome)
                        .addComponent(jTextFieldPontoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPontoCor)
                    .addComponent(jPanelPontoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanelPontoCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        jTabbedPaneFormas.addTab("Ponto", jPanelPonto);

        jLabelLinhaNome.setText("Nome:");

        jPanelLinhaInicialCoordenadas1.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas Finais"));

        jPanelLinhaFinalCoordenadaX.setPreferredSize(new java.awt.Dimension(215, 50));

        jLabelLinhaFinalCoordenadaX.setText("X:");

        javax.swing.GroupLayout jPanelLinhaFinalCoordenadaXLayout = new javax.swing.GroupLayout(jPanelLinhaFinalCoordenadaX);
        jPanelLinhaFinalCoordenadaX.setLayout(jPanelLinhaFinalCoordenadaXLayout);
        jPanelLinhaFinalCoordenadaXLayout.setHorizontalGroup(
            jPanelLinhaFinalCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLinhaFinalCoordenadaXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLinhaFinalCoordenadaX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLinhaFinalCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );
        jPanelLinhaFinalCoordenadaXLayout.setVerticalGroup(
            jPanelLinhaFinalCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaFinalCoordenadaXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLinhaFinalCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLinhaFinalCoordenadaX)
                    .addComponent(jTextFieldLinhaFinalCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLinhaFinalCoordenadaY.setPreferredSize(new java.awt.Dimension(215, 50));

        jLabelLinhaFinalCoordenadaY.setText("Y:");

        javax.swing.GroupLayout jPanelLinhaFinalCoordenadaYLayout = new javax.swing.GroupLayout(jPanelLinhaFinalCoordenadaY);
        jPanelLinhaFinalCoordenadaY.setLayout(jPanelLinhaFinalCoordenadaYLayout);
        jPanelLinhaFinalCoordenadaYLayout.setHorizontalGroup(
            jPanelLinhaFinalCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaFinalCoordenadaYLayout.createSequentialGroup()
                .addComponent(jLabelLinhaFinalCoordenadaY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLinhaFinalCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        jPanelLinhaFinalCoordenadaYLayout.setVerticalGroup(
            jPanelLinhaFinalCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaFinalCoordenadaYLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLinhaFinalCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLinhaFinalCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLinhaFinalCoordenadaY))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLinhaInicialCoordenadas1Layout = new javax.swing.GroupLayout(jPanelLinhaInicialCoordenadas1);
        jPanelLinhaInicialCoordenadas1.setLayout(jPanelLinhaInicialCoordenadas1Layout);
        jPanelLinhaInicialCoordenadas1Layout.setHorizontalGroup(
            jPanelLinhaInicialCoordenadas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaInicialCoordenadas1Layout.createSequentialGroup()
                .addComponent(jPanelLinhaFinalCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanelLinhaFinalCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLinhaInicialCoordenadas1Layout.setVerticalGroup(
            jPanelLinhaInicialCoordenadas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLinhaFinalCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jPanelLinhaFinalCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanelLinhaInicialCoordenadas.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas Iniciais"));

        jPanelLinhaInicialCoordenadaX.setPreferredSize(new java.awt.Dimension(215, 50));

        jLabelLinhaIncialCoordenadaX.setText("X:");

        javax.swing.GroupLayout jPanelLinhaInicialCoordenadaXLayout = new javax.swing.GroupLayout(jPanelLinhaInicialCoordenadaX);
        jPanelLinhaInicialCoordenadaX.setLayout(jPanelLinhaInicialCoordenadaXLayout);
        jPanelLinhaInicialCoordenadaXLayout.setHorizontalGroup(
            jPanelLinhaInicialCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLinhaInicialCoordenadaXLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLinhaIncialCoordenadaX)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLinhaInicialCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
        );
        jPanelLinhaInicialCoordenadaXLayout.setVerticalGroup(
            jPanelLinhaInicialCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaInicialCoordenadaXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLinhaInicialCoordenadaXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLinhaIncialCoordenadaX)
                    .addComponent(jTextFieldLinhaInicialCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelLinhaInicialCoordenadaY.setPreferredSize(new java.awt.Dimension(215, 50));

        jLabelLinhaIncialCoordenadaY.setText("Y:");

        javax.swing.GroupLayout jPanelLinhaInicialCoordenadaYLayout = new javax.swing.GroupLayout(jPanelLinhaInicialCoordenadaY);
        jPanelLinhaInicialCoordenadaY.setLayout(jPanelLinhaInicialCoordenadaYLayout);
        jPanelLinhaInicialCoordenadaYLayout.setHorizontalGroup(
            jPanelLinhaInicialCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaInicialCoordenadaYLayout.createSequentialGroup()
                .addComponent(jLabelLinhaIncialCoordenadaY)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldLinhaInicialCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
        );
        jPanelLinhaInicialCoordenadaYLayout.setVerticalGroup(
            jPanelLinhaInicialCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaInicialCoordenadaYLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLinhaInicialCoordenadaYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLinhaInicialCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLinhaIncialCoordenadaY))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelLinhaInicialCoordenadasLayout = new javax.swing.GroupLayout(jPanelLinhaInicialCoordenadas);
        jPanelLinhaInicialCoordenadas.setLayout(jPanelLinhaInicialCoordenadasLayout);
        jPanelLinhaInicialCoordenadasLayout.setHorizontalGroup(
            jPanelLinhaInicialCoordenadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaInicialCoordenadasLayout.createSequentialGroup()
                .addComponent(jPanelLinhaInicialCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jPanelLinhaInicialCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLinhaInicialCoordenadasLayout.setVerticalGroup(
            jPanelLinhaInicialCoordenadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLinhaInicialCoordenadaX, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jPanelLinhaInicialCoordenadaY, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnLinhaCor.setText("Cor");
        btnLinhaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinhaCorActionPerformed(evt);
            }
        });

        jPanelLinhaCor.setBackground(new java.awt.Color(0, 0, 0));
        jPanelLinhaCor.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelLinhaCorLayout = new javax.swing.GroupLayout(jPanelLinhaCor);
        jPanelLinhaCor.setLayout(jPanelLinhaCorLayout);
        jPanelLinhaCorLayout.setHorizontalGroup(
            jPanelLinhaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanelLinhaCorLayout.setVerticalGroup(
            jPanelLinhaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelLinhaLayout = new javax.swing.GroupLayout(jPanelLinha);
        jPanelLinha.setLayout(jPanelLinhaLayout);
        jPanelLinhaLayout.setHorizontalGroup(
            jPanelLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLinhaLayout.createSequentialGroup()
                        .addComponent(jLabelLinhaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldLinhaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLinhaCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelLinhaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelLinhaInicialCoordenadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelLinhaInicialCoordenadas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLinhaLayout.setVerticalGroup(
            jPanelLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLinhaNome)
                        .addComponent(jTextFieldLinhaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLinhaCor))
                    .addComponent(jPanelLinhaCor, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelLinhaInicialCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelLinhaInicialCoordenadas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPaneFormas.addTab("Linha", jPanelLinha);

        jPanelMultilinhaInserirAresta.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Aresta"));

        jLabelMultiLinhaFinalCoordenadaX.setText("Coordenada X:");

        jLabelMultiLinhaFinalCoordenadaY.setText("Coordenada Y:");

        jButtonMultiLinhaAdicionarAresta.setText("Adicionar");
        jButtonMultiLinhaAdicionarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiLinhaAdicionarArestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMultilinhaInserirArestaLayout = new javax.swing.GroupLayout(jPanelMultilinhaInserirAresta);
        jPanelMultilinhaInserirAresta.setLayout(jPanelMultilinhaInserirArestaLayout);
        jPanelMultilinhaInserirArestaLayout.setHorizontalGroup(
            jPanelMultilinhaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMultilinhaInserirArestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMultilinhaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMultilinhaInserirArestaLayout.createSequentialGroup()
                        .addComponent(jLabelMultiLinhaFinalCoordenadaX)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldMultiLinhaCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMultilinhaInserirArestaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelMultilinhaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMultilinhaInserirArestaLayout.createSequentialGroup()
                                .addComponent(jLabelMultiLinhaFinalCoordenadaY)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMultiLinhaCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonMultiLinhaAdicionarAresta, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelMultilinhaInserirArestaLayout.setVerticalGroup(
            jPanelMultilinhaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMultilinhaInserirArestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMultilinhaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMultiLinhaFinalCoordenadaX)
                    .addComponent(jTextFieldMultiLinhaCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMultilinhaInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMultiLinhaCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMultiLinhaFinalCoordenadaY))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButtonMultiLinhaAdicionarAresta)
                .addContainerGap())
        );

        jPanelMultiLinhaArestas.setBorder(javax.swing.BorderFactory.createTitledBorder("Arestas"));

        jScrollPaneMultiLinhaArestas.setViewportView(jListMultiLinhaArestas);

        btnRemoverMultilinha.setText("Remover");
        btnRemoverMultilinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverMultilinhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMultiLinhaArestasLayout = new javax.swing.GroupLayout(jPanelMultiLinhaArestas);
        jPanelMultiLinhaArestas.setLayout(jPanelMultiLinhaArestasLayout);
        jPanelMultiLinhaArestasLayout.setHorizontalGroup(
            jPanelMultiLinhaArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMultiLinhaArestasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMultiLinhaArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneMultiLinhaArestas, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnRemoverMultilinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMultiLinhaArestasLayout.setVerticalGroup(
            jPanelMultiLinhaArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMultiLinhaArestasLayout.createSequentialGroup()
                .addComponent(jScrollPaneMultiLinhaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverMultilinha)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabelMultiLinhaNome.setText("Nome:");

        btnMultilinhaCor.setText("Cor");
        btnMultilinhaCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultilinhaCorActionPerformed(evt);
            }
        });

        jPanelMultilinhaCor.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMultilinhaCor.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelMultilinhaCorLayout = new javax.swing.GroupLayout(jPanelMultilinhaCor);
        jPanelMultilinhaCor.setLayout(jPanelMultilinhaCorLayout);
        jPanelMultilinhaCorLayout.setHorizontalGroup(
            jPanelMultilinhaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanelMultilinhaCorLayout.setVerticalGroup(
            jPanelMultilinhaCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelMultiLinhaLayout = new javax.swing.GroupLayout(jPanelMultiLinha);
        jPanelMultiLinha.setLayout(jPanelMultiLinhaLayout);
        jPanelMultiLinhaLayout.setHorizontalGroup(
            jPanelMultiLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMultiLinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMultiLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMultiLinhaLayout.createSequentialGroup()
                        .addComponent(jPanelMultiLinhaArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMultilinhaInserirAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMultiLinhaLayout.createSequentialGroup()
                        .addComponent(jLabelMultiLinhaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMultiLinhaNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMultilinhaCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMultilinhaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMultiLinhaLayout.setVerticalGroup(
            jPanelMultiLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMultiLinhaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMultiLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMultiLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMultiLinhaNome)
                        .addComponent(jTextFieldMultiLinhaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMultilinhaCor)
                    .addComponent(jPanelMultilinhaCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelMultiLinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelMultiLinhaArestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMultilinhaInserirAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneFormas.addTab("Multilinha", jPanelMultiLinha);

        jPanelPoligonoInserirAresta.setBorder(javax.swing.BorderFactory.createTitledBorder("Inserir Aresta"));

        jLabelPoligonoFinalCoordenadaX1.setText("Coordenada X:");

        jLabelPoligonoFinalCoordenadaY1.setText("Coordenada Y:");

        jButtonPoligonoAdicionarAresta.setText("Adicionar");
        jButtonPoligonoAdicionarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPoligonoAdicionarArestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPoligonoInserirArestaLayout = new javax.swing.GroupLayout(jPanelPoligonoInserirAresta);
        jPanelPoligonoInserirAresta.setLayout(jPanelPoligonoInserirArestaLayout);
        jPanelPoligonoInserirArestaLayout.setHorizontalGroup(
            jPanelPoligonoInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPoligonoInserirArestaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPoligonoInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPoligonoInserirArestaLayout.createSequentialGroup()
                        .addComponent(jLabelPoligonoFinalCoordenadaX1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPoligonoCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPoligonoInserirArestaLayout.createSequentialGroup()
                        .addComponent(jLabelPoligonoFinalCoordenadaY1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPoligonoCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonPoligonoAdicionarAresta, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanelPoligonoInserirArestaLayout.setVerticalGroup(
            jPanelPoligonoInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPoligonoInserirArestaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPoligonoInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPoligonoFinalCoordenadaX1)
                    .addComponent(jTextFieldPoligonoCoordenadaX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPoligonoInserirArestaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPoligonoCoordenadaY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPoligonoFinalCoordenadaY1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButtonPoligonoAdicionarAresta)
                .addContainerGap())
        );

        jPanelPoligonoArestas.setBorder(javax.swing.BorderFactory.createTitledBorder("Arestas"));

        jScrollPanePoligonoArestas.setViewportView(jListPoligonoArestas);

        btnRemoverPoligono.setText("Remover");
        btnRemoverPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPoligonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPoligonoArestasLayout = new javax.swing.GroupLayout(jPanelPoligonoArestas);
        jPanelPoligonoArestas.setLayout(jPanelPoligonoArestasLayout);
        jPanelPoligonoArestasLayout.setHorizontalGroup(
            jPanelPoligonoArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPoligonoArestasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPoligonoArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPanePoligonoArestas, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(btnRemoverPoligono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPoligonoArestasLayout.setVerticalGroup(
            jPanelPoligonoArestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPoligonoArestasLayout.createSequentialGroup()
                .addComponent(jScrollPanePoligonoArestas, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverPoligono)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabePoligonoNome.setText("Nome:");

        btnPoligonoCor.setText("Cor");
        btnPoligonoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoligonoCorActionPerformed(evt);
            }
        });

        jPanelPoligonoCor.setBackground(new java.awt.Color(0, 0, 0));
        jPanelPoligonoCor.setPreferredSize(new java.awt.Dimension(10, 10));

        javax.swing.GroupLayout jPanelPoligonoCorLayout = new javax.swing.GroupLayout(jPanelPoligonoCor);
        jPanelPoligonoCor.setLayout(jPanelPoligonoCorLayout);
        jPanelPoligonoCorLayout.setHorizontalGroup(
            jPanelPoligonoCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanelPoligonoCorLayout.setVerticalGroup(
            jPanelPoligonoCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelPoligonoLayout = new javax.swing.GroupLayout(jPanelPoligono);
        jPanelPoligono.setLayout(jPanelPoligonoLayout);
        jPanelPoligonoLayout.setHorizontalGroup(
            jPanelPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPoligonoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPoligonoLayout.createSequentialGroup()
                        .addComponent(jPanelPoligonoArestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPoligonoInserirAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPoligonoLayout.createSequentialGroup()
                        .addComponent(jLabePoligonoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPoligonoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPoligonoCor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPoligonoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPoligonoLayout.setVerticalGroup(
            jPanelPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPoligonoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabePoligonoNome)
                        .addComponent(jTextFieldPoligonoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPoligonoCor)
                    .addComponent(jPanelPoligonoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPoligonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelPoligonoArestas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPoligonoInserirAresta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPaneFormas.addTab("Poligono", jPanelPoligono);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jTabbedPaneFormas, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneFormas, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        switch (jTabbedPaneFormas.getSelectedIndex()) {
            case 0: //Ponto
                Ponto ponto = new Ponto(jTextFieldPontoNome.getText(),
                        Double.parseDouble(jTextFieldPontoCoordenadaX.getText().replace(",", ".")),
                        Double.parseDouble(jTextFieldPontoCoordenadaY.getText().replace(",", ".")),
                        corPonto);
                frmPai.getFormas().add(ponto);
                frmPai.getPanelDesenho().repaint();
                frmPai.getLista().addElement(ponto);
                frmPai.getjListFormas().setModel(frmPai.getLista());
                close();
                break;
            case 1: //Linha
                Linha linha = new Linha(jTextFieldLinhaNome.getText(),
                        new Ponto(Double.parseDouble(jTextFieldLinhaInicialCoordenadaX.getText().replace(",", ".")),
                                Double.parseDouble(jTextFieldLinhaInicialCoordenadaY.getText().replace(",", ".")),
                                corLinha),
                        new Ponto(Double.parseDouble(jTextFieldLinhaFinalCoordenadaX.getText().replace(",", ".")),
                                Double.parseDouble(jTextFieldLinhaFinalCoordenadaY.getText().replace(",", ".")),
                                corLinha),
                        corLinha);
                frmPai.getFormas().add(linha);
                frmPai.getPanelDesenho().repaint();
                frmPai.getLista().addElement(linha);
                frmPai.getjListFormas().setModel(frmPai.getLista());
                close();
                break;
            case 2: ////Multilinha
                MultiLinha multilinha = new MultiLinha(jTextFieldMultiLinhaNome.getText(), pontosMultiLinha.get(0), pontosMultiLinha.get(1), corMultiLinha);
                for (int i = 2; i < pontosMultiLinha.size(); i++) {
                    multilinha.addAresta(pontosMultiLinha.get(i));
                }
                frmPai.getFormas().add(multilinha);
                frmPai.getPanelDesenho().repaint();
                frmPai.getLista().addElement(multilinha);
                frmPai.getjListFormas().setModel(frmPai.getLista());
                close();
                break;
            case 3:
                Poligono poligono = new Poligono(jTextFieldPoligonoNome.getText(), pontosPoligono.get(0), pontosPoligono.get(1), corPoligono);
                for (int i = 2; i < pontosPoligono.size(); i++) {
                    poligono.addAresta(pontosPoligono.get(i));
                }
                frmPai.getFormas().add(poligono);
                frmPai.getPanelDesenho().repaint();
                frmPai.getLista().addElement(poligono);
                frmPai.getjListFormas().setModel(frmPai.getLista());
                close();
                break;
            default:
                System.out.println("Algo de errado não está certo");
                break;
        }
    }//GEN-LAST:event_jButtonDesenharActionPerformed

    private void jButtonMultiLinhaAdicionarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiLinhaAdicionarArestaActionPerformed
        Ponto ponto = new Ponto("",
                Double.parseDouble(jTextFieldMultiLinhaCoordenadaX.getText().replace(",", ".")),
                Double.parseDouble(jTextFieldMultiLinhaCoordenadaY.getText().replace(",", ".")),
                Color.BLACK);
        pontosMultiLinha.add(ponto);
        listaMultiLinha.addElement(ponto);
        jListMultiLinhaArestas.setModel(listaMultiLinha);
        jTextFieldMultiLinhaCoordenadaX.setText("");
        jTextFieldMultiLinhaCoordenadaY.setText("");
    }//GEN-LAST:event_jButtonMultiLinhaAdicionarArestaActionPerformed

    private void jButtonPoligonoAdicionarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPoligonoAdicionarArestaActionPerformed
        Ponto ponto = new Ponto("",
                Double.parseDouble(jTextFieldPoligonoCoordenadaX.getText().replace(",", ".")),
                Double.parseDouble(jTextFieldPoligonoCoordenadaY.getText().replace(",", ".")),
                Color.BLACK);
        pontosPoligono.add(ponto);
        listaPoligono.addElement(ponto);
        jListPoligonoArestas.setModel(listaPoligono);
        jTextFieldPoligonoCoordenadaX.setText("");
        jTextFieldPoligonoCoordenadaY.setText("");
    }//GEN-LAST:event_jButtonPoligonoAdicionarArestaActionPerformed

    private void btnRemoverMultilinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverMultilinhaActionPerformed
        pontosMultiLinha.remove(jListMultiLinhaArestas.getSelectedIndex());
        listaMultiLinha.remove(jListMultiLinhaArestas.getSelectedIndex());
    }//GEN-LAST:event_btnRemoverMultilinhaActionPerformed

    private void btnRemoverPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPoligonoActionPerformed
        pontosPoligono.remove(jListPoligonoArestas.getSelectedIndex());
        listaPoligono.remove(jListPoligonoArestas.getSelectedIndex());
    }//GEN-LAST:event_btnRemoverPoligonoActionPerformed

    private void btnLinhaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinhaCorActionPerformed
        JFrameCor cor = new JFrameCor(this, jTabbedPaneFormas.getSelectedIndex(), corLinha);
        this.setEnabled(false);
        cor.setVisible(true);
    }//GEN-LAST:event_btnLinhaCorActionPerformed

    private void btnPontoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoCorActionPerformed
        JFrameCor cor = new JFrameCor(this, jTabbedPaneFormas.getSelectedIndex(), corPonto);
        this.setEnabled(false);
        cor.setVisible(true);
    }//GEN-LAST:event_btnPontoCorActionPerformed

    private void btnMultilinhaCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultilinhaCorActionPerformed
        JFrameCor cor = new JFrameCor(this, jTabbedPaneFormas.getSelectedIndex(), corMultiLinha);
        this.setEnabled(false);
        cor.setVisible(true);
    }//GEN-LAST:event_btnMultilinhaCorActionPerformed

    private void btnPoligonoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoligonoCorActionPerformed
        JFrameCor cor = new JFrameCor(this, jTabbedPaneFormas.getSelectedIndex(), corPoligono);
        this.setEnabled(false);
        cor.setVisible(true);
    }//GEN-LAST:event_btnPoligonoCorActionPerformed

    public JPanel getjPanelLinhaCor() {
        return jPanelLinhaCor;
    }

    public void setjPanelLinhaCor(JPanel jPanelLinhaCor) {
        this.jPanelLinhaCor = jPanelLinhaCor;
    }

    public JPanel getjPanelMultilinhaCor() {
        return jPanelMultilinhaCor;
    }

    public void setjPanelMultilinhaCor(JPanel jPanelMultilinhaCor) {
        this.jPanelMultilinhaCor = jPanelMultilinhaCor;
    }

    public JPanel getjPanelPoligonoCor() {
        return jPanelPoligonoCor;
    }

    public void setjPanelPoligonoCor(JPanel jPanelPoligonoCor) {
        this.jPanelPoligonoCor = jPanelPoligonoCor;
    }

    public JPanel getjPanelPontoCor() {
        return jPanelPontoCor;
    }

    public void setjPanelPontoCor(JPanel jPanelPontoCor) {
        this.jPanelPontoCor = jPanelPontoCor;
    }

    
    
    public Color getCorPonto() {
        return corPonto;
    }

    public void setCorPonto(Color corPonto) {
        this.corPonto = corPonto;
    }

    public Color getCorLinha() {
        return corLinha;
    }

    public void setCorLinha(Color corLinha) {
        this.corLinha = corLinha;
    }

    public Color getCorMultiLinha() {
        return corMultiLinha;
    }

    public void setCorMultiLinha(Color corMultiLinha) {
        this.corMultiLinha = corMultiLinha;
    }

    public Color getCorPoligono() {
        return corPoligono;
    }

    public void setCorPoligono(Color corPoligono) {
        this.corPoligono = corPoligono;
    }

    private void close() {
        if (frmPai != null) {
            frmPai.setEnabled(true);
        }
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLinhaCor;
    private javax.swing.JButton btnMultilinhaCor;
    private javax.swing.JButton btnPoligonoCor;
    private javax.swing.JButton btnPontoCor;
    private javax.swing.JButton btnRemoverMultilinha;
    private javax.swing.JButton btnRemoverPoligono;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDesenhar;
    private javax.swing.JButton jButtonMultiLinhaAdicionarAresta;
    private javax.swing.JButton jButtonPoligonoAdicionarAresta;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabePoligonoNome;
    private javax.swing.JLabel jLabelLinhaFinalCoordenadaX;
    private javax.swing.JLabel jLabelLinhaFinalCoordenadaY;
    private javax.swing.JLabel jLabelLinhaIncialCoordenadaX;
    private javax.swing.JLabel jLabelLinhaIncialCoordenadaY;
    private javax.swing.JLabel jLabelLinhaNome;
    private javax.swing.JLabel jLabelMultiLinhaFinalCoordenadaX;
    private javax.swing.JLabel jLabelMultiLinhaFinalCoordenadaY;
    private javax.swing.JLabel jLabelMultiLinhaNome;
    private javax.swing.JLabel jLabelPoligonoFinalCoordenadaX1;
    private javax.swing.JLabel jLabelPoligonoFinalCoordenadaY1;
    private javax.swing.JLabel jLabelPontoCoordenadaX;
    private javax.swing.JLabel jLabelPontoCoordenadaY;
    private javax.swing.JLabel jLabelPontoNome;
    private javax.swing.JList<String> jListMultiLinhaArestas;
    private javax.swing.JList<String> jListPoligonoArestas;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JPanel jPanelLinha;
    private javax.swing.JPanel jPanelLinhaCor;
    private javax.swing.JPanel jPanelLinhaFinalCoordenadaX;
    private javax.swing.JPanel jPanelLinhaFinalCoordenadaY;
    private javax.swing.JPanel jPanelLinhaInicialCoordenadaX;
    private javax.swing.JPanel jPanelLinhaInicialCoordenadaY;
    private javax.swing.JPanel jPanelLinhaInicialCoordenadas;
    private javax.swing.JPanel jPanelLinhaInicialCoordenadas1;
    private javax.swing.JPanel jPanelMultiLinha;
    private javax.swing.JPanel jPanelMultiLinhaArestas;
    private javax.swing.JPanel jPanelMultilinhaCor;
    private javax.swing.JPanel jPanelMultilinhaInserirAresta;
    private javax.swing.JPanel jPanelPoligono;
    private javax.swing.JPanel jPanelPoligonoArestas;
    private javax.swing.JPanel jPanelPoligonoCor;
    private javax.swing.JPanel jPanelPoligonoInserirAresta;
    private javax.swing.JPanel jPanelPonto;
    private javax.swing.JPanel jPanelPontoCoordenadaX;
    private javax.swing.JPanel jPanelPontoCoordenadaY;
    private javax.swing.JPanel jPanelPontoCoordenadas;
    private javax.swing.JPanel jPanelPontoCor;
    private javax.swing.JScrollPane jScrollPaneMultiLinhaArestas;
    private javax.swing.JScrollPane jScrollPanePoligonoArestas;
    private javax.swing.JTabbedPane jTabbedPaneFormas;
    private javax.swing.JTextField jTextFieldLinhaFinalCoordenadaX;
    private javax.swing.JTextField jTextFieldLinhaFinalCoordenadaY;
    private javax.swing.JTextField jTextFieldLinhaInicialCoordenadaX;
    private javax.swing.JTextField jTextFieldLinhaInicialCoordenadaY;
    private javax.swing.JTextField jTextFieldLinhaNome;
    private javax.swing.JTextField jTextFieldMultiLinhaCoordenadaX;
    private javax.swing.JTextField jTextFieldMultiLinhaCoordenadaY;
    private javax.swing.JTextField jTextFieldMultiLinhaNome;
    private javax.swing.JTextField jTextFieldPoligonoCoordenadaX;
    private javax.swing.JTextField jTextFieldPoligonoCoordenadaY;
    private javax.swing.JTextField jTextFieldPoligonoNome;
    private javax.swing.JTextField jTextFieldPontoCoordenadaX;
    private javax.swing.JTextField jTextFieldPontoCoordenadaY;
    private javax.swing.JTextField jTextFieldPontoNome;
    // End of variables declaration//GEN-END:variables
}
