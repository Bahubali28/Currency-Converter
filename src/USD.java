import java.util.Currency;

public class USD {
    public static double ValUSD = 0;

    public static void USD(String args[]) {
        Currency UsD = Currency.getInstance("USD");
        ValUSD = UsD.getNumericCode();
        if (Main.Cur1 == "US Dollar") {
            Math.val1 = ValUSD;
        } else {
            if (Main.Cur2 == "US Dollar") {
                Math.val2 = ValUSD;
            }
        }
    }
}