package composite;

import java.util.ArrayList;
import java.util.List;

public class Marca extends Conteudo{

    private List<Conteudo> aparelhos;

    public Marca(String descricao) {
        super(descricao);
        this.aparelhos = new ArrayList<Conteudo>();
    }


    public String getConteudo() {
        if (this.aparelhos.size() == 0) {
            throw new NullPointerException("Marca sem aparelhos");
        }
        String saida = "";
        saida = "Marca: " + this.getDescricao() + "\n";
        for (Conteudo aparelho : aparelhos) {
            saida += aparelho.getConteudo();
        }
        return saida;
    }

    public void addModelo(Conteudo aparelho) { this.aparelhos.add(aparelho); }

}
