public class Main {
    public static void main(String[] args) {

        int ticket; // стоимость белета
        ticket = 5_000;
        int mile; // количество рублей для одной бонусной мили
        mile = 20;

        System.out.println("Количество бонусов за 1 билет:");
        System.out.println(ticket / mile);
    }
}