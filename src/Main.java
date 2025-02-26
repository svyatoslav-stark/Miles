import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int ticket = 24360;
        int milesRubles = 20;
        int bonusMiles = ticket / milesRubles;

        System.out.println("Количество бонустных миль - " + bonusMiles);
    }

}
