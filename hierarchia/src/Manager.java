public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    public Manager(String name, double salary) {
        super(name, salary);
        this.teamSize = 0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba osób w zespole: " + teamSize);
    }

    public int getTeamSize() {
        return teamSize;
    }
}
