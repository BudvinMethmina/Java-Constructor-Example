public class FindArea {
    double num1, num2;

    public FindArea(){
        num1 = 100;
        num2 = num1;
    }

    public FindArea(int width, int heigh){
        num1 = width/2;
        num2 = heigh;
    }

    public FindArea(int radius) {
        num1 = Math.PI * radius;
        num2 = radius;
    }

    public void findArea(){
        double area = num1 * num2;
        System.out.println(area);
        
    }

}
