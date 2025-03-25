package basics;



class Variables {
 int a=5; //instance variable
 static int c=8; //static variable
 public static void main(String[] args) {
     int b=10; //local variable
     
     
     Variables obj = new Variables();
     System.out.println("Instance variable: "+obj.a);
     System.out.println("Local variable: "+b);
     System.out.println("Static variable: "+c);
 }
}