import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticket = 10_000; // Стоимость билета
        int miles = service.calculate(ticket);


        System.out.println("За билет стоимостью " + ticket + " рублей будет начислено " + miles + " миль.");
    }

}
