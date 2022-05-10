package ExercicioComposicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String name = sc.nextLine();
        String email = sc.next();
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase(Locale.US));
        Order order = new Order (new Date(), status, client);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            String productName = sc.nextLine();
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItem(orderItem);
        }
        System.out.println(order);

    }
}
