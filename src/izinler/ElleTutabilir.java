package izinler;

import davranislar.ElleTutmaDavranisi;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public class ElleTutabilir implements ElleTutmaDavranisi{
    @Override
    public void elleTutma() {
        System.out.println("Elle Tutabilir");

    }
}
