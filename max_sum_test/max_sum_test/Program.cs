using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace max_sum_test
{
    class Program
    {
        private static int seqStart = 0;
        private static int seqEnd = -1;
        public static int sayac = 0;
        public static ArrayList liste = new ArrayList();
        public static ArrayList liste2 = new ArrayList();

        public static int MaxSubSum1(int[] a)
        {
            int maxSum = 0;
            int i, j, k = 0;
            for (i = 0; i < a.Length; i++)
            {
                for (j = i; j < a.Length; j++)
                {
                    int thisSum = 0;
                    for (k = i; k <= j; k++)
                    {
                        thisSum += a[k];
                        //liste.Clear();

                        if (thisSum > maxSum)
                        {
                            for (int l = 0; l < k+1; l++)
                            {
                                liste.Add(a[l]);
                            }
                            
                            maxSum = thisSum;
                            seqStart = i;
                            seqEnd = j;
                        }
                        sayac++;
                        liste2.Add(k);

                    }
                }
            }
            return maxSum;
        }
        static void Main(string[] args)
        {
            //int []dizi={4,-3,5,-2,-1,2,6,-2};
            int[] dizi = { 4, -3, 5, -2, -1, 2, 6, -2 };
            int a=MaxSubSum1(dizi);
            Console.WriteLine(a);
            Console.WriteLine(seqStart);
            Console.WriteLine(seqEnd);
            for (int i =seqStart ; i <= seqEnd; i++)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine("***************");

            for (int i = 0; i < liste.Count; i++)
            {
                Console.WriteLine(liste[i]);
            }
            Console.WriteLine("----------------------");
            for (int i = 0; i < liste2.Count; i++)
            {
                Console.WriteLine(liste2[i]);
            }
            Console.WriteLine(sayac);
            Console.Read();
        }

        public static int MaxSubSum3(int[] a)
        {
            int maxSum = 0;
            int thisSum = 0;
            for (int i = 0, j = 0; j < a.Length; j++)
            {
                thisSum += a[j];

                if (thisSum > maxSum)
                {
                    maxSum = thisSum;
                    seqStart = i;
                    seqEnd = j;
                    liste.Add(i);

                }
                else if (thisSum < 0)
                {
                    i = j + 1;
                    thisSum = 0;
                    liste.Clear();
                }
            }

            return maxSum;
        }
    }
}
