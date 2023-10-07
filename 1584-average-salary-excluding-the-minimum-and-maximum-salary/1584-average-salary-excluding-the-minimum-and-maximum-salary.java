class Solution {
    public double average(int[] salary) {
            // int min = Arrays.stream(salary).min().getAsInt();
            // int max = Arrays.stream(salary).max().getAsInt();

            Arrays.sort(salary);


            double average = 0;

            for(int i =1 ; i < salary.length -1; i++){

                // if(salary[i] == max || salary[i] == min) continue;

                // else{
                //     average += salary[i];
                // }
                average += salary[i];
            }

            return average / (salary.length - 2);
    }
}