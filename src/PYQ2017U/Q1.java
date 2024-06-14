package PYQ2017U;

public class Q1 {
    public static void main(String[] args) {
        towerOfHanoi(2, "A", "B", "C");
    }

    public static void towerOfHanoi(int diskNum, String startingPole, String helperPole, String destinationPole) {
        if(diskNum > 0) {
            towerOfHanoi(diskNum - 1, startingPole, destinationPole, helperPole);
            System.out.println(startingPole + " - > " + destinationPole);
            towerOfHanoi(diskNum - 1, helperPole, startingPole, destinationPole);
        }
    }
}
