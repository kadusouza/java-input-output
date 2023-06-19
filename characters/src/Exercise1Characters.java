import java.io.*;

//Open the keyboard to type 3 movies you would recommend to a friend and print it on console
public class Exercise1Characters {
    public static void main(String[] args) throws IOException {
        receiveFilmsAndPrintThem();
    }

    public static void receiveFilmsAndPrintThem() throws IOException {
        /*
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        ***More usual the way below***
        */
        System.out.println("Type 3 films you would recommend to a friend: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line  = br.readLine();

        /*
        OutputStream os = System.out;
        OutputStreamWriter osr = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osr);
        */

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.isEmpty()));
        bw.flush();

        br.close();
        bw.close();

    }
}