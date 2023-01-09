import java.util.List;
import java.util.Scanner;
/**
 * Application should be a repeating menu capable of adding, displaying, and removing pets
 */
public class Application {

    public static void main(String[] args) {
        PetStoreService pss = new PetStoreService();
        Scanner sc = new Scanner(System.in);
        boolean shouldLoop = true;
        while(shouldLoop){
            System.out.println("Please choose: Add | Purchase");
            List<Pet> allPets = pss.getPets();
            System.out.println("Current pets: " + allPets);
            String input = sc.nextLine();
            if(input.equals("Add")){
                // fill in add behavior
                String name = sc.nextLine();
                String sound = sc.nextLine();
                Pet newPet = new Pet(name, sound);
                pss.addPet(newPet);
            }else if(input.equals("Purchase")){
                // fill in purchase behavior
                String name = sc.nextLine();
                // int id = Integer.parseInt(idInput);   // this was used before we implemented indexOf() on PetStoreService
                pss.purchasePet(name);
            }else if(input.equals("Exit")){
                shouldLoop = false;
                // will break the while loop next time the while loop condition is checked
            }
        }
    }
}