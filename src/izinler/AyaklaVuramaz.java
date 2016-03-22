package izinler;

import davranislar.AyakKullanmaDavranisi;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public class AyaklaVuramaz implements AyakKullanmaDavranisi {
    @Override
    public void ayaklaVurma() {
        System.out.println("Ayakla Vuramaz");
    }
}
