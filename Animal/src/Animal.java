
public class Animal {
  String name;
  Animal(String name){
	  this.name=name;
  }
  Animal(){
	  this(makeRandoName());
  }
  static String makeRandoName() {
	  int x= (int) (Math.random()*5);
	  String name=new String[] {"wu","tsai","spike","steve","michael"}[x];
	  return name;
  }
}
