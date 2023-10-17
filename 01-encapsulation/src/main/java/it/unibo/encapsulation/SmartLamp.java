package it.unibo.encapsulation;
//variabili
public class SmartLamp{
    private static boolean statoOnOff;
    public static int intensity;
    public static String color;

    //costrutti
    public SmartLamp(){
        this.statoOnOff=false;
        this.intensity=1; //da 1 a 3
        this.color='White';//white, red, blue e green
    }

    public SmartLamp(boolean SstatoOnOff, int Iintensity, int Ccolor){
        this.statoOnOff=SstatoOnOff;
        if(Iintensity<1 && Iintensity>3){
            System.out.println("Valore errato");
            this.intensity=1;
        }
        else{
            this.intensity=Iintensity;
        }

        switch(Ccolor){
            case "White":
                this.color=Ccolor;
                break;
            case "Green":
                this.color=Ccolor;
                break;
            case "Red":
                this.color=Ccolor;
                break;
            case "blue":
                this.color=Ccolor;
                break;
        }

    }

    //aggiunta setter
    public void ONstatoOnOff(){
        if(this.statoOnOff==false){
            this.statoOnOff= true;
            System.out.println("Accesa");
        }
        else{//offstatoONOff
            this.statoOnOff= false;
            System.out.println("Spenta");
        }
    }

    public void calculationintensity(){
        if(this.intensity==1){
            System.out.println("Intensità bassa");
        }
        else if(this.intensity==2){
            System.out.println("Intensità media");
        }
        else{
            System.out.println("Intensità alta");
        }
    }  


}