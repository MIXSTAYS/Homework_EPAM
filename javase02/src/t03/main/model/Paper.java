package t03.main.model;

import t03.main.model.PaperFormat;
import t03.main.model.Stationery;

import static t03.main.model.PaperFormat.*;

public class Paper extends Stationery {
    private int amountInBlock;
    private PaperFormat paperFormat = A4;

    public Paper() {
    }

    public Paper(int price, int amountInBlock) {
        super(price);
        this.amountInBlock = amountInBlock;
    }

    public Paper(int price, int amountInBlock, PaperFormat paperFormat) {
        super(price);
        this.amountInBlock = amountInBlock;
        this.paperFormat = paperFormat;
    }

    public Paper(int amountInBlock, PaperFormat paperFormat) {
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
}
