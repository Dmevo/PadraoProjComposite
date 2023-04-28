package composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModeloTest {

    @Test
    void deveRetornarMarcaAparelhoModelo() {
        Aparelho aparelho1 = new Aparelho("Smartphone");
        Modelo modelo11 = new Modelo("Galaxy A23");
        Modelo modelo12 = new Modelo("Galaxy M53");
        aparelho1.addModelo(modelo11);
        aparelho1.addModelo(modelo12);

        Aparelho aparelho2 = new Aparelho("Tablet");
        Modelo modelo21 = new Modelo("Tab A8");
        Modelo modelo22 = new Modelo("Tab S6 Lite");
        aparelho2.addModelo(modelo21);
        aparelho2.addModelo(modelo22);

        Marca marca = new Marca("Samsung");
        marca.addModelo(aparelho1);
        marca.addModelo(aparelho2);

        assertEquals("Marca: Samsung\n" +
                "Aparelho: Smartphone\n" +
                "Modelo: Galaxy A23\n" +
                "Modelo: Galaxy M53\n" +
                "Aparelho: Tablet\n" +
                "Modelo: Tab A8\n" +
                "Modelo: Tab S6 Lite\n", marca.getConteudo());
    }

    @Test
    void deveRetornarExececaoMarcaSemAparelho() {
        try {
            Marca marca = new Marca("Xiaomi");
            marca.getConteudo();
            fail();
        } catch (NullPointerException e) {
            assertEquals("Marca sem aparelhos", e.getMessage());
        }
    }
}
