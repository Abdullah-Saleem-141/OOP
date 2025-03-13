public class PC {
    private String core;
    private int ram;
    private int diskSize;

    public PC(String core, int ram, int diskSize) {
        this.core = core;
        this.ram = ram;
        this.diskSize = diskSize;
    }

    public void displayPCDetails() {
        System.out.println("PC Core: " + core + ", RAM: " + ram + "GB, Disk Size: " + diskSize + "GB");
    }
}
