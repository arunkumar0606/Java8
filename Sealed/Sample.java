package Sealed;

public class Sample {
    public static void main(String[] args) {
        IplCup cup =new Csk();
        cup.win();

        IplCup cpu =new Mumbai();
        cpu.win();

    }
}
