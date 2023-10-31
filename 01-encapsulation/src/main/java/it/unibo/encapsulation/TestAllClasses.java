package it.unibo.encapsulation;

public class TestAllClasses {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        System.out.println("1+2=" + calc.add(1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        Calculator.printCalculatorStatus(calc);

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        htcOne.printStringRep();
        note3.printStringRep();


        SmartLamp lamp = new SmartLamp();
        //non passo nessun valore
        System.out.println(lamp.getstatoOnOff());
        System.out.println(lamp.getintensity());
        System.out.println(lamp.getcolor());


        if (lamp.isOn()==true)
            System.out.println("accesa");
        
        System.out.println(lamp.getstatoOnOff());
        lamp.setIntensity(1);
        System.out.println(lamp.getintensity());
        lamp.setIntensity(2);
        System.out.println(lamp.getintensity());
        lamp.setIntensity(3);
        System.out.println(lamp.getintensity());

        System.out.println(lamp.getcolor());
        lamp.setColor("green");
        System.out.println(lamp.getcolor());
        if(lamp.isOn()==false)
        System.out.println("spenata");
        
    }
}
