/*
 * This is the class that I will use to solve the Leetcode problem. 
 *
 * Author: Nick Burkett
 * Date: 01/25/2025
 *
 * Status: SOLVED.
 */
class GreatestElementToTheRight{
        
        /*
         * This will be the method used to solve the Leetcode problem.
         *
         * @param int[] arr - Array that's passed in which will contains the integers.
         * @return int[] arr - Return the array passed in but edited correctly.
         */
        public int[] replaceElements(int[] arr){
                
                //Check the edge case of arr.length = 1
                if(arr.length == 1){
                        arr[0] = -1;    //Update the only index to -1.
                        return arr;     //Return the array with only -1.
                }
                
                //Now I need to intialize a few helper variables.
                int max = 0;     //Create a helper variable to keep track of the largest int to the right.

                //Now I need to loop through the input array backwards.
                for(int i = (arr.length-1); i >= 0; i--){
                        
                        //Need to check if I am at the last index, which is what I start at.
                        if(i == (arr.length-1)){
                                max = arr[i];       //Set the max to the first index I come across.
                                arr[i] = -1;        //Update the last index to -1.
                        } 
                        else if(arr[i] > max){
                                //If I fall in here, there are a few things I need to do.
                                int tmpVar = arr[i];    //Save the current value of arr[i].
                                arr[i] = max;           //Update arr[i] to the max.
                                max = tmpVar;           //Update the max variable.

                        }
                        else{
                                //If I fall in here, just update the current value with the max to the right.
                                arr[i] = max;
                        }
                }

                return arr;     //Once I am done looping through the array, return the same array that was passed in/updated.
        }

        //Here is my main method that I will use for testing.
        public static void main(String[] args){
                
                //Need to create an instance of the class for testing.
                GreatestElementToTheRight tmpObj = new GreatestElementToTheRight();

                //Now I need to create some test data
                int[] tmpArr = {17, 18, 5, 4, 6, 1};

                tmpObj.replaceElements(tmpArr);  //Call my function on the test array

                //Now I need to print out my test array after passing it to replaceElements()
                for(int i: tmpArr){
                        System.out.println(i);
                }
        }
}
