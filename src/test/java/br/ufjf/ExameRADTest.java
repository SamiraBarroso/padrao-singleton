package br.ufjf;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExameRADTest {

    @Test
    public void deveRetornarNome(){
        ExameRAD.getInstance().setNome("Intermediate Foundation");
        assertEquals("Intermediate Foundation", ExameRAD.getInstance().getNome());
    }

    @Test
    public void deveRetornarTaxa(){
        ExameRAD.getInstance().setTaxa(315);
        assertEquals(315, ExameRAD.getInstance().getTaxa());
    }

}