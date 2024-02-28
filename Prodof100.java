class Prodof100 {
    
         int n=100;
         int factorial(int n){
           if(n==0)
           return(1);
           else
           return(n*factorial(n-1));
         }
         public static void main(String[] args) {
         Prodof100 obj = new Prodof100();
         System.out.println("fact of" +obj.n+":"+obj.factorial(obj.n));
         }
    }