package phonebok;

public enum Post {
    chief("начальник"),
    deputychief("заместитель начальника"),
    ChiefBoogaleter("Главный бугалетер"),
    Master("Мастер"),
    Engineer("Инженер");
    private String title;
    Post(String title){
        this.title = title;
    }
    @Override
    public String toString() {
        return title;
    }
}