public class TesteAve {
    public static void main(String[] args) {
        Ave.Pinguim pinguim = new Ave.Pinguim();
        pinguim.setNome("Pingu");
        pinguim.canta(); // Funciona, pois Pinguim implementa Cantante

        Ave.BeijaFlor beijaFlor = new Ave.BeijaFlor() {
            @Override
            public void pia() {

            }

            @Override
            public void anda() {

            }
        };
        beijaFlor.setNome("Florzinha");
        beijaFlor.canta(); // Funciona, pois BeijaFlor é um Passaro e Passaro tem canta()

        Ave.Papagaio papagaio = new Ave.Papagaio() {
            @Override
            public void pia() {

            }

            @Override
            public void anda() {

            }
        };
        papagaio.setNome("Loro");
        papagaio.canta(); // Funciona, pois Papagaio é um Passaro e Passaro tem canta()

        Ave.Avestruz avestruz = new Ave.Avestruz();
        avestruz.setNome("Speedy");
        //avestruz.canta(); // Avestruz não implementa Cantante

        // Assumindo que você criou uma classe Grilo separada que implementa Cantante
        Grilo grilo = new Grilo("Grilinho");
        grilo.canta(); // Funciona, pois Grilo implementa Cantante
    }
}
