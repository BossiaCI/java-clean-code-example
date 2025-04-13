package Library_management;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean available;
    
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow(){
        this.available = false;
    }

    public void returnBook(){
        this.available = true;
    }


    @Override
    public String toString(){
        return "Book["+ id + ", "+ title + ", "+ author + ", available=" + available + "]";
    }
    
    
}