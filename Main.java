public class Main {

    public static void main(String[] args) {
        double epsilon = 1.0;
        while (1.0 + epsilon != 1.0) {
            epsilon *= 0.5;
        }
        System.out.println("Epsilon dla double: " + epsilon);

        float machEpsFloat = 1.0f;
        while (1.0f + machEpsFloat != 1.0f) {
            machEpsFloat *= 0.5f;
        }
        System.out.println("Epsilon dla float : " + machEpsFloat);
    }
}
