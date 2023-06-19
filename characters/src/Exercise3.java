import java.io.*;
import java.util.Scanner;

//Make a copy of the file recommendations.txt and add 3 film recommendations
public class Exercise3 {
    public static void main(String[] args) throws IOException {
        copyFile();
    }

    public static void copyFile() throws IOException {
        File f = new File("/home/kadu/IdeaProjects/java-input-output/characters/recommendations.txt");
        String nameFile = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nameFile));
        String line = br.readLine();

        String nameFileCopy = nameFile.substring(0, nameFile.indexOf(".")).concat("-copy.txt");
        File fcopy = new File(nameFileCopy);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fcopy.getName()));
        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        } while (!(line == null));

        System.out.println("File " +
                "\"" + f.getName() + "\""+
                "copied with success");
        System.out.printf("File: \"%s\" created with success!!", fcopy.getName());

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("\nAdd 3 film recommendations: ");
        pw.flush();

        addRecommendations(fcopy.getName());

        pw.printf("File: \"%s\" edited with success!!", fcopy.getName());

        br.close();
        bw.close();
        pw.close();

    }

    public static void addRecommendations(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        } while (!(line.equalsIgnoreCase("end")));
        br.close();
        bw.close();
    }
}
