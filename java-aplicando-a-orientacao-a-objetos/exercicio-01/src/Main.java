public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.console();

        System.out.println("==============================");
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobraNumero());

        System.out.println("==============================");
        Musica musica = new Musica();
        musica.exibeFichaTecnica();
        musica.avaliaMusica(10);
        musica.avaliaMusica(5);
        System.out.println(musica.mediaAvaliacoes());

        System.out.println("==============================");
        Carro carro = new Carro();
        carro.exibeFichaTecnica();
        System.out.println(carro.calculaIdadeCarro());


        System.out.println("==============================");
        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");
        aluno.setIdade(22);
        aluno.exibeInformacoes();
    }
}
