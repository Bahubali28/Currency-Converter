import javax.swing.*;

public class Main {
    public static int RadCAD = 0;
    public static String Cur1;
    public static String Cur2;
    public static String quanMain;


    public static void main(String[] args) {
        Cur1 = JOptionPane.showInputDialog(null, "What Currency Are you Converting?");
        Cur2 = JOptionPane.showInputDialog(null, "What Currency Are you Converting to?");
        quanMain = JOptionPane.showInputDialog(null, "How many " + Cur1 + "s " + "do you want to convert");
        if (Math.send == 1) {
            JOptionPane.showMessageDialog(null, quanMain + " " + Cur1 + "s" + " is" + Math.finalVal + Cur2 + "s");
        }
    }

    private static int StringOfValue(String quanMain) {
        return 0;
    }
}