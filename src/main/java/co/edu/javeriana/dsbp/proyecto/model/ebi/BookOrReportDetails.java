package co.edu.javeriana.dsbp.proyecto.model.ebi;

public class BookOrReportDetails {
    private String publisher;
    private int yearOfPublication;
    private String comprisingTitle;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getComprisingTitle() {
        return comprisingTitle;
    }

    public void setComprisingTitle(String comprisingTitle) {
        this.comprisingTitle = comprisingTitle;
    }
}
