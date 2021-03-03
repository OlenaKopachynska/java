
public class Start {

    public int int1;
    public int int2;
    public int int3;
    public int int4;
    public int int5;
    public int int6;
    public int int7;
    public int int8;
    public int int9;
    public int int10;

    public Start(int int1, int int2, int int3, int int4, int int5, int int6, int int7, int int8, int int9, int int10) {
        this.int1 = int1;
        this.int2 = int2;
        this.int3 = int3;
        this.int4 = int4;
        this.int5 = int5;
        this.int6 = int6;
        this.int7 = int7;
        this.int8 = int8;
        this.int9 = int9;
        this.int10 = int10;
    }

    public static void main(String[] args) {

        Start start = new Start(1,2,3,4,5,6,7,8,9,10);

        int add = start.int1+ start.int2+start.int3+start.int4+start.int5+start.int6+start.int7+start.int8+start.int9+start.int10;
        int min = start.int1-start.int2-start.int3-start.int4-start.int5-start.int6-start.int7-start.int8-start.int9-start.int10;
        int mult = start.int1*start.int2*start.int3*start.int4*start.int5*start.int6*start.int7*start.int8*start.int9*start.int10;
        int div = start.int1/start.int2/start.int3/start.int4/start.int5/start.int6/start.int7/start.int8/start.int9/start.int10;

        System.out.println(add);
        System.out.println(min);
        System.out.println(mult);
        System.out.println(div);
    }
}
