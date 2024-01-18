package entities;

public class Bar {
    public static char gender;
    public static int beer;
    public static int barbecue;
    public static int softDrink;

    public static double ticket(){
        if (gender=='F' || gender=='f'){
            double ticket;
            return ticket = 8;
        }else {
            double ticket;
            return ticket = 10;
        }
    }

    public static double feeding(){
        beer *= 5;
        softDrink *= 3;
        barbecue *= 7;
        return beer+softDrink+barbecue;
    }

    public static double cover(){
        double couvert;
        return couvert = 4.00;
    }

    public static double total(){
        return cover()+feeding()+ticket();
    }
}
