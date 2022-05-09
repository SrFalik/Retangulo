package W3Resource;

import java.util.ArrayList;
import java.util.Scanner;

public class Colors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;
        String cor;
        ArrayList<String> list = new ArrayList<>();
        do {
            id = sc.nextInt();
            if (id > 0) {
                cor = sc.next();
                list.add(cor);
            } else {
                cor = sc.next();
                list.add(0, cor);
                for (String x : list) {
                    System.out.println(x);
                }
                list.set(1, "piclescomarroz");
                System.out.println(list.indexOf("picles"));
                break;
            }
        } while (true);
    }
}
