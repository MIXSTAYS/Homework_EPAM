import t02.propertyReader.PropertyReaderToMap;

public class App {
    public static void main(String[] args) {
        PropertyReaderToMap propertyReaderToMap = new PropertyReaderToMap();
        propertyReaderToMap.propertyRead("javase06\\src\\main\\java\\t02\\resources\\property.property");
        propertyReaderToMap.propertyReaderToMap();
        System.out.println(propertyReaderToMap.propertyStringRead("3"));
        System.out.println(propertyReaderToMap.propertyStringRead("1"));

        //При добавлении элемента с ключом, который уже присутствует, прошлый ключ перезаписывается
    }
}
