package com.azraatabay.paket1;

import com.azraatabay.paket2.IAdayOgrenci; //farklı paketlerden interfaceleri dahil etmek için dahil etmek gerekir

public class Ogrenci implements IAdayOgrenci {
    @Override
    public void ders_calis() {
        System.out.println("Ders çalışıyorum...");
    }

}
