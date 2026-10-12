package generic_sınıflar;

public class YazdirmaSinifi<E> { //<E> sayesinde farklı türlerden gönderilen veri tiplerinde sorun çıkarmaz
    public void yazdir(E[] dizi){
        for (E e : dizi){
            System.out.println(e);
        }
    }
}
