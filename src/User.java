public class User {
    private String text = "Ahoj";
    private int num = 8;

    public User(String text, int num) {
        this.text = text;
        this.num = num;
    }

    @Override
    public String toString() {
        return "text= " + text +" , "+num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
