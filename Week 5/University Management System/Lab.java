public class Lab {
    private String labName;
    private String labIncharge;
    private String labAddress;
    private PC[] pcs;

 public Lab(String labName, String labIncharge, String labAddress, int numPCs) {
        this.labName = labName;
        this.labIncharge = labIncharge;
        this.labAddress = labAddress;
        this.pcs = new PC[numPCs];
    }

 public void addPC(PC pc, int index) {
        if (index >= 0 && index < pcs.length) {
            pcs[index] = pc;
        }
    }
public void displayLabDetails() {
        System.out.println("\nLab Name: " + labName);
        System.out.println("Lab Incharge: " + labIncharge);
        System.out.println("Lab Address: " + labAddress);
        for (int i = 0; i < pcs.length; i++) {
            if (pcs[i] != null) {
                pcs[i].displayPCDetails();
            }
        }
    }
}
