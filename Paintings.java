/**
 * Created by Keaton Sample on 11/4/2016.
 */
import java.util.Scanner;
public class Paintings {
    public static void main(String [] args) {

        Painting[] p = new Painting[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Enter Artist Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Painting Title: ");
            String title = sc.nextLine();

            switch (name){
                case "Degas":
                case "degas":
                case "Monet":
                case "monet":
                case "Picasso":
                case "picasso":
                case "rembrandt":
                case "Rembrandt":
                    p[i] = new FamousPainting(title,name);
                    break;

                default:
                    p[i] = new Painting(title,name);
                    break;
            }
        }

        for(int i = 0; i < 10; i++){
            p[i].display();
        }


    }

}
