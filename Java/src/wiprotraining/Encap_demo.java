package wiprotraining;

public class Encap_demo {
    private double salary;
    
    public Encap_demo() {
        this.salary = 0.0;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {

            this.salary = salary;
            System.out.println("Salary set to: ₹" + salary);
    }
    
    public static void main(String[] args) {
        Encap_demo emp = new Encap_demo();
        emp.setSalary(50000);
        System.out.println("Final salary: ₹" + emp.getSalary());
    }
}