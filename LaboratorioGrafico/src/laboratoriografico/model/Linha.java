package laboratoriografico.model;

/**
 *
 * @author Dionathan
 * @since 23/02/2018
 *
 */
public class Linha implements Forma {

    private String nome;
    private Ponto inicio;
    private Ponto fim;

    public Linha() {
    }

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Linha(String nome, Ponto inicio, Ponto fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    @Override
    public void desenha() {
        //Implementar a função de desenho;
    }

}
