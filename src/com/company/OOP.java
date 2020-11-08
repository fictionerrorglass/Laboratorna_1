package com.company;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author anastasialokajcuk
 * @version 1.0
 */
public class OOP
{
    private int first, second;
    void InformationReading()
    {

        System.out.print("Give me didgits ");
        Scanner scanner = new Scanner(System.in);
        first = scanner.nextInt();
        second = scanner.nextInt();
    }
    int[] FormRange()
    {
        int kilkist = second - first + 1;
        int[] range = new int[kilkist+1];
        range[0]=kilkist;
        range[1]=first;
        for (int i = 2; i < kilkist+1; i++)
        {
            range[i] = first + i - 1;
        }
        /**
         * @return range : повертає сформований проміжок
         */
        return range;
    }

    void Wuw(int range[])
    {
        /**
         * @param range[]: приймає цілочисловий масив
         */

        if ((range[1] & 1) == 0)
        {
            for (int i = 1; i < range[0]+1;i+=2)
            {
                System.out.print( range[i] + " " );
            }
        }
        else
        {
            for (int i = 2; i < range[0] + 1; i += 2)
            {
                System.out.print(range[i] + " ");
            }
        }
        if((range[range[0]]&1)==1)
            for(int i = range[0]; i > 0; i-=2)
            {
                System.out.print(range[i]+ " ");
            }
        else
            for(int i = range[0]-1; i > 0; i-=2)
            {
                System.out.print(range[i] + " " );
            }
    }

    ArrayList Fibbonachi()
    {
        int scankilkist;
        ArrayList range2 = new ArrayList();
        range2.add(first);
        range2.add(second);
        System.out.println("\nGive me kilkist ");
        Scanner scanner = new Scanner(System.in);
        scankilkist=scanner.nextInt();
        int last, prelast, newelement;
        last = second;
        prelast = first;
        for (int i = 0; i < scankilkist; i++)
        {
            newelement = last + prelast;
            range2.add(0, ((int) (range2.get(1)) - (int) (range2.get(0))));
            range2.add(newelement);
            prelast = last;
            last = newelement;
        }
        for(int i=0;i<range2.size();i++)
        {
            System.out.print(" " + range2.get(i));
        }
        return  range2;

    }
    void PersentageOfFibbonachi(ArrayList range2)
    {
        /**
         * @param range2 : приймає список
         */
        double odd = 0, even = 0;
        double percentofodd, percentofeven;

        for (int i = 0; i < range2.size(); i++)
        {
            if (((int) (range2.get(i)) & 1) == 1)
            {
                odd++;

            }
        }
        percentofodd = odd / range2.size();
        percentofeven = 1 - percentofodd;
        System.out.print("\nPercentofeven - "+ percentofeven*100 + " persentofodd - " + percentofodd*100);
    }

}


