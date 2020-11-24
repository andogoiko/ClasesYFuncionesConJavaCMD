public class HelloWorld {

  public static void main(String[] args) {
     System.out.println("Hello world!");
hello("santi");
hello("todos");
hello("a todas las chicas en clase");

	Calculadora cal = new Calculadora();
	cal.setMemoria(25);
	double n = cal.getMemoria();
	System.out.println("memoria" + n);
  }

public static void hello(String persona){
System.out.println("Saludo a" + persona);
}

}
