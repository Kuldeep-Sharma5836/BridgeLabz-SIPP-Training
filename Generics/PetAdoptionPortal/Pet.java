public class Pet {
    private final String type;
    private final int age;
    private final boolean isAdopted;

    public Pet(String type, int age, boolean isAdopted) {
        this.type = type;
        this.age = age;
        this.isAdopted = isAdopted;
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

    @Override
    public String toString() {
//        System.out.println("----------------------");
        return  "\nPET [Type] : " + this.type +
                "\n[Age] : " + this.age +
                "\n[Adoption Status] : " + (this.isAdopted ? "\u001b[32mAdopted\u001b[0m" : "\u001b[31mNot Adopted\u001b[0m");
    }


}
