public class Array {
    public static void main(String[] args) {
        int intArray[];
        intArray = new int[8];
        System.out.println("Array before adding the data.");
        display(intArray);
        
        //Operation: Insertion
        for(int i=0; i < intArray.length; i++)
        {
            System.out.println("Adding " +i+ " at index" +i);
            intArray[i]=i;
        }
        System.out.println();
        System.out.println("Array after adding the data.");
        display(intArray);
        
        //Operation insertion
        //element at any location can be updated directly.
        int index=5;
        intArray[index]=10;
        System.out.println("Array after updating element at index" +index);
        display(intArray);
        
        //Operation : Search using index (Search a element using index)
        System.out.println("Data at index" +index + " : " +intArray[index]);

        //Operation : Search using value (Search a element using value)
        int value=4;
        for(int i=0;i<intArray.length;i++)
        {
            if(intArray[i]==value){
                System.out.println(value+ "Found index value" +i);
                break;
            }
        }
        System.out.println("Data at index" +index+ ":" +intArray[index]);
    }
    private static void display(int[] intArray){
        System.out.println("Array :[");
        for(int i=0;i<intArray.length;i++)
        {
            //displaying the value of element of index i
            System.out.println(" " +intArray[i]);
        }
        System.out.println(" ]");
        System.out.println();
    }
}


/*
Output
Array before adding the data.
Array :[0 0 0 0 0 0 0 0]

Adding 0 at index0
Adding 1 at index1
Adding 2 at index2
Adding 3 at index3
Adding 4 at index4
Adding 5 at index5
Adding 6 at index6
Adding 7 at index7

Array after adding the data.
Array :[0 1 2 3 4 5 6 7]

Array after updating element at index5
Array :[0 1 2 3 10 6 7]

Data at index5 : 10
4Found index value4
Data at index5:10
 */