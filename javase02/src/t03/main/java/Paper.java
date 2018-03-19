package t03.main.java;

import static t03.main.java.PaperFormat.A4;

public class Paper extends Stationery {

    private int amountInBlock;
    private PaperFormat paperFormat = A4;

    public Paper(int price, int amountInBlock, PaperFormat paperFormat) {
        super(price);
        this.amountInBlock = amountInBlock;
        this.paperFormat = paperFormat;
    }

    public Paper(String brand, int price, int amountInBlock, PaperFormat paperFormat) {
        super(brand, price);
        this.amountInBlock = amountInBlock;
        this.paperFormat = paperFormat;
    }


    public int getAmountInBlock() {
        return amountInBlock;
    }

    public void setAmountInBlock(int amountInBlock) {
        this.amountInBlock = amountInBlock;
    }

    public PaperFormat getPaperFormat() {
        return paperFormat;
    }

    public void setPaperFormat(PaperFormat paperFormat) {
        this.paperFormat = paperFormat;
    }

    @Override
    public String toString() {
        return String.format("Brand \"%s\". Paper format: %s. Number of shapes in package %d. Paper price is %d", getBrand(),
                getPaperFormat(), getAmountInBlock(), getPrice());
    }
}
