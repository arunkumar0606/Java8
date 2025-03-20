package Variables;

import java.util.function.Supplier;

public class Extender extends Sample {

    // CAN ACCESS - protected value after driving
    int number=prot;
    
    public static void main(String[] args) { 
        Supplier<Integer> value = ()-> 5;

        Extender ex=new Extender();
        System.out.println(ex.number+" "+value.get());
        
    }
}
