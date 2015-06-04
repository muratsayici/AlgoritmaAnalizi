using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace final_sorusu_6
{
    class Program
    {
        public static void myfonk(int []a) {
            int sayac = 0;
            int size = a.Length;
            int sayi = 0 ;
            int[] b = new int[size] ;
            for (int i = 0; i < size; i++)
            {
                if(a[i] == 0){
                    for (int j = i; j < size; j++)
                    {
                        if (a[j] == 0)
                        {
                            sayac++;
                        }
                        else {
                            b[sayi] = sayac;
                            sayac = 0;
                            sayi++;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < size; i++)
            {
                Console.WriteLine(b[i]);
            }
            Console.ReadLine();
        }

        static void Main(string[] args)
        {
            int[] a = { 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1};
            myfonk(a);
            
        }
    }
}
