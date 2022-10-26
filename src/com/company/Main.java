package com.company;

public class Main
{
    // Insertion sort
    public static void main(String[] args)
    {
	    int[] data = {9, 7, 2, 11};

        for (int i = 1; i < data.length; i++)
        {
            int val = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > val)
            {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = val;
        }
        for (int d: data)
            System.out.print(d + " ");
    }
}
