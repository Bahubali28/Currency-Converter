public class Math {
    public static double finalVal;
    public static double val1;
    public static double val2;
    public static double quan;
    public static int send;
    public static void Math (String args[]) {
        quan = Double.parseDouble(Main.quanMain);
        finalVal = quan * val1 / val2;
        send = 1;
    }
}
