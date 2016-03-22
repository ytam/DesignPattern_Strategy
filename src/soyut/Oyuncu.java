package soyut;

import davranislar.AyakKullanmaDavranisi;
import davranislar.ElleTutmaDavranisi;

/**
 * Created by Yıldırım on 3/13/2016.
 */
public abstract class Oyuncu {

    private ElleTutmaDavranisi elleTutmaDavranisi;
    private AyakKullanmaDavranisi ayakKullanmaDavranisi;

    public Oyuncu(){
       this("İsmi belirtilmemiş ");
    }

    public Oyuncu(String isim) {
        System.out.println("Oyuncunun ismi: "+isim);
    }

    protected void setElleTutmaDavranisi(ElleTutmaDavranisi el) {
        this.elleTutmaDavranisi = el;

    }

    protected void setAyakKullanmaDavranisi(AyakKullanmaDavranisi ayak) {
        this.ayakKullanmaDavranisi = ayak;
    }

    public void elleVurmaIslemi(){
        this.elleTutmaDavranisi.elleTutma();
    }

    public void ayaklaVurmaIslemi(){
        this.ayakKullanmaDavranisi.ayaklaVurma();
    }

}
