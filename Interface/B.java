public interface B {
    //Concrete
    void show();

    //Default
    default void send(){
        log("sedning....");
        runn();
    }

   //Public 
    public void write();

    //static
    static void print(){
        System.out.println("printing....");
    }

    //public static 
    public static void book(){
        System.out.println("Booking....");
    }

   //private static
    private static void log(String s){
        System.out.println("[LOG] "+s);
    }

    //private 
    private void runn(){
        System.out.println("Running...");
    }
    
   
   }

