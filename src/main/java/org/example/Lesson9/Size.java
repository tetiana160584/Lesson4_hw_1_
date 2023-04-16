package org.example.Lesson9;

public enum Size {
    Small("S", 20, 30),
    Medium("M", 40,50),
    Large("L", 60, 70),
    Extra_Large("XL",80,90);

    private String abbreviation;
    private int width;
    private int length;

    Size(String abbreviation, int width, int length) {
        this.abbreviation = abbreviation;
        this.width = width;
        this.length = length;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return getAbbreviation()+" " +"size:width="+width+",length="+length;
    }
}
