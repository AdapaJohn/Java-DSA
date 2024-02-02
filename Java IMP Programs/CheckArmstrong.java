//3 digits of numbers
public class CheckArmstrong {

    public static void main(String[] args) {

        int number = 153, originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
} 


//n number of digits
// public class CheckArmstrong {

//     public static void main(String[] args) {

//         int number = 9800817, originalNumber, remainder, result = 0, n = 0;

//         originalNumber = number;

//         for (;originalNumber != 0; originalNumber /= 10, ++n);

//         originalNumber = number;

//         for (;originalNumber != 0; originalNumber /= 10)
//         {
//             remainder = originalNumber % 10;
//             result += Math.pow(remainder, n);
//         }

//         if(result == number)
//             System.out.println(number + " is an Armstrong number.");
//         else
//             System.out.println(number + " is not an Armstrong number.");
//     }
// }
// The first few Armstrong numbers between 0 to 999 are 1, 2, 3, 4, 5, 6, 7, 8,
// 9, 153, 370, 371, 407. Some other Armstrong numbers are 1634, 8208, 9474,
// 54748, 92727, 93084, 548834, 1741725, 4210818, 9800817, 9926315, 24678050,
// 24678051, 88593477, 146511208, 472335975, 534494836, 912985153, 4679307774,
// 32164049650, 32164049651.

