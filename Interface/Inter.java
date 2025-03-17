public interface Inter {
   void show();
   default void send(){
    System.out.println("Sending....");
   }


}
