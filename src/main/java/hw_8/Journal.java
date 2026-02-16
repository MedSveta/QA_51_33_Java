package hw_8;

import java.util.Objects;

public class Journal extends Newspaper{
    private boolean glossy;

    public Journal() {
    }

    public Journal(String name, int issueNumber,
                   int numberOfPages, boolean glossy) {
        super(name, issueNumber, numberOfPages);
        this.glossy = glossy;
    }

    public boolean isGlossy() {
        return glossy;
    }

    public void setGlossy(boolean glossy) {
        this.glossy = glossy;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "glossy=" + glossy +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Journal journal = (Journal) o;
        return glossy == journal.glossy;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), glossy);
    }

}
