public class Main {

    public static void main(String[] args) {
        String[] names = {"John", "Sarah"};
        int[] ages = {13, 30};

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name - " + names[i] + ". Age - " + ages[i]);
        }
        Person sarah = Person.Person("Sarah", 30);
        System.out.println("Sarah's name: " + sarah.name);
        System.out.println("Sarah's age: " + sarah.age);



    }
}