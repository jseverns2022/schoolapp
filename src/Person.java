public class Person {
    private String name;
    private String address;


    public Person(String name, String address) {
        //TODO initialize name and address
        this.name = name;
        this.address = address;

    }

    public String getName(String getName) {
        return name;
    }
    public void setName(String name) {
        //TODO
        this.name = name;

   }
    public String getAddress(String Address) {
       return Address;
    }
    public void setAddress(String address) {
        //TODO
        this.address = address;
    }
    public String toString(){
        return name+" "+ address;
    }

}
