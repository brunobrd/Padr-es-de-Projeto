package one.digitalinovation.gof.subsistema2.cep;

public class CepApi {
    private static  CepApi instacia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance() {
        return instacia;
    }

    public String recuperarCidade (String cep) {
        return "Fortaleza";
    }

    public String recuperarEstado (String cep) {
        return "Ceará";
    }
}
