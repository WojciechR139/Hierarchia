public class Director extends Manager {
    private String department;

    public Director(String name, double salary, int teamSize, String department) {
        super(name, salary, teamSize);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dział: " + department);
    }

    public String getDepartment() {
        return department;
    }
}
