class Main {
  public static void main(String[] args) {
    int[] list0 = { 2, 5, 16, 18, 21 };

      // Display all even elements of array
      System.out.println("The even numbers of array:");

      for (int i = 0; i < list0.length; i++)
      {
         if (list0[i] % 2 == 0)
         {
            System.out.print(list0[i] + " ");
         }
      }

      System.out.println();



      final int SIZE = 10;    // Size of the array

      // Create an array.
      int[] list = new int[SIZE];

      // Fill array with random values
      for (int i = 0; i < list.length; i++)
      {
         list[i] = (int) (Math.random() * 100);
      }

      int max = 0;    // hold index number of largest number

      // Finding largest value.
      for (int i = 0; i < list.length; i++)
      {
         if (list[i] > list[max])
         {
            max = i;
         }
      }

      // Show all elements of array
      System.out.print("Elements are : ");

      for (int i = 0; i < list.length; i++)
      {
         System.out.print(list[i] + " ");
      }

      System.out.println();

      // Show largest value of array
      System.out.println("Largest value is " + list[max]);
  }
}