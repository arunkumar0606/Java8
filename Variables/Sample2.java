package Variables;

public class Sample2 {
    public static void main(String[] args) {

    // SAME PACKAGE

    Sample sample=new Sample();
    //can access  - default , public , protected 

    System.out.println(sample.defa);
    System.out.println(sample.pub);
    System.out.println(sample.prot);
    //can access  - Static 
    System.out.println(Sample.stat);

    }
}
