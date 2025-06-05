import java.util.Calendar;
import java.util.GregorianCalendar;

public class Carro {
    private String modelo;
    private int ano;
    private String cor;

    Calendar calendar = GregorianCalendar.getInstance();

    public void exibeFichaTecnica() {
        modelo = "Celta";
        ano = 2012;
        cor = "prata";

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int calculaIdadeCarro() {
        System.out.print("Idade do carro: ");
        return calendar.get(Calendar.YEAR) - ano;
    }
}
