import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int ticket = 24365; // Стоимость билета
        int milesRubles = 20; // Рублей за 1 милю
        int bonusMiles = ticket / milesRubles;

        System.out.println("За билет стоимостью " + ticket + " рублей будет начислено " + bonusMiles + " миль.");
    }

}
