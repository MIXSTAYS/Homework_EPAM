import exception.NotFoundPropertyException;

public class App {
    public static void main(String[] args) throws NotFoundPropertyException {
        PropertyReader propertyReader = new PropertyReader();
        propertyReader.propertyRead("javase05\\t01\\main\\resources\\universal.property");
        System.out.println(propertyReader.propertyStringRead("2"));
        propertyReader.propertyRead("javase05\\t01\\main\\resources\\universal2.property");
        System.out.println(propertyReader.propertyStringRead("2"));
        propertyReader.propertyRead("javase05\\t01\\main\\resources\\universal.property");
        propertyReader.propertyRead("javase05\\t01\\main\\resources\\universal1.property");
    }
}