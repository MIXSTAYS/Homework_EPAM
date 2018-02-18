package javase01.t06;

import java.util.Arrays;

/**
 * Class notebook with parameters - <b>recordsCounter</b> and <b>recordStorage</b>.
 * @autor Mikhail Bystrov
 * @version 1.0
 */
public class Notebook {
    /** The counter, which contains number of records in notebook */
    private int recordsCounter;
    /** The dataarray, which contains all the records in notebook */
    private RecordInNotebook[] recordStorage;

    /**
     * Constructor - creating a new object with certain values
     * @param size - size of the record's storage
     */
    public Notebook(int size){
        if (size < 0) {
            throw new NullPointerException("Size can't be negative");
        } else {
            this.recordStorage = new RecordInNotebook[size];
        }
    }

    /**
     * Adding a record to a notebook and increase {@link Notebook#recordsCounter}
     * @param record
     */
    public void addEntry(RecordInNotebook record){
        if (this.recordsCounter == recordStorage.length) {
            recordStorage = Arrays.copyOf(recordStorage, recordStorage.length + 1);
            recordStorage[this.recordsCounter] = record;
            recordsCounter++;
            System.out.println("Notebook was extended");
        } else {
            recordStorage[this.recordsCounter] = record;
            recordsCounter++;
        }
    }
    /**
     * Removing a record by index from a notebook and decrease {@link Notebook#recordsCounter}
     * @param index
     */
    public void deleteEntry (int index){
        if (index >= recordStorage.length) {
            System.out.println("No entry with this index");
        } else {
            if (index != recordStorage.length - 1) {
                recordStorage[index] = recordStorage[index + 1];
            } else {
                recordStorage[index] = null;
            }
            recordStorage = Arrays.copyOf(recordStorage, recordStorage.length - 1);
            recordsCounter--;
        }
    }
    /**
     * Editing fields {@link RecordInNotebook#name} {@link RecordInNotebook#text}
     * of indexed record at a notebook
     * @param index
     * @param name
     * @param text
     */
    public void editEntry(int index, String name, String text){
        if (index >= recordStorage.length) {
            System.out.println("Can't edit a nonexistent record");
        } else {
            recordStorage[index].setTextName(name, text);
        }
    }
    /**
     * Function of viewing all the records from a notebook
     */
    public void showAllEntries(){
        for (RecordInNotebook rec:recordStorage){
            System.out.print(rec + ";    ");
        }
        System.out.println("");
    }
}