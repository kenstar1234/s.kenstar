import java.util.Scanner;
class Mobile{
        String name = "";
        String processor = "";
        String ram = "";
        String storage = "";
        String price = "";
        public static void main(String kicha[]) {

            int n;
            Scanner object=new Scanner(System.in);
            n=object.nextInt();
            Mobile phone1 = new Mobile();
            phone1.name="redmi";
            phone1.processor="Snapdragon";
            phone1.ram= "8";
            phone1.storage="256";
            phone1.price="44999";

            Mobile phone2 = new Mobile();
            phone2.name="vivo";
            phone2.processor="Dimensity";
            phone2.ram= "8";
            phone2.storage="128";
            phone2.price="45999";
if(n%2==0) {
    System.out.println("Phone Company :"+phone1.name);
    System.out.println("Processor :"+phone1.processor);
    System.out.println("Ram :"+phone1.ram);
    System.out.println("Storage :"+phone1.storage);
    System.out.println("Price :"+phone1.price);
}

            else {
                System.out.println("Phone Company :"+phone2.name);
                System.out.println("Processor :"+phone2.processor);
                System.out.println("Ram :"+phone2.ram);
                System.out.println("Storage :"+phone2.storage);
                System.out.println("Price :"+phone2.price);
            }
        }
}