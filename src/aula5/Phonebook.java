/*      05 - Crie uma agenda que armazena, código da pessoa, número do telefone, idade. Sua agenda deve possibilitar:
        (1) – inserir um contato
        (2) – Remover um contato
*/

package aula5;

import java.util.Scanner;

public class Phonebook {
    static int contactID = 0;
    static int addedContacts=0;
    static int rowSize = 1;
    static String[][] phonebook = new String[rowSize][3];

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);


        while (true) {
            String option = " ";
            System.out.println("""
                    What do you whant to do?
                    1 - Add a new contact.
                    2 - Remove a contact.
                    3 - Print a contact.
                    4 - Print the phonebook
                    0 - Exit.""");
            option = in.nextLine();
            if (option.equalsIgnoreCase("1")) {
                addContact(in);
            }
            if (option.equalsIgnoreCase("2")) {
                removeContact(in);
            }
            if (option.equalsIgnoreCase("3")) {
                printContact(in);
            }
            if (option.equalsIgnoreCase("4")){
                printPhonebook();
            }
            if (option.equalsIgnoreCase("0")) {
                break;
            }
        }


    }

    private static void printPhonebook() {
        System.out.printf("""
                        %-4s %-20s %-4s\n""","ID", "Phone number","Age");

        for (String[] contact : phonebook) {
                System.out.printf("""
                        %-4s %-20s %-4s\n""",
                        contact[0],contact[1],contact[2]);
        }
        System.out.print("\n");
    }

    private static void addContact( Scanner in) {
        String[] contact = new String[3];
        contact[0] = String.valueOf(contactID++);
        System.out.println("Enter the contact phone number.");
        contact[1] = in.nextLine();
        System.out.println("Enter the contact age.");
        contact[2] = in.nextLine();

        if(addedContacts >= rowSize){

            rowSize+=1;
            String[][] temp = new String[rowSize][3];
            for (int j = 0; j < phonebook.length; j++){
                temp[j] = phonebook[j];

            }
            phonebook = temp;
        }
        phonebook[addedContacts] = contact;
        addedContacts++;
        System.out.println("Contact addes successifuly\n");
    }

    private static void printContact( Scanner in) {
        String id;
        System.out.println("Enter the ID of contact that you whant print.");
        id = in.nextLine();
        for (String[] contact : phonebook) {
            if (contact[0].equalsIgnoreCase(id)){
                System.out.printf("""
                        %-4s %-20s %-4s
                        %-4s %-20s %-4s""",
                        "ID", "Phone number\n","Age",
                        contact[0],contact[1],contact[2]);
            }
        }
        System.out.print("\n");
    }

    private static void removeContact(Scanner in) {
        String id;
        int tempID = 0;
        String[][] temp = new String[rowSize-1][3];
        System.out.println("Enter the ID of contact that you whant remove.");
        id = in.nextLine();
        for (int i = 0; i < phonebook.length; i++) {
            if(!phonebook[i][0].equalsIgnoreCase(id)){
                temp[tempID][0] = String.valueOf(tempID);
                temp[tempID][1] = phonebook[i][1];
                temp[tempID][2] = phonebook[i][2];
                tempID++;
            }
        }
        phonebook = temp;
        addedContacts--;
        System.out.println("Contact removed successifuly\n");

    }
}
