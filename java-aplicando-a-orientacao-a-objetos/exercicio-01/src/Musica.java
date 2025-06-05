public class Musica {
    private String titulo;
    private String artista;
    private int anoLancamento;
    private double avaliacao;
    private int numAvaliacoes;

    public void exibeFichaTecnica() {
        titulo = "Holiday";
        artista = "Green Day";
        anoLancamento = 2004;

        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avaliaMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes ++;
    }

    public double mediaAvaliacoes() {
        System.out.print("Media de avaliações: ");
        return avaliacao / numAvaliacoes;
    }

}
