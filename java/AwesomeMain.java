public class AwesomeMain {

    public static void main(String[] args) {
        AwesomeObject a1 = new AwesomeObject();
        a1.setA("23");
        AwesomeObject.setB("azaz");

        AwesomeObject a2 = new AwesomeObject();
        a2.setA("24");
        AwesomeObject.setB("pidor");


        System.out.println(a1.getB());
        System.out.println(a2.getB())
        ;
        Converter.course = 24.0;
        System.out.println(Converter.convertDollarsToHrn(20D));
        System.out.println(Converter.convertDollarsToHrn(20D));
        Converter.course = 28.0;
        System.out.println(Converter.convertDollarsToHrn(20D));
        System.out.println(Converter.convertDollarsToHrn(20D));

    }
}
