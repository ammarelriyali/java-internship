package Library;

abstract class LibraryResource {
    private String title;
    private String author;
    private String publicationYear;

    public LibraryResource(String title, String author, String publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    protected String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    protected String getPublicationYear() {
        return publicationYear;
    }
    protected String displayInformation() {
        return "\n title : " + getTitle() +
                "\n author : " +  getAuthor() +
                "\n publicationYear : " +  getPublicationYear();
    }
}
