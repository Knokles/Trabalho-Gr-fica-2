package laboratoriografico.model;

import java.util.ArrayList;

/**
 *
 * @author Dionathan Luan de Vargas
 * @since 09/03/2018
 *
 */
public class Matriz {
    
    private ArrayList<ArrayList> matriz;
    
    public Matriz() {
        matriz = new ArrayList<>();
    }
    
    public Matriz(int linhas, int colunas, Double valor) {
        matriz = new ArrayList<>();
        if (linhas < 1) {
            throw new UnsupportedOperationException("Matriz com menos que uma linha");
        } else if (colunas < 1) {
            throw new UnsupportedOperationException("Matriz com menos que uma coluna");
        } else {
            
            for (int i = 0; i < linhas; i++) {
                ArrayList<Double> coluna = new ArrayList<>();
                for (int j = 0; j < colunas; j++) {
                    coluna.add(valor);
                }
                matriz.add(coluna);
            }
        }
    }
    
    public void imprimeMatriz() {
        String str = "";
        for (int i = 0; i < matriz.size(); i++) {
            str = "| ";
            for (int j = 0; j < matriz.get(i).size(); j++) {
                str += matriz.get(i).get(j);
                str += " ";
            }
            str += "|";
            System.out.println(str);
        }
    }
    
    public int getLinhas() {
        return matriz.size();
    }
    
    public void addLinha(Double valor) {
        ArrayList<Double> coluna = new ArrayList<>();
        for (int j = 0; j < matriz.get(0).size(); j++) {
            coluna.add(valor);
        }
        matriz.add(coluna);
    }
    
    public void remLinha(int linha) {
        linha--;
        if (linha < 0 || linha > matriz.get(0).size()) {
            throw new UnsupportedOperationException("Exclusão de linha fora do tamanho da matriz");
        } else {
            matriz.remove(linha);
        }
    }
    
    public int getColunas() {
        return matriz.get(0).size();
    }
    
    public void addColuna(Double valor) {
        for (int i = 0; i < matriz.size(); i++) {
            matriz.get(i).add(valor);
        }
    }
    
    public void remColuna(int coluna) {
        coluna--;
        if (coluna < 0 || coluna > matriz.get(0).size()) {
            throw new UnsupportedOperationException("Exclusão de coluna fora do tamanho da matriz");
        } else {
            for (int i = 0; i < matriz.size(); i++) {
                matriz.get(i).remove(coluna);
            }
        }
    }
    
    public String getDimension() {
        return matriz.size() + " x " + matriz.get(0).size();
    }
    
    public void setValor(int i, int j, double valor) {
        if (i < 1 || i > matriz.size()) {
            throw new UnsupportedOperationException("Acesso de linha fora do tamanho da matriz");
        } else if (j < 1 || j > matriz.get(0).size()) {
            throw new UnsupportedOperationException("Acesso de coluna fora do tamanho da matriz");
        } else {
            matriz.get(i - 1).set(j - 1, valor);
        }
    }
    
    public double getValor(int i, int j) {
        if (i < 1 || i > matriz.size()) {
            throw new UnsupportedOperationException("Acesso de linha fora do tamanho da matriz");
        } else if (j < 1 || j > matriz.get(0).size()) {
            throw new UnsupportedOperationException("Acesso de coluna fora do tamanho da matriz");
        }
        return (Double) matriz.get(i - 1).get(j - 1);
    }

    //Gera uma matriz identidade
    public static Matriz identidade(int linhas) {
        if (linhas < 1) {
            throw new UnsupportedOperationException("Quantidade de linhas menor que 1");
        } else {
            Matriz m = new Matriz(linhas, linhas, 0.0);
            for (int i = 1; i <= linhas; i++) {
                m.setValor(i, i, 1.0);
            }
            return m;
        }
    }

    //Soma de matriz com um escalar
    public static Matriz soma(Matriz m1, double valor) {
        Matriz m = new Matriz(m1.getLinhas(), m1.getLinhas(), 0.0);
        for (int i = 1; i <= m.getLinhas(); i++) {
            for (int j = 1; j <= m.getColunas(); j++) {
                m.setValor(i, j, m1.getValor(i, j) + valor);
            }
        }
        return m;
    }

    //Soma de 2 matrizes
    public static Matriz soma(Matriz m1, Matriz m2) {
        if (m1.getDimension().equals(m2.getDimension())) {
            Matriz m = new Matriz(m1.getLinhas(), m1.getColunas(), (Double) 0.0);
            for (int i = 1; i <= m.getLinhas(); i++) {
                for (int j = 1; j <= m.getColunas(); j++) {
                    m.setValor(i, j, m1.getValor(i, j) + m2.getValor(i, j));
                }
            }
            return m;
        }
        throw new UnsupportedOperationException("Matrizes de tamanhos diferentes");
    }

    //Multiplicação de matriz com um escalar
    public static Matriz multiplicacao(Matriz m1, double valor) {
        Matriz m = new Matriz(m1.getLinhas(), m1.getColunas(), 0.0);
        for (int i = 1; i <= m.getLinhas(); i++) {
            for (int j = 1; j <= m.getColunas(); j++) {
                m.setValor(i, j, m1.getValor(i, j) * valor);
            }
        }
        return m;
    }

    //Multiplicação de 2 matrizes
    public static Matriz multiplicacao(Matriz m1, Matriz m2) {
        if (m1.getColunas() != m2.getLinhas()) {
            throw new UnsupportedOperationException("Matriz 1 com quantidade de colunas diferente da quantidade de linhas da matriz 2");
        } else {
            Matriz m = new Matriz(m1.getLinhas(), m2.getColunas(), (Double) 0.0);
            for (int i = 1; i <= m.getLinhas(); i++) { //Percorre linhas do resultado
                for (int j = 1; j <= m.getColunas(); j++) { //Percorre colunas do resultado
                    Double valor = 0.0;
                    for (int k = 1; k <= m1.getColunas(); k++) {
                        valor += m1.getValor(i, k) * m2.getValor(k, j);
                    }
                    m.setValor(i, j, valor);
                }
            }
            return m;
        }
    }
}
