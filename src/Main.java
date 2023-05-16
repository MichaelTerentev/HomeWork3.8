import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1
        Student student1 = new Student("John", new Address("Birmingham", "Western midland"));
        Student student2 = new Student("Ivan");
        printStudentInfo(student1);
        printStudentInfo(student2);
        //2
        System.out.println("*_________*");
        List<String> words = Arrays.asList("This", "is", "a", "sentence");
        words.forEach(System.out::println);
        System.out.println(words.stream().reduce("", (a, b) -> a + b + ' ').trim() + '.');
    }
    public static void printStudentInfo(Student student) {
        System.out.print(student.getName());

        if(student.getAddress().isPresent())
            System.out.println(": " + student.getAddress().get().getCity() +
                               ", " + student.getAddress().get().getRegion());
        else System.out.println();
    }
}