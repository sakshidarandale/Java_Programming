import java.util.*; 

class Logic
{
    int Product(int Arr[],int iLength)
    {
        int iCnt=0,iProd=1;
        boolean bflag=false;
    
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            if((Arr[iCnt]%2)!=0)
            {
                iProd=iProd*Arr[iCnt];
                bflag=true;
            }
        }
        if(bflag==false)
        {
            return 0;
        }
        return iProd;
    }
}

class program23_5
{
    public static void main(String A[]) 
    {
        int iCnt=0,iRet=0,iSize=0;
            
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter the size of array : ");
        iSize=sobj.nextInt();
        
        //Step 1:Allocate the memory
        int Arr[]=new int[iSize];
        
        System.out.println("Enter the elments : ");
        
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Logic lobj = new Logic();
        
        //Step 2:Use memory
        iRet=lobj.Product(Arr,iSize);
        
        if(iRet==0)
        {
            System.out.println("No odd elemnts present");
        }
        else
        {
        System.out.println("Product of odd elements is : " +iRet);
        }
        
        //Step3:Free memory
        lobj = null;
        Arr = null;
        sobj = null;

        System.gc();  
    } 
}
    
