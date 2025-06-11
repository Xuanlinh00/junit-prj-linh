public class app {
    public static void main(String[] args) {
        //System.out.println("hello world");
        GradeConverter converter = new GradeConverter();
        for (int i = 1; i < 105; i++) {
            System.out.println(i + ": " + converter.convert(i));
        }
    }
}
