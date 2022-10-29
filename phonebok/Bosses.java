package phonebok;


public class Bosses extends Person {
    private Post post;

    public Bosses(String name, Integer num, Post post) {
        super(name, num);
        this.post = post;
    }

    public Post getpost() {
        return post;
    }

    public void setpost(Post post) {
        this.post = post;
    }

    @Override
    public void printSkill() {
        System.out.println(this.getName().toString()+" "+super.getnum()+"   "+this.post.toString());
    }
}
