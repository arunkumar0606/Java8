public interface B {
    //abstract method  - mandatory override
    void show();

    //Default - Optional override
    default void send(){
        log("sedning....");
        runn();
    }

   //Public - can override
    public void write();

    //static  - cannot overrride
    static void print(){
        System.out.println("printing....");
    }

    //public static - - cannot overrride
    public static void book(){
        System.out.println("Booking....");
    }

   //private static - cannot override
    private static void log(String s){
        System.out.println("[LOG] "+s);
    }

    //private - cannot override
    private void runn(){
        System.out.println("Running...");
    }
    
   
   }

