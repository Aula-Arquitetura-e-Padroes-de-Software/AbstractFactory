import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class VooTest {

    @Test
    void TestEmitirPlanoDeVooCivil(){
        FabricaOperacaoAerea fabrica = new FabricaOperacaoCivil();
        Voo voo = new Voo(fabrica);
        assertEquals("Plano de voo civil", voo.emitirPlanoDeVoo());
    }

    @Test
    void TestEmitirTripulacaoCivil(){
        FabricaOperacaoAerea fabrica = new FabricaOperacaoCivil();
        Voo voo = new Voo(fabrica);
        assertEquals("Tripulacao civil", voo.emitirTripulacao());
    }

    @Test
    void TestEmitirPlanoDeVooComercial(){
        FabricaOperacaoAerea fabrica = new FabricaOperacaoComercial();
        Voo voo = new Voo(fabrica);
        assertEquals("Plano de voo comercial", voo.emitirPlanoDeVoo());
    }

    @Test
    void TestEmitirTripulacaoComercial(){
        FabricaOperacaoAerea fabrica = new FabricaOperacaoComercial();
        Voo voo = new Voo(fabrica);
        assertEquals("Tripulacao comercial", voo.emitirTripulacao());
    }
}
