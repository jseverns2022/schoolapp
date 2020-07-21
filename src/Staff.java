public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        // TODO Auto-generated constructor stu
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    private String getSchool(String getSchool) {
        //TODO
        return school;
    }

    private void setSchool(String school) {
        //TODO
        this.school = school;
    }

    private double getPay(double getPay) {
        //TODO
        return pay;
    }

    private void setPay(double pay) {
        //TODO
        this.pay = pay;
    }
    public String toString(){
        return school+ ""+ pay;
    }


}