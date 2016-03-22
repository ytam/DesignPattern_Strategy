package oyuncu;

import izinler.AyaklaVurabilir;
import izinler.ElleTutamaz;
import soyut.Oyuncu;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public class OrtaSahaOyuncusu extends Oyuncu {

    public OrtaSahaOyuncusu(String isim){
        super(isim);
        setAyakKullanmaDavranisi(new AyaklaVurabilir());
        setElleTutmaDavranisi(new ElleTutamaz());
    }
}
