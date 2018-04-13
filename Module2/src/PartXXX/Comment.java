package PartXXX;

public class Comment extends Entity {
    private String text;
    private int idAuthor;
    private int idPhoto;


    public Comment(String name, int id, String text, int idAuthor, int idPhoto) {
        super(name, id);
        this.text = text;
        this.idAuthor = idAuthor;
        this.idPhoto = idPhoto;
        setType("comment");

    }
}
