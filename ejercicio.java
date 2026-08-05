public class Main{
  public static void main(String[] args){
    int n =41;
    if (esPri(n)){
        System.out.println("es primo");
    } else {
        System.out.println("No es primo");
    }
  }
  public static boolean esPri(int n){
    if (n<=1){
        return false;
    }
    int cont = 1;
    int contDiv =0;
    while(cont<=n){
        if(n%cont==0){
            contDiv++;
        }
        cont++;
    }
    return contDiv == 2;
    
  }
}
