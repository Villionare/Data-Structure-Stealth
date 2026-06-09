package NQT.Questions;

public class PrimeNumbersSum48 {
    static void main() {

        int n = 20;
        int sum = 0;

        for (int i=1;i<=n;i++){
           if (checkPrime(i)){
                sum += i;
            }
        }

        System.out.println(sum);
    }

    private static boolean checkPrime(int n){
        //1 is not a prime no.
        if (n<=1){
            return false;
        }

      for (int i=2; i<=n/2; i++){
          if (n%i == 0){
              return false;
          }
      }
      return true;
    };
}
