public class App {
    public static void main(String[] args) {
        PropertyReader
                .propertyRead(
                        "javase05\\t01\\main\\resources\\universal.property");
        System.out.println(PropertyReader.propertyStringRead("2"));
        System.out.println(PropertyReader.propertyStringRead("3"));
        System.out.println(PropertyReader.propertyStringRead("2"));
        PropertyReader.propertyRead("javase05\\t01\\main\\resources\\universal.property");
        System.out.println(PropertyReader.propertyStringRead("1"));
        System.out.println(PropertyReader.propertyStringRead("3"));
    }
}