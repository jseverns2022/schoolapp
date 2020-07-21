public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.year = year;
        this.fee = fee;
        this.program = program;
        // TODO Auto-generated constructor stub
    }

    public String getProgram(String getProgram) {
        //TODO
        return program;
    }

    public void setProgram(String program) {
        //TODO
        this.program = program;
    }

    public int getYear(int getYear) {
        //TODO;
        return year;
    }

    public void setYear(int year) {
        //TODO
        this.year = year;
    }

    public double getFee(double fee) {
        return fee;
    }

    public void setFee(double fee) {
        //TODO
        this.fee = fee;
    }
    public String toString(){
        return program+ " "+ year+ ""+fee;
    }

    // could also use getters and setters to get the values from person class

}