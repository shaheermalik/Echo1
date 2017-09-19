import javax.swing.*;
import java.util.Scanner;

public class Echo1 {

    public static void main (String [] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a boolean value");
      boolean booleanVar =keyboard.nextBoolean();
      System.out.println("Enter a character");
      char charVar = keyboard.next().charAt(0);
      System.out.println("Enter a byte");
      byte byteVar = keyboard.nextByte();
      System.out.println("Enter a Double");
      double doubleVar = keyboard.nextDouble();
      System.out.println("Enter a integer");
      Integer IntegerVar = keyboard.nextInt();
      System.out.println("Enter a short");
      short ShortVar = keyboard.nextShort();
      System.out.println("Enter a Long");
      long LongVar = keyboard.nextLong();
      System.out.println("Enter a Float");
      Float FloatVar = keyboard.nextFloat();
        JOptionPane.showMessageDialog(null,"You have just entered a boolean value of " + booleanVar +
                "\n" + "You have just entered a character value of " + charVar
                + "\n" + "You have just entered a byte value of "+ byteVar+ "\n" + "You have just entered a double value of " + doubleVar
                + "\n" + "You have just entered a integer value of "+ IntegerVar +
                "\n" +"You have just entered a short value of " + ShortVar +
                "\n" + "You have just entered a Long value of "+ LongVar
                + "\n" + "You have just entered a Float value of "+FloatVar );
    }
}
