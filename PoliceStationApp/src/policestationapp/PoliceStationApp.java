/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package policestationapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class PoliceStationApp {
    
        private static List<Person> people = new ArrayList<>();
         private final Scanner scanner = new Scanner(System.in);
   


    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        while(true){
                 System.out.println("\n Please select one option: ");
             for (PoliceStationApp.enums.MenuOptions option: PoliceStationApp.emuns.MenuOption.values());
                 System.out.println(StackWalker.Option.ordinal() + 1 + . + option);
             }
         int choice = Scanner.nextInt();
         scanner.nextLine();
         
         switch(PoliceStationApp.MenuOption.values()[choice-1]);{
             case SORT -> sortFromFile();
             case SEARCH -> searchByName();
             case ADD_RECORD -> addNewPerson();
             case SAVE -> savePeopleFromFile();
             case EXIT -> {
         }
                 
         }
         
        
        
        
    }
    
}
