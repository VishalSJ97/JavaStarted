package com.CH1;

/**
 * Accept basic salary via CLA* and calculate the following
 *      DA=20% of basic
 *      HRA=30% of basic
 *      Calculate gross salary GROSS=BASIC+DA+HRA
 *      Calculate the Income tax (IT) based on the following condition
 *      SAL RANGE                           IT
 *      -------------------------------------------------------------------
 *      Basic >0 and basic < 4000           4%
 *      Basic >=4000 and basic < 10000      6%
 *      Basic >=10000 and basic < 17000     8%
 *      Basic >=17000 and basic < 27000     10%
 *      Basic >=27000 onwards               15%
 */

public class Code3 {
    public static void main(String[] args) {
        double basicSalary = Double.parseDouble(args[0]);

        double DA = (20.0/100) * basicSalary;
        System.out.println("DA :: "+DA);

        double HRA = (30.0/100) * basicSalary;
        System.out.println("HRA :: "+HRA);

        double grossSalary = basicSalary + DA + HRA;
        System.out.println("Gross Salary :: "+grossSalary);

        double IT = 0;
        if(basicSalary > 0 && basicSalary < 4000)
            IT = (4.0/100) * basicSalary;
        else if(basicSalary >= 4000  && basicSalary < 10000)
            IT = (6.0/100) * basicSalary;
        else if(basicSalary >= 10000 && basicSalary < 17000)
            IT = (8.0/100) * basicSalary;
        else if(basicSalary >= 17000 && basicSalary < 27000)
            IT = (10.0/100) * basicSalary;
        else if(basicSalary >= 27000)
            IT = (15.0/100) * basicSalary;

        System.out.println("Income Tax is :: "+IT);
    }
}
