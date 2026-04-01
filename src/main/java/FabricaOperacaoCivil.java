public class FabricaOperacaoCivil implements FabricaOperacaoAerea{
    @Override
    public PlanoDeVoo criarPlanoDeVoo() {
        return new PlanoDeVooCivil();
    }

    @Override
    public Tripulacao criarTripulacao() {
        return new TripulacaoCivil();
    }
}
