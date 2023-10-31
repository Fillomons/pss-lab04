package it.unibo.encapsulation;
//variabili
public class SmartLamp {
    private boolean statoOnOff;
    private int intensity;
    private String color;

    //costrutti
    public SmartLamp() {
        this.statoOnOff = false;
        this.intensity=1; //da 1 a 3
        this.color="White";//white, red, blue e green
    }

    public SmartLamp(boolean statoOnOff, int intensity, String color){
        this.statoOnOff=statoOnOff;
        setIntensity(intensity);
        setColor(color);

    }

    public boolean getstatoOnOff(){
        return this.statoOnOff;
    }

    public int getintensity(){
        return this.intensity;
    }

    public String getcolor(){
        return this.color;
    }  

    //aggiunta setter
    public void switchLamp(){
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

    public boolean isOn(){
        return this.statoOnOff;
    }

    public void setIntensity(int intensity) {
        if(intensity==1 || intensity==2 || intensity==3) {
            this.intensity = intensity;
        }
    }  

    public void setColor(String Ccolor){
        if(Ccolor == "White" || Ccolor == "Green" || Ccolor == "Red" || Ccolor == "Blue"){
            this.color=Ccolor;
        }
    }

    public void printAll(){
        System.out.println("\n Status: "+getstatoOnOff());
        System.out.println("\n Color: "+getcolor());
        System.out.println("\n Intnsity: "+getintensity());
    }

    public static void main(String args[]){
        SmartLamp s = new SmartLamp();
        System.out.println("Il colore della lampada e': " + s.getcolor());
        s.printAll();
    }

}