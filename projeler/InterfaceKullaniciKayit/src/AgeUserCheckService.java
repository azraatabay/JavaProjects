public class AgeUserCheckService implements IUserCheckService {
    //kullanıcının yaşını kontrol eden method tanımlıycaz

    @Override
    public boolean checkUser(User user) {
        if (user.getAge()>=18){
            return true;
        }
        return false;
    }
}
