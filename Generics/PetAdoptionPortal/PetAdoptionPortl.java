import java.util.*;

class Pet {
    private String type;
    private int age;
    private boolean isAdopted;

    public Pet(String type, int age) {
        this.type = type;
        this.age = age;
        this.isAdopted = false;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdopted() {
        return isAdopted;
    }

    public void adopt() {
        isAdopted = true;
    }

    @Override
    public String toString() {
        return type + " (Age: " + age + ", Adopted: " + isAdopted + ")";
    }
}

class PetAdoptionPortal<T extends Pet> {
    private List<T> petList;

    public PetAdoptionPortal() {
        petList = new ArrayList<>();
    }

    public void addPet(T pet) {
        petList.add(pet);
    }

    public void listAllPets() {
        if (petList.isEmpty()) {
            System.out.println("No pets in the portal.");
        } else {
            for (T pet : petList) {
                System.out.println(pet);
            }
        }
    }

    public List<T> filterPets(String type, int maxAge) {
        List<T> result = new ArrayList<>();
        for (T pet : petList) {
            if (pet.getType().equalsIgnoreCase(type) && pet.getAge() <= maxAge && !pet.isAdopted()) {
                result.add(pet);
            }
        }
        return result;
    }

    public boolean adoptPet(String type, int age) {
        for (T pet : petList) {
            if (pet.getType().equalsIgnoreCase(type) && pet.getAge() == age && !pet.isAdopted()) {
                pet.adopt();
                System.out.println("Adopted: " + pet);
                return true;
            }
        }
        System.out.println("No matching pet found to adopt.");
        return false;
    }
}

public class PetAdoptionPortl {
    public static void main(String[] args) {
        PetAdoptionPortal<Pet> portal = new PetAdoptionPortal<>();

        portal.addPet(new Pet("Dog", 2));
        portal.addPet(new Pet("Cat", 1));
        portal.addPet(new Pet("Dog", 3));
        portal.addPet(new Pet("Bird", 1));
        portal.addPet(new Pet("Reptile", 4));

        System.out.println("=== All Pets ===");
        portal.listAllPets();

        System.out.println("\n=== Filter: Dogs age <= 2 ===");
        List<Pet> filtered = portal.filterPets("Dog", 2);
        for (Pet pet : filtered) {
            System.out.println(pet);
        }

        System.out.println("\n=== Adopt Dog age 2 ===");
        portal.adoptPet("Dog", 2);

        System.out.println("\n=== Updated Pets ===");
        portal.listAllPets();
    }
}
