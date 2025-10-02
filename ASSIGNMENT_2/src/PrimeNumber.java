public class PrimeNumber {
    public static void main(String args[])
    {
        int size = args.length;
        int[] arr = new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }

        for(int i=0;i<arr.length;i++)
        {
            boolean isPrime = true;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if(isPrime)
                System.out.println(arr[i]+" This number is prime number");
        }
    }
}
