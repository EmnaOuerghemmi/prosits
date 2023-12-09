import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nbrCages=20;
        String zooName="my zoo";
        System.out.println(zooName+" comporte "+ nbrCages+" cages");
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez le nombre de cage ");
        nbrCages=Integer.parseInt(sc.nextLine());
        System.out.print("Donnez le nom du zoo ");
        zooName=sc.nextLine();
        System.out.println( zooName+" comporte "+ nbrCages+" cages");
    }

}