package javase01.t06;

/**
 * Class of records with parameters - <b>text</b> and <b>name</b>.
 * @autor Mikhail Bystrov
 * @version 1.0
 */
public class RecordInNotebook {
    /** The text entered in the record */
    private String text;
    /** The name entered in the record */
    private String name;

    /**
     * Constructor - creating a new object with certain values
     * @param name - name
     * @param text - text
     */
    public RecordInNotebook(String name, String text){
        this.name = name;
        this.text = text;
    }

    /**
     * The operation of entering a parameter in a record
     * @param text - text entered in the record
     */
    public void setText(String text){
        this.text = text;
    }

    /**
     * The operation of entering a parameter in a record
     * @param name - name entered in the record
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Entering text and name in a record
     * @param name - name
     * @param text - text
     */
    public void setTextName(String name, String text){
        this.name = name;
        this.text = text;
    }

    /**
     * Function of getting the value of the field {@link RecordInNotebook#text}
     * @return returns text of the record
     */
    public String getText(RecordInNotebook this){
        return this.text;
    }

    /**
     * Function of getting the value of the field {@link RecordInNotebook#name}
     * @return returns name of the record
     */
    public String getName(RecordInNotebook this){
        return this.name;
    }

    /**
     * The overridden method toString(), which returns the fields of classes
     * @return name and text of the record
     */
    @Override
    public String toString() {
        return this.getName() + ". " + this.getText();
    }
}