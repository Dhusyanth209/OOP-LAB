class Student {
    private int age;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationWithGettersSetters2 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        System.out.println("Student's age: " + s.getAge());
    }
}