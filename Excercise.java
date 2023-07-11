import java.util.Scanner;

public  class Excercise{
    public static void main(String[] args) {
        
        Scanner enter = new Scanner(System.in);
        boolean close = false;
        String anime;


        do {

            System.out.print("options:"
             + "\n hxh"
             + "\n kobayashi "
             + "\n jojo's "
             + " \n 30 or 31"
             + "\n choose: ");

             anime = enter.nextLine();

             if(anime.equals("hxh") || anime.equals("HXH")){

                  System.out.println(" a twelve-year-old boy who wants to find his father at all costs, so he decides to become HXH :D ");

             }else if(anime.equals("kobayashi") || anime.equals("KOBAYASHI")){

                System.out.println("a dragon who falls madly in love with a human who makes her a strange offer, to live with her in the human world as her servant :D");

             }else if (anime.equals("jojo's") || anime.equals("JOJO'S")){

                System.out.println("a powerful family of British origin destined to combat evil supernatural forces using acquired powers :D ");

             }else if (anime.equals("30") || anime.equals("31")){

                    System.out.println("bye have a great day!!:D ");
                   close = true;
             }else {
                  System.out.println("failed attempt again :C ");
            }

    }while(!close);
    }

}