public interface IMuhendis {
    void askerlik_durumu_sorgula();
    String mezuniyet_ortalaması(double derece);
    void adli_sicil_kaydi();
    void is_tecrubesi(String[] array);

    // eğer bir class bu interface i implement edecekse buradaki 4 tane boş metodu class içinde doldurmak zorundadır.
    //
}
