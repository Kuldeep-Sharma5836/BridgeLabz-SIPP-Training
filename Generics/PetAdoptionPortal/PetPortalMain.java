public class PetPortalMain {
    public static void main(String[] args) {

        final String BLUE = "\u001b[34m";
        final String RESET = "\u001b[0m";

        PetPortal<Pet> portal = new PetPortal<>();

        portal.addPet(new Pet("Dog",2,true));

        portal.addPet(new Pet("Cat",1,false));

        portal.addPet(new Pet("Bird",1,true));

        portal.addPet(new Pet("Dog",4,false));

        portal.displayAllPets();

        System.out.println(BLUE + "\nAll Available Pets : " + RESET);
        portal.getAvailablePets().forEach(System.out::println);

        System.out.println(BLUE + "\nFilter : Type -> Dog, Age -> 3 : " + RESET);
        portal.filterPets("cat",2).forEach(System.out::println);
    }
}
