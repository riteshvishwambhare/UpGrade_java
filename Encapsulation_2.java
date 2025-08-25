
class Collage{
    private String name;
    //Getter method
   public String GetName(){
    return name;
}

    public void setName( String name){
        this.name = name;
    }
}

public class Encapsulation_2{
    public static void main(String[] args) {
        Collage g = new Collage();
        g.setName("GSG collage Umarkhed");
        System.out.println(" Collage Name :" +g.GetName());
    }
}