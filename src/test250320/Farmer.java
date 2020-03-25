package test250320;

public class Farmer {
    private int resource = 5;

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void collectRes (GiveResources){

    }
    public void spend (){
        resource -= 2;
    }

}
