package by.teachmeskills.robot.enums;

public enum BrandsAndMarkupIndex {

    SAMSUNG(1.8F),
    SONY(1.5F),
    TOSHIBA(1.3F);
    private float markupIndex;

    BrandsAndMarkupIndex(float markupIndex) {
        this.markupIndex = markupIndex;
    }

    public float getMarkupIndex() {
        return markupIndex;
    }

    public void setMarkupIndex(float markupIndex) {
        this.markupIndex = markupIndex;
    }
}
