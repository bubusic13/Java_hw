package PartXXX;

public class Photo extends Entity {
    private int idAuthor;

    public Photo(String name, int id, int idAuthor) {
        super(name, id);
        this.idAuthor = idAuthor;
        setType("photo");
    }


    public int getAuthor() {
        return idAuthor;
    }
}
