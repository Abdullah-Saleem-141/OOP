public class Main {
    public static void main(String[] args) {
        Campus comsats = new Campus("Comsats University", 10);

  String[] departmentNames = {
"Department of Computer Science",
"Department of Physics",
 "Department of Mathematics",
 "Department of Chemistry",
 "Department of Pharmacy",
  "Department of English",
  "Department of Urdu",
  "Department of Biology",
 "Department of Electrical Engineering",
 "Department of Mechanical Engineering"
        };

String[] hodNames = {"Abdullah", "Ali", "Maaz", "Saad", "Awaim", "Ahmad", "Qasim"};

  for (int i = 0; i < 10; i++) {
    String departmentName = departmentNames[i];  // Get department name
    String hodName = hodNames[i % hodNames.length]; // Assign HOD name
    Department dept = new Department(hodName, new String[]{"Staff1", "Staff2"}, 50);

    System.out.println("\nAdding " + departmentName + " with HOD: " + hodName);
    for (int j = 0; j < 50; j++) {
    String labIncharge = hodNames[j % hodNames.length]; // Assign incharges
    Lab lab = new Lab("Lab " + (j + 1), labIncharge, "Block A" + j, 5);

    for (int k = 0; k < 5; k++) {
        lab.addPC(new PC("i5", 8, 500), k);
                }

    dept.addLab(lab, j);
            }

            comsats.addDepartment(dept, i);
        }
        comsats.displayCampusDetails();
    }
}
