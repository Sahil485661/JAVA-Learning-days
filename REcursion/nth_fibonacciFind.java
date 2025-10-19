// Here we find the nth fibocacci value
package REcursion;
public class nth_fibonacciFind {
    public static int fibo(int a){
    if(a ==0|| a==1){
        return a;
    }
    int fam1 = fibo(a-1); //fam1 means fibo a minus 1
    int fam2 = fibo(a-2); //fam2 means fibo a minus 2
    int fa = fam1 +fam2;
    return fa;
}
public static void main(String[] args) {
    int a = 20;
    System.out.println(fibo(a));
}
}
