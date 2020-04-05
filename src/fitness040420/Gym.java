package fitness040420;

public class Gym {
    private Visitor [] visitors = new Visitor[20];

    public Visitor[] getVisitors() {
        return visitors;
    }

    public void setVisitors(Visitor[] visitors) {
        this.visitors = visitors;
    }
}
