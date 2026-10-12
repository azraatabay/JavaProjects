public class User {
    private int ID;
    private String name;
    private int age;

    public User(int ID, String name , int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
