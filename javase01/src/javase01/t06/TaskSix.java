package javase01.t06;

public class TaskSix {
    public static void main(String[] args) {
        RecordInNotebook anotherRecord = new RecordInNotebook("Katya", "woman");
        RecordInNotebook anotherRecord1 = new RecordInNotebook("Pasha", "man");
        RecordInNotebook anotherRecord2 = new RecordInNotebook("Glasha", "woman");
        Notebook journal = new Notebook(2);
        journal.showAllEntries();
        journal.addEntry(anotherRecord);
        journal.addEntry(anotherRecord1);
        journal.showAllEntries();
        journal.addEntry(anotherRecord2);
        journal.showAllEntries();
//        journal.deleteEntry(2);
//        journal.showAllEntries();
//        journal.editEntry(0,"Ha-ha!", "Joke!");
//        journal.showAllEntries();
    }
}
