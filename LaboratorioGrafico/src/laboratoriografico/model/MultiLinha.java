package laboratoriografico.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dionathan
 * @since 24/02/2018
 *
 */
public class MultiLinha implements Forma {

    private List<Linha> linhas;

    public MultiLinha(Linha linha) {
        this.linhas = new ArrayList();
        linhas.add(linha);
    }

    public void addLinha(double cordX, double cordY) {
        Linha lastLine = linhas.get(linhas.size());
        Linha nextLine = new Linha(lastLine.getFim(), new Ponto(cordX, cordY));
        linhas.add(nextLine);
    }

    @Override
    public void desenha() {
        //Implementar a função de desenho;
    }
}
