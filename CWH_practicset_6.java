public class CWH_practicset_6 {
    public static void main(String[] args) {
//Question1:Create an array of 5 floats and calculate their sum:
        // float [] marks = {45.7f,67.8f,63.4f,99.3f,100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;

        // }
        // System.out.println("The value of sum is:"+sum);


//Question2:Write a program to find out whether a given integer is preset
//  in an array or not:
        // float [] marks = {45.7f,67.8f,63.4f,99.3f,100.0f};
        // float num = 45.7f;
        // boolean isInArray = false;
        // for(float element:marks){
        //     if(num == element) {
        //         isInArray = true;
        //         break;
        //     }

        // }
        // if(isInArray){
        // System.out.println("The value of present in the array");

        // }
        // else{
        //     System.out.println("The value is not present in the array");

        // }

//Question3:Calculate the average marks from an array containing marks of all students
//in physics using for each loop:
        // float [] marks = {45.7f,67.8f,63.4f,99.3f,100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;

        // }
        // System.out.println("The value of sum is:"+sum/marks.length);

//Question4:Create a java program to add two matrices:
        // int [][] mat1 = { {1,2,3},
        //                    {4,5,6}};
        // int [][] mat2 = { {2,6,13},
        //                    {3,7,1}};
        // int [][] result = { {0,0,0},
        //                     {0,0,0}};

        // for (int i=0;i<mat1.length;i++){ //row number of times
        //     for(int j=0;j<mat1[i].length;j++){ // column number of time
        //         System.out.format("Setting value of i=%d and j=%d\n",i,j);
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }

        //printing element of 2d array
        // for (int i=0;i<mat1.length;i++){ //row number of times
        //     for(int j=0;j<mat1[i].length;j++){ // column number of time
        //         System.out.print(result[i][j] + " ");
        //         result[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        //     System.out.println("");
        // }

//Question5:Write a java program to reverse an array:
        // int [] arr = {1,2,3,4,5,6};
        // int l = arr.length;
        // int n = Math.floorDiv(l,2);
        // int temp;
        // for(int i=0;i<n;i++){
        //         //Swap a[i] and a[l-1-i]
        //         // a b temp
        //         //  |4| |3| ||
        //         temp = arr[i];
        //         arr[i] = arr[l-i-1];
        //         arr[l-i-1] = temp;
                
        // }
        // for(int element: arr){
        //         System.out.print(element + " ");
        // }
//Question6:Write a java program to find the maximum element:
        // int [] arr = {1,21,3,455,5,34,67};
        // int max = 0;
        // for(int e:arr){
        //         if(e>max){
        //                 max = e;
        //         }
        // }
        // System.out.println("the maximum value of the maximum element is this array is:" + max);
//Question7:Write a java program to find the minimum element in a java array:
        boolean isSorted = true;
        int [] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                        isSorted = false;
                        break;
                }
                
        }
        if(isSorted){
                System.out.println("The array is sorted");
        }        
        else{
                System.out.println("The array is not sorted");
        }
        }
}
