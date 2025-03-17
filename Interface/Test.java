public class Test implements Inter,B{

    @Override
    public void show() {
        System.out.println("inside method");
    }

    @Override
    public void send(){
        B.super.send();
        System.out.println("overidded sending..");
    }


    @Override
    public void write() {
        System.out.println("overidded writing..");
    }


    
}
