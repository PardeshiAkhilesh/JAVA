public class S1_1 {
    public static void main(String args[])
    {
        int size = args.length;
        int[] arr = new int [size];
        for(int i=0;i<size;i++)
        {
            arr[i] = Integer.parseInt(args[i]);
        }
        for(int i=0;i<size;i++)
        {
            boolean isPrime= true;
            for(int j=2;j<arr[i];j++)
            {
                if(arr[i] %j==0)
                {
                    isPrime= false;
                    break;
                }
            }
            if(isPrime)
            {
                System.out.println("Prime No -"+arr[i]);
            }
        }
    }
}
