import java.net.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String host;
        Scanner ch = new Scanner(System.in);

        System.out.print("1.Enter Host Name \n2.Enter IP address \nChoice=");
        int choice = ch.nextInt();
        ch.nextLine(); // Consume the newline character left by nextInt()

        if (choice == 1) {
            System.out.print("\nEnter host name: ");
            host = ch.nextLine();

            try {
                InetAddress address = InetAddress.getByName(host);
                System.out.println("IP address: " + address.getHostAddress());
                System.out.println("Host name: " + address.getHostName());
                System.out.println("Host name and IP address: " + address.toString());
            } catch (UnknownHostException ex) {
                System.out.println("Could not find " + host);
            }
        } else {
            System.out.print("\nEnter IP address: ");
            host = ch.nextLine();

            try {
                InetAddress address = InetAddress.getByName(host);
                System.out.println("Host name: " + address.getHostName());
                System.out.println("IP address: " + address.getHostAddress());
                System.out.println("Host name and IP address: " + address.toString());
            } catch (UnknownHostException ex) {
                System.out.println("Could not find " + host);
            }
        }

        ch.close();
    }
}