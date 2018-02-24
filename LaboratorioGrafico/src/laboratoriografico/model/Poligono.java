package laboratoriografico.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dionathan
 * @since 24/02/2018
 *
 */
public class Poligono implements Forma {

    private List<Linha> linhas;

    public Poligono(Linha linha) {
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
        //Fecha o poligono
        Linha lastLine = linhas.get(linhas.size());
        Linha firstLine = linhas.get(0);
        linhas.add(new Linha(lastLine.getFim(), firstLine.getInicio()));

        //Implementar a função de desenho;
    }
}
