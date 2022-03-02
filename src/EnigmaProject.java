import java.util.Scanner;

public class EnigmaProject
{

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

    /*int encryptLoop(char characterToEncrypt){
        int number = 0;
        for (int i = 0; i < alphabet.length(); i++) {
            if(alphabet.charAt(i) == characterToEncrypt) {
                number = i;
            }
        }
        return number;
    }
    char decryptLoop(int numberToDecrypt){
        char character = ' ';
        for (int i = 0; i <= numberToDecrypt ; i++) {
            character = alphabet.charAt(i);
        }
        return character;
    }*/

        public static void main(String[] args)
        {
            EnigmaProject prg = new EnigmaProject();
            prg.input();
        }

        int input(){
        int typeOfEncryption;
        System.out.println("Which type of encryption do you wish to use?\nPress 1 for Caesar\nPress 2 for Vigenère");
        Scanner sc = new Scanner(System.in);


        return 0;
    }
}
