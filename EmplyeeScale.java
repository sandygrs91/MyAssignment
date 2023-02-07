public class EmplyeeScale {
    public static void main(String[] args) {
        Salary salary1 = new Salary();
        Salary salary2 = new Salary();

        salary1.scaleOfsalary(5000,7000,9000);
        salary2.scaleOfsalary(6000,6000,9000);

        salary1.MeasureSalary();
        salary2.MeasureSalary();


    }
}
     class Salary

     { float baseSalary;
      float  mediumSalary;
     float highsalary;

     void scaleOfsalary(float x, float y, float z)
         {baseSalary= x;
         mediumSalary = y;
         highsalary = z;}



         void MeasureSalary() {
             if (baseSalary > mediumSalary && mediumSalary > highsalary) {
                 System.out.println("Base Salary will be " + baseSalary);

             }
             else if (mediumSalary>baseSalary && mediumSalary>highsalary)
             {
                 System.out.println("Medium salary will be "+mediumSalary);

             }
             else if (highsalary> baseSalary && highsalary> baseSalary)
             {
                 System.out.println(" Highest salary will be"+highsalary);
             }
             else {
                 System.out.println( "salary can be equal");}
         }

     }
