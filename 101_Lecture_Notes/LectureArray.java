/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = [5,8,7,8,4,2,9,1];
        
        for(int i = 1; i < arr.length; i++){
            System.out.println(arr[i] + " " + arr[i+1]);
        }
        int x = 8;
        for(int i = 1; i < arr.length; i++){
            if(x == arr[i]){
                System.out.println(i);
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Consect at " + i + " and " + [i+1]);
            }
        }
        
        
        
        
        
        //how to minimum. on line 35, Dean said to do Integer.Max_Value;
        //for maximum, you would change the < to >
        
        int [] arr = [3,4,....];
        
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
	}
}