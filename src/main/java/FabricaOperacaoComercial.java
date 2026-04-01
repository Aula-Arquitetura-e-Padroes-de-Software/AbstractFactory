public class FabricaOperacaoComercial implements FabricaOperacaoAerea{

    @Override
    public PlanoDeVoo criarPlanoDeVoo() {
        return new PlanoDeVooComercial();
    }

    @Override
    public Tripulacao criarTripulacao() {
        return new TripulacaoComercial();
    }
}
