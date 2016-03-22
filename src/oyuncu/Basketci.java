package oyuncu;

import izinler.AyaklaVuramaz;
import izinler.ElleTutabilir;
import soyut.Oyuncu;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public class Basketci extends Oyuncu {

    public Basketci(){

        setAyakKullanmaDavranisi(new AyaklaVuramaz());
        setElleTutmaDavranisi(new ElleTutabilir());
    }
}
