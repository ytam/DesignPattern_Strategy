import oyuncu.Basketci;
import oyuncu.Kaleci;
import oyuncu.OrtaSahaOyuncusu;
import soyut.Oyuncu;



/**
 * Created by Yıldırım on 3/13/2016.
 */
public class Main {

    public static void main(String[] args){

        Oyuncu muslera = new Kaleci("Muslera");
        muslera.ayaklaVurmaIslemi();
        muslera.elleVurmaIslemi();

        Oyuncu snijder= new OrtaSahaOyuncusu("Snijder");
        snijder.elleVurmaIslemi();
        snijder.ayaklaVurmaIslemi();

        Oyuncu basketci = new Basketci();
        basketci.ayaklaVurmaIslemi();
        basketci.elleVurmaIslemi();

    }


}
