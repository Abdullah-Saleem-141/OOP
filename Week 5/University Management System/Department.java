public class Department {
    private String hodName;
    private String[] staff;
    private Lab[] labs;

 public Department(String hodName, String[] staff, int numLabs) {
        this.hodName = hodName;
        this.staff = staff;
        this.labs = new Lab[numLabs];
    }

 public void addLab(Lab lab, int index) {
        if (index >= 0 && index < labs.length) {
            labs[index] = lab;
        }
    }

 public void displayDepartmentDetails() {
   System.out.println("\nHOD: " + hodName);
   System.out.println("Staff Members: ");
   for (int i = 0; i < staff.length; i++) {
            System.out.println("- " + staff[i]);
        }
   for (int i = 0; i < labs.length; i++) {
            if (labs[i] != null) {
                labs[i].displayLabDetails();
            }
        }
    }
}
