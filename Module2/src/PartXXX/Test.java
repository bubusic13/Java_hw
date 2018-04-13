package PartXXX;

public class Test {
    public static void main(String[] args) {
        User user = new User("vasya", 14);
        Photo photo = new Photo("eda",11, 14);
        Comment comment = new Comment("www", 13, "vvv", 14, 11);

        SocialNetwork network = new SocialNetwork();
        network.like(user, photo);
        network.like(user, comment);
        network.unlike(user, comment);
        network.executeCountQuery(photo);
        network.executeSelectQuery(photo);
    }
}
