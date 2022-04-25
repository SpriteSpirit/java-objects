public class Main {
    public static void main(String[] args) {
        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name - " + names[i] + ". Age - " + ages[i]);
        }
        Person sarah = new Person();
        sarah.name = "Sarah";
        System.out.println("Sarah's name: " + sarah.name);
        sarah.age = 30;
        System.out.println("Sarah's age: " + sarah.age);

    }
}