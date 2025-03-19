package Variables;

public class Extender extends Sample {

    // CAN ACCESS - protected value after driving
    int number=prot;
    
    public static void main(String[] args) { 

        Extender ex=new Extender();
        System.out.println(ex.number);
        
    }
}
