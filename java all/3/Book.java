class Book{
    private String title,author;
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public static void main(String args[]){
        Book book = new Book();
        book.setTitle("Gitanjali");
        book.setAuthor("Rabindranath Tagore");
        String x = book.getTitle();
        String y = book.getAuthor();
        System.out.println("\nThe title is "+ x);
        System.out.println("The author is " + y + "\n");
    }
}
