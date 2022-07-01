import java.util.Scanner;

/**
 * Shop_Game
 */

/*  this is a game where 2 person is buying a phone at a Limit

Note:- 1st Person - Always buy FIRST. 

*1st Person* - buy FIRST therefore it is incremented by 1 and if the if condition fails to execute itself then phone need to update by 1; i.e, (2) for the 2nd Person

*2nd Person* - buy after first person therefore it is incremented by 2 and if the if condition fails to execute itself then phone need to update by 1; i.e, (3) for the 1st Person

and this Scenarion going on till any Person's Limit

if any Person buying phone crosses it's limit then another Person WIN the Game

EXAMPLE -

1st Person  2nd Person
Limit (9)   Limit (13)
1           2
3           4
5           6
LOOSE       WINS

as if 7 added to 1st Person Crosses its Limit 

Therefore 2nd Person Wins the Game!!!!!!!!!!!

*/

 public class Shop_Game {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Player1 Name");
        String Player1=sc.next();
        System.out.println("How Many Phone you wanna buy?");
        int P1_Limit=sc.nextInt();
        System.out.println("Enter Player2 Name");
        String Player2=sc.next();
        System.out.println("How Many Phone you wanna buy?");
        int P2_Limit=sc.nextInt();
        int phone = 1;
        int p1 = 0;
        int p2 = 0;
        while (true) {
            p1 = p1 +phone ;
            if (p1 > P1_Limit) {
                System.out.println(Player2+" Wins");
                break;
            }
            phone++; // if upper if fails to execute itself then phone need to update by 1; i.e, (2)
            p2 = p2 + phone;
            if (p2 >P2_Limit) {
                System.out.println(Player1+" Wins");
                break;
            }
            phone++; // if upper if fails to execute itself then phone need to update by 1; i.e, (3)
        }
    }
}