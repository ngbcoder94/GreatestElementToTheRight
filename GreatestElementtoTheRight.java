/*
 * This is the class that I will use to solve the Leetcode problem. 
 *
 * Author: Nick Burkett
 * Date: 01/25/2025
 *
 * Status: WIP
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
                for(int i = (arr.length-1), i >= 0; i--){

                }
        }

        //Here is my main method that I will use for testing.
        public static void main(String[] args){
                System.out.println("Hello World");
        }
}
