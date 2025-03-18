package Abstract;

abstract class Sample {
    abstract void run(); //must be overidden

    void walk(){
        System.out.println("walking....");   // optional override
    }

    static void jump(){  //cant be overriden
        System.out.println("jumping..");
    }

    final void eat(){ //cant be overriden
        System.out.println("eating..");
        write();
    }

    private void write(){ //cant be overriden
        System.out.println("writing..");
    }

}
