public class Main {


    public static void main(String[] args) {
        FindArea f1 = new FindArea();
        FindArea f2 = new FindArea(100, 200);
        FindArea f3 = new FindArea(300);

        System.out.println();
        System.out.print("Squar Area is ");
        f1.findArea();

        System.out.print("Traiangle Area is ");
        f2.findArea();

        System.out.print("Circle Area is ");
        f3.findArea();
    }

}
