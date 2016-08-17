package Inheritance;

/**
 * Created by schaud3 on 8/17/16.
 */
public class Inheritance {

    public static void main(String[] args) {
        Phone phone = new MotoG();
        MotoG motoG = new MotoG();
        System.out.println(phone.getModel());
        System.out.println(motoG.getColor());
    }
}
