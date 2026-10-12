public class Main{
    public static void main(String[] args){

        //SignUpManager signUpManager = new SignUpManager(new AgeUserCheckService());

// oluşturduğumuz signupmanager nesnesi içine IUserCheckService i implement eden bir classı kullanabiliriz ihtiyaca göre
        SignUpManager signUpManager = new SignUpManager(new ComplexUserCheckService());
        signUpManager.signUp(new User(1, "Azra", 23));
    }
}