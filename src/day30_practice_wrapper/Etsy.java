package day30_practice_wrapper;

public class Etsy {
    public static void main(String[] args) {

        String s = "Item(s) total: $144.99";
        double price = Double.parseDouble(s.split(" ")[2].substring(1));
        /*
                s.split(" ") -> gives array ["Item(s)", "total:", "$144.99"]
                s.split(" ")[2] --> $144.99
                .substring(1) --> remove the dollar sign : 144.99
         */


        System.out.println(price);

        if(price >= 100){
            System.out.println("Check if shipping is free");
        }

    }
}
