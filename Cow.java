public class Cow {

   private String name;
   private String image;


   //constructor
   public Cow (String name)
   {
       this.name = name;
   }

   //methods
    public String getName(){
    return name;
    }

    public String getImage(){
       return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

