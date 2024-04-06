import br.com.pombimsjb.screenmatch.calculos.CalculadoraDeTempo;
import br.com.pombimsjb.screenmatch.calculos.FiltroRecomendacao;
import br.com.pombimsjb.screenmatch.modelo.Episodio;
import br.com.pombimsjb.screenmatch.modelo.Filme;
import br.com.pombimsjb.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração em Minutos: " + meuFilme.getDuracaoEmMinutos());

        System.out.println("****** SERIES ******");
        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);

        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);
        lost.exibeFichaTecnica();
        System.out.println("Duração total da maratona: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
