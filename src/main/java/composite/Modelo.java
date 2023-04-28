package composite;

public class Modelo extends Conteudo {

    public Modelo(String descricao) {
        super(descricao);
    }

    public String getConteudo() {
        return "Modelo: " + this.getDescricao() + "\n";
    }
}
