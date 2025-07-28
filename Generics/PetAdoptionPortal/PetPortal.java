import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class PetPortal <T extends Pet> {
    private final List<T> pets;

    public PetPortal(){
        pets = new ArrayList<>();
    }

    public void addPet(T pet) {
        pets.add(pet);
    }

    public List<T> getAvailablePets() {
        return  pets.stream()
                .filter(pet -> !pet.isAdopted())
                .collect(Collectors.toList());
    }

    public List<T> filterPets(String type, int maxAge) {
        return pets.stream()
                .filter(pet -> !pet.isAdopted() &&
                        pet.getType().equalsIgnoreCase(type) &&
                        pet.getAge() <= maxAge)
                .collect(Collectors.toList());
    }

    public void displayAllPets() {
        pets.forEach(System.out::println);
    }
}
