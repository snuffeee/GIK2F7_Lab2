public class PhD implements IStudent, IAcademic {

    private String name;
    private String address;
    private int id;
    private int balance;
    private String grade;

    @Override
    public void paySalary(PhD phd, int amount) {
        balance =+ amount;
        System.out.println("The PhD Student has been paid!");
    }

    @Override
    public void gradeStudent(IStudent iStudent, String grade) {
        System.out.println(iStudent + " have recived grade: " + grade);
    }
}
