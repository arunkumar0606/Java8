package Variables;

public class Sample {
    int defa=20;
    public static int stat=10;
    public int pub=3;
    protected int prot=5;
    private static int priv=2;

    public static void main(String[] args) {
        //Can only access "stat" static variable
        System.out.println(stat);

        // Can only access in this class
        System.out.println(priv);

    }
}
