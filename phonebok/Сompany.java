package phonebok;

import java.util.List;
public class Сompany {


    private Bosses bosses;
    private Post post;
    private List<Worker> worker;

    public Сompany(Bosses bosses, Post post, List<Worker> worker) {
        this.bosses = bosses;
        this.post = post;
        this.worker = worker;
    }



    public void UpdateСompanyBosses(Bosses bosses) {
        this.bosses = bosses;
    }
    public Bosses getBosses() {
        return bosses;
    }

    public void setBosses(Bosses bosses) {
        this.bosses = bosses;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public List<Worker> getWorker() {
        return worker;
    }

    public void setWorker(List<Worker> worker) {
        this.worker = worker;
    }


}