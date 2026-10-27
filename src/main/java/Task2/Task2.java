package Task2;

public class Task2 {

    public static void main(String[] args) {

        DataBox<String> nameBox = new DataBox<>("Aisha");

        DataBox<Integer> idBox = new DataBox<>(101);

        System.out.println("Student Name: " + nameBox.getValue());
        System.out.println("Student ID: " + idBox.getValue());
    }
}