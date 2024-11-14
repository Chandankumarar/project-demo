public class prime{
    public static void main(String[] args) {
        //to print even numbers till 30
        int i;
        for(i=1;i<=30;i++)
        {
            if(i%1==0 && i%i==1)
                System.out.println(i);
        }
    }
}
