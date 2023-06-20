package object;

import java.io.*;

/*
* Create a object.Cat class with the following attributes:
* Name, Age, Color.
* Create an instance and serialize it.
* Deserialize the object and display it on the console
* */
public class Exercise1Objects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize();
        deserialize("cat");
    }
    public static void serialize() throws IOException {
        Cat cat = new Cat("Simba", 6, "Orange", false, true);

        File f = new File("cat");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f.getName()));

        oos.writeObject(cat);

        System.out.println("File: " + f.getName() + " created with success!!");

        oos.close();

    }
    public static void deserialize(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        Cat catObject = (Cat) ois.readObject();

        System.out.printf("\nName..............: %s\n", catObject.getName());
        System.out.printf("Age..............: %d\n", catObject.getAge());
        System.out.printf("Color..............: %s\n", catObject.getColor());
        System.out.printf("Is castrated..............: %s\n", catObject.isCastrated());
        System.out.printf("Is noisy..............: %s\n", catObject.isNoisy());
    }
}
