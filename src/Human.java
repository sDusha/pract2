import java.time.LocalDate;

public class Human implements Comparable<Human>{
    private int age;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int weight;

    public int compareTo(Human h){
        return this.getAge() - h.getAge();
    }

    public Human(int age, String firstName, String lastName,LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }
    public int getreverseAge() {
        return -age;
    }

    public Human(int weight) {
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }
    public char getFirstNameLetter() {
        return firstName.charAt(0);
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }
}
