import javax.security.sasl.SaslClient;
import java.io.*;
import java.util.Scanner;

//Open the keyboard to type 3 movies you would recommend to a friend and save it on a txt
public class Exercise2 {
    public static void main(String[] args) throws IOException {
        readKeyboardWriteDocument();
    }

    public static void readKeyboardWriteDocument() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Type in 3 film recommendations: ");
        pw.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File f = new File("recommendations.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f.getName()));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = scanner.nextLine();
        } while (!(line.equalsIgnoreCase("end")));

        pw.printf("File: \"%s\" created with success!!", f.getName());

        pw.close();
        scanner.close();
        bw.close();
    }
}
