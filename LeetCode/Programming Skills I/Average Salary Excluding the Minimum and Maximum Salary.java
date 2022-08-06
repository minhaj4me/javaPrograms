class Solution {
    public double average(int[] salary) {
        int minSalary = salary[0];
        int maxSalary = salary[0];
        double sum = 0.0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];

            }
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
        }

        // System.out.println (minSalary);
        // System.out.println (maxSalary);
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] != minSalary && salary[i] != maxSalary) {
                System.out.println(salary[i]);
                sum = sum + salary[i];
            }

        }
        return sum / (salary.length - 2);

    }
}