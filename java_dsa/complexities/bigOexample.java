package complexities;

//dsa main goal is to solve problem effectively and efficiently
//to determine the effieiency of a program ,we look at two type of complexities
//time complexity
//space complexity

//asympotic notation-to compare the efficiencies of algorithmstypes-bigO(O)-worst,omega()-best,theta()-avg
//lets see bigO
public class bigOexample {

    //constant time O(1)

    // no matter the size of input the array asscesing any element takes a constant time

    //eample
    //accessing a specific elemnt in an array by index

    public static void main(String[] args) {
        int array[] = {
            4,5,6,7,3
    };

        System.out.println(array[0]);



        //O(n)-linear time

//the time grows directly praportional to the size of the input

//example= traversing an array of size

    int a[] = {
            4,5,6,7,3
    };

    for(int i=0 ; i<a.length;i++){
        System.out.println(a[i]);
    }


    //O(n^2)-quadratic time
        //as the input grows the time taken increases quadratically

        //bubble sort or checking all pair in an array


    //O(log n )-logarithmic time
        //the algorithm cuts the problem size in half with each step ,so the time grows logarithmiclly

        //binary search

        //O(nlog n ) - linearithmic time
        // the algorithm divides the input into subproblems and process each subproblem linerly

        //example marge sort and quick sort

        //O(2^n)-exponential time complextity '
        //the time grows exponential with the size of the input ,meaning it double with each input size

        //example-fibonacci series

        //O(n!)-factorial time complexity

        //factorial time complexity occous in algorithms that involve generating all possible permutation

        //example -brute force solution for the traveling salesman problem


        //examples
    }
    void print (){
        System.out.println("hello");
        int a =4;
        int b = 10;
        System.out.println("sum "+a+b);

    }
    //ab iski complexity O(1) hogi
    //kyuki yaha 2 hi statement run hoge kitna bhi input hum dede
    //complexity =O(1)

    //example 2
    int sumaaray(int[] arr){
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    //so basically yaha loop chl raha h aagr hum 5 element ka aaray denge toh ye loop 5 bar chalega
    //or aagr 10 ka denge toh loop 10 bar chalega
    //so ye ek linear complexity h

    //complexity = O(n) hogi

}