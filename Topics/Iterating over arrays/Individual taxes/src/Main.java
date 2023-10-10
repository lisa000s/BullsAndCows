import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nbrCo = scanner.nextInt();
        //System.out.println(nbrCo);
        double[] incomes = new double[nbrCo];
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(incomes));
        double[] taxes = new double[nbrCo];
        for (int i = 0; i < taxes.length; i++) {
            taxes[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(taxes));
        double coMaxTaxes = 0;
        int coMax = 0;
        double temp = 0;
        for (int i = 0; i < nbrCo; i++) {
            temp = incomes[i] * taxes[i] / 100;
            if (temp > coMaxTaxes) {
                coMaxTaxes = temp;
                coMax = i + 1;
            }
        }
        System.out.println(coMax);
    }
}