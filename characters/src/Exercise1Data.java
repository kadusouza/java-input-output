import java.io.*;
import java.util.Scanner;

/*
Create the file "piece-of-clothing.bin" and store:
1. The name of the product, size(L/M/S), quantity or price.
2. Read the file and display on console.
*/
public class Exercise1Data {
    public static void main(String[] args) throws IOException {
        includeProduct();
    }

    public static void includeProduct() throws IOException {
        File f = new File("piece-of-clothing.bin");
        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getName()));

        Scanner scanner = new Scanner(System.in);

        ps.print("Product name: ");
        String name = scanner.nextLine();
        dos.writeUTF(name);

        ps.print("Product size: ");
        char size = (char) System.in.read();
        dos.writeChar(size);

        ps.print("Quantity: ");
        int quantity = scanner.nextInt();
        dos.writeInt(quantity);

        ps.print("Unit price: ");
        double price = scanner.nextDouble();
        dos.writeDouble(price);

        readProduct(f.getName());

        dos.close();
        scanner.close();
    }

    public static void readProduct(String fileName) throws IOException {
        File f = new File(fileName);

        DataInputStream dis = new DataInputStream(new FileInputStream(f.getName()));

        String name = dis.readUTF();
        char size = dis.readChar();
        int qty = dis.readInt();
        double price = dis.readDouble();

        System.out.printf("\nName..............: %s\n", name);
        System.out.printf("Quantity..............: %d\n", qty);
        System.out.printf("Size..............: %s\n", size);
        System.out.printf("Price..............: %f\n", price);

        dis.close();
    }
}
