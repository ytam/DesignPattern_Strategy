package oyuncu;

import izinler.AyaklaVurabilir;
import izinler.ElleTutabilir;
import soyut.Oyuncu;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public class Kaleci extends Oyuncu {

    public Kaleci(String isim){
        super(isim);
        setAyakKullanmaDavranisi(new AyaklaVurabilir());
        setElleTutmaDavranisi(new ElleTutabilir());

    }
}
