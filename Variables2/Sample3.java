package Variables2;

import Variables.Sample;

public class Sample3 {
    public static void main(String[] args) {
        Sample sample=new Sample();
        //Can ACCESS - Public
        System.out.println(sample.pub);

        //Can ACCESS - Public static else NO
        System.out.println(Sample.stat);
    }
}
