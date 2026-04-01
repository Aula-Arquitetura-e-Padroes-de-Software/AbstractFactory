public class Voo {
    private PlanoDeVoo planoDeVoo;
    private Tripulacao tripulacao;
    public Voo(FabricaOperacaoAerea fabrica){
        this.planoDeVoo = fabrica.criarPlanoDeVoo();
        this.tripulacao = fabrica.criarTripulacao();
    }
    public String emitirPlanoDeVoo() {
        return planoDeVoo.emitir();
        }
    public String emitirTripulacao() {
        return tripulacao.emitir();
        }
    }
