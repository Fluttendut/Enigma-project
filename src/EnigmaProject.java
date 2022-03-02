import java.util.Scanner;

public class EnigmaProject
{

    public static void main(String[] args)
    {
        EnigmaProject prg = new EnigmaProject();
        prg.input();
    }
        //I have done the methods two different ways. I would like to hear what method you prefer, and why.
        String alphabet = " ABCDEFGHIJKLMNOPQRSTUVWXYZÆØÅ";

        int encrypt(char characterToEncrypt){
        int number = alphabet.indexOf(characterToEncrypt);
        return number;
        }

        char decrypt(int numberToDecrypt){
        char character = alphabet.charAt(numberToDecrypt);
        return character;
        }


        void input(){
        Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to the Caesar encryption system\nWhat way do you want to shift?\nPress 1 for forward\nPress 2 for backwards");
            int direction = 0;
            direction = sc.nextInt();
            if (direction == 1){
                System.out.println("Do you want to encrypt or decrypt?\nPress 1 for encrypt\nPress 2 for decrypt");
                int encryptOrDecrypt = 0;
                encryptOrDecrypt = sc.nextInt();
                if(encryptOrDecrypt == 1){
                    System.out.println("How many numbers do you want to move forward?");
                    int forward = 0;
                    forward = sc.nextInt();
                    System.out.println("Please let me know what number you wish to encrypt");
                    int characterToFind = sc.nextInt();
                    System.out.println(decrypt(characterToFind + forward));
                    }
                else {
                    System.out.println("How many numbers do you want to move forward?");
                    int forward1 = 0;
                    forward1 = sc.nextInt();
                    System.out.println("Please let me know what letter you wish to encrypt");
                    String numberToFind = sc.next();
                    char c = numberToFind.charAt(0);
                    System.out.println("Your encrypted letter is: " + encrypt(c) + forward1);
                }
            }
            else {
                System.out.println("Do you want to encrypt or decrypt?\nPress 1 for encrypt\nPress 2 for decrypt");
                int encryptOrDecrypt = 0;
                encryptOrDecrypt = sc.nextInt();
                if(encryptOrDecrypt == 1){
                    System.out.println("How many numbers do you want to move backwards?");
                    int backward = 0;
                    backward = sc.nextInt();
                    System.out.println("Please let me know what number you wish to encrypt");
                    int characterToFind = sc.nextInt();
                    System.out.println(decrypt(characterToFind - backward));
                }
                else {
                    System.out.println("How many numbers do you want to move backwards?");
                    int backward2 = 0;
                    backward2 = sc.nextInt();
                    System.out.println("Please let me know what letter you wish to encrypt");
                    String numberToFind = sc.next();
                    char c = numberToFind.charAt(0);
                    System.out.println("Your encrypted letter is: " + (encrypt(c) - backward2));
                }
            }
    }
}
