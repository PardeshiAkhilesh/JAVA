public class S2_1 {
    public static void main(String args[])
    {
        String name = args[0];
        String lname = args[1];
        Double height = Double.parseDouble(args[2]);
        Double weight = Double.parseDouble(args[3]);
        Double BMI = weight/(height*height);
        System.out.println("Name :- "+name);
        System.out.println("Last Name :- "+lname);
        System.out.println("Height :- "+height);
        System.out.println("Weight :- "+weight);
        System.out.println("BMI "+BMI);
    }
}
