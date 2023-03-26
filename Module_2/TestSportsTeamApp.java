import java.util.Arrays;
import java.util.Scanner;

public class TestSportsTeamApp {

    public static void main(String[] args) {
        Team team;
        boolean addMorePlayers = true;
        System.out.println("Welcome to Sports Team App\n");

        while(addMorePlayers) {

            team = new Team();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a team name:");
            team.setTeamName(scan.nextLine());
            System.out.println("Enter player names: (hint: use commas for multiple players)");
            team.setPlayers(scan.next().split(","));

            System.out.println("\n-- Team Summary --\n");
            System.out.println("Number of players in the team: "+team.getPlayerCount());
            System.out.println("Players in the team: "+Arrays.toString(team.getPlayers()));

            System.out.println("\n--------------------------------------");
            System.out.println("Want to add another player? (y or n)");
            Scanner scan1 = new Scanner(System.in);
            String wantToAddMorePlayers = scan1.nextLine();
            if ("n".equalsIgnoreCase(wantToAddMorePlayers)) {
                addMorePlayers = false;
            }

        }
    }

}