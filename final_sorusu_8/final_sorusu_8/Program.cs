using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace final_sorusu_8
{
    class Program
    {
        public static void myfonk() {
            Console.WriteLine("kaç eleman gireceksiniz");
            int size = 0;
            size=Convert.ToInt32(Console.ReadLine());
            int[] a=new int[size];
            for (int i = 0; i < size; i++)
            {
                //Random Rastgele = new Random();
                //a[i] = Rastgele.Next(1, 101);
                a[i] = Convert.ToInt32(Console.ReadLine());
            }
            for (int i =size-1; i >= 0 ; i--)
            {
                Console.WriteLine(a[i]);
            }
            Console.ReadLine();

        
        }
        static void Main(string[] args)
        {
            myfonk();
        }
    }
}
