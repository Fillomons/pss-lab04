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

    public SmartLamp(boolean SstatoOnOff, int Iintensity, String Ccolor){
        this.statoOnOff=SstatoOnOff;
        if(Iintensity<1 && Iintensity>3){
            System.out.println("Valore errato");
            this.intensity=1;
        }
        else{
            this.intensity=Iintensity;
        }

        color(Ccolor);

    }

    public boolean getstatoOnOff(){
        return this.statoOnOff;
    }

    public boolean getintensity(){
        return this.intensity;
    }

    public boolean getcolor(){
        return this.color;
    }  

    //aggiunta setter
    public void ONstatoOnOff(){
        /*if(this.statoOnOff==false){
            this.statoOnOff= true;
            System.out.println("Accesa");
        }
        else{//offstatoONOff
            this.statoOnOff= false;
            System.out.println("Spenta");
        }*/
        this.statoOnOff=!this.statoOnOff;
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

    public void color(String Ccolor){
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

    public void printAll(){
        System.out.println("\n Status: "+getstatoOnOff());
        System.out.println("\n Color: "+getcolor());
        System.out.println("\n Intnsity: "+getintensity());
    }

}