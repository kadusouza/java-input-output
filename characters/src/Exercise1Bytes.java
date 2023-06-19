import java.io.*;

//Make a copy of the file recommendations-copy.txt
public class Exercise1Bytes {
    public static void main(String[] args) throws IOException {
        copyFileByBytes();
    }

    public static void copyFileByBytes() throws IOException {
        File f = new File("/home/kadu/IdeaProjects/java-input-output/characters/recommendations-copy.txt");
        String fileName = f.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileName));

        String nameFileCopy = fileName.substring(0, fileName.indexOf("-")).concat("-copy2.txt");
        File fileCopy = new File(nameFileCopy);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy));

        int line = 0;
        while ((line  = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();
        }
        bis.close();
        bos.close();

        PrintStream ps = new PrintStream(System.out);
        ps.printf("File: \"%s\" was copied with success!!!", fileName);
    }
}
