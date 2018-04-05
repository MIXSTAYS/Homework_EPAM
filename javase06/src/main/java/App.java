import t02.propertyReader.PropertyReaderToMap;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        PropertyReaderToMap.propertyRead("javase06\\src\\main\\java\\t02\\resources\\property.property");
        System.out.println(PropertyReaderToMap.propertyReaderToMap("1"));
        System.out.println(PropertyReaderToMap.propertyReaderToMap("3"));

        //При добавлении элемента с ключом, который уже присутствует, прошлый ключ перезаписывается
    }
}
