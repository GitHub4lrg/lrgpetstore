import java.util.ArrayList;
import java.util.List;

public class PetStoreService {
    // a list of pest allow us to store an ordered collection of Strings, which can be retrived by their index
    //vs, a set of pets, would allow us to store unique values for pets(no duplicates), which do not have indexes,
    //but are pretty good at retrieving items based of the object themselves
    List<Pet> pets;
    public PetStoreService(){
        // instantiate pets
        pets = new ArrayList<Pet>();
        // a interface may have multiple implementing classes - classes can exhibit the behavior defined by an interface
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }

    public void purchasePet(int id){
        pets.remove(id);
    }

    public void purchasePet(String name){
        // eg if Fido is at index 2, pets.indexOf("Fido") will return 2
        //for every pet, check the pet in 'pets' for if the name of the pet matches 'name'
        //if they match, remove the current pet
        for(int i = 0; i < pets.size(); i++){
            Pet currentPet = pets.get(i);
            String currentPetName = currentPet.name;
            if(currentPetName.equals(name)){
                // if this point is reached, the pet name in 'pets' matches the pet name we are searching for
                //so, remove the pet
                pets.remove(i);
            }
        }
    }
// I want to be able to print my pets, and I can just do that by attempting to print the List Object
    public List<Pet> getPets(){
        return pets;
    }
}
