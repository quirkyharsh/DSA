
import java.net.*;
import java.util.Scanner;

public class DNSLookup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("DNS Lookup Program");
            System.out.println("1. Domain Name to IP Address");
            System.out.println("2. IP Address to Host Name");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter domain name: ");
                String domain = sc.nextLine();

                InetAddress[] addresses =
                        InetAddress.getAllByName(domain);

                System.out.println("IP addresses:");
                for (InetAddress address : addresses) {
                    System.out.println(address.getHostAddress());
                }

            } else if (choice == 2) {
                System.out.print("Enter IP address: ");
                String ip = sc.nextLine();

                InetAddress address = InetAddress.getByName(ip);

                System.out.println("Host name: "
                        + address.getCanonicalHostName());

            } else {
                System.out.println("Invalid choice!");
            }

        } catch (UnknownHostException e) {
            System.out.println("Unable to resolve the address.");
        } finally {
            sc.close();
        }
    }
}
