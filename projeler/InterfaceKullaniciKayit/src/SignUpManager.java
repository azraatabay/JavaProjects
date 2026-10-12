public class SignUpManager {
    private IUserCheckService iUserCheckService; //IUserCheckService veri tipinde (String, int gibi) iUserCheckService değişkeni tanımladık

    public SignUpManager(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
        // interface sayesinde age ya da complex check kullanabiliriz o classlardan özel olarak nesne üretmemize gerek kalmadı.
        // Sınıfın içindeki bağımlılıktan kurtulduk
        // Bu şekilde soyutlama gerçekleştirmiş olduk
    }

    public void signUp(User user){
        if (iUserCheckService.checkUser(user)){
            System.out.println("Kullanıcı kayıt oldu : "+user.getName());
        }
        else{
            System.out.println("Kullanıcı kayıt olamadı. ");
        }
    }
}
