public class Account {

    String name;
    int age;

    public static void main(String[] args) {

        Account a = new Account ();

        a.age = 34;
        a.name = "laak";

        System.out.println(a.age);
        System.out.println(a.name);
    }

    public void printDetails() {
        System.out.println(name = ", " + age);
    
    }
    


}