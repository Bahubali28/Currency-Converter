import java.util.Currency;
public class CAD {
    public static double ValCAD = 0;
    public static void CAD (String args[]) {
        Currency CanD = Currency.getInstance("CAD");
        ValCAD = CanD.getNumericCode();
        if (Main.Cur1 == "Canadian Dollar") {
            Math.val1 = ValCAD;
        } else {
            if (Main.Cur2 == "Canadian Dollar") {
                Math.val2 = ValCAD;
            }
        }
    }
}
