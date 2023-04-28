package composite;

import java.util.ArrayList;
import java.util.List;

public class Aparelho extends Conteudo{

    private List<Conteudo> modelos;

    public Aparelho(String descricao) {
        super(descricao);
        this.modelos = new ArrayList<Conteudo>();
    }

    public void addModelo(Conteudo modelo) { this.modelos.add(modelo); }

    public String getConteudo() {
        String saida = "";
        saida = "Aparelho: " + this.getDescricao() + "\n";
        for (Conteudo modelo : modelos) {
            saida += modelo.getConteudo();
        }
        return saida;
    }

}
