// packages in java

package bank;

class Account{
    public String name;
    // String name; (default access modifier)
    protected String email;
    private String password;

    //getter and setter 
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}

 public class Bank{
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.name = "Sohini";
        acc1.email = "xyz@email.com";
        //acc1.password = "1234";  //error: password has private access in Account
        acc1.setPassword("1234");
        System.out.println(acc1.getPassword());
    }

 }