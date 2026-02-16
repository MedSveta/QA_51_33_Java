package hw_8;

import java.util.Objects;

public class Newspaper extends MassMedia implements IPrintable{
    private int issueNumber;
    private int numberOfPages;

    public Newspaper() {
    }

    public Newspaper(String name, int issueNumber, int numberOfPages) {
        super(name);
        this.issueNumber = issueNumber;
        this.numberOfPages = numberOfPages;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        if (issueNumber > 0)
            this.issueNumber = issueNumber;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        if (numberOfPages > 0)
            this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "issueNumber=" + issueNumber +
                ", numberOfPages=" + numberOfPages +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Newspaper newspaper = (Newspaper) o;
        return issueNumber == newspaper.issueNumber && numberOfPages == newspaper.numberOfPages;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), issueNumber, numberOfPages);
    }

    @Override
    public void print() {
        System.out.println(this);
    }
}
