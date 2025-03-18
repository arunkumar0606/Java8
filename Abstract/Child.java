package Abstract;

public class Child extends Sample{

    @Override
    void run() {
        System.out.println("Only this is mandatory to override");
    }

    @Override
    void walk(){
        System.out.println("This is Optional to override");
    }
    
}
