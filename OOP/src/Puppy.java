public class Puppy {
   int puppyAge;
   String name;

   public Puppy(String name) {
	   this.name = name;
   }

   public void getAge( ) {
      System.out.println("Puppy's age is :" + puppyAge );
      //return puppyAge;
   }

   public static void main(String []args) {
      Puppy myPuppy = new Puppy( "tommy" );

      myPuppy.name = "AHAMED";
      myPuppy.getAge();
   }
}