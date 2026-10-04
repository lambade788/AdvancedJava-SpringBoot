package Day7;

public class Encapsulation {

    private String name;
    private int  age;
    private String address;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password==null){
            this.password=password;
        }
        else {
            System.out.println("Password is already created");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18){
            this.age=age;
        }
        else {
            System.out.println("You are below age to create the account.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
