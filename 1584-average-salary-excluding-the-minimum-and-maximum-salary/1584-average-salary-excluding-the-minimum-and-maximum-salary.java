class Solution {
    public double average(int[] salary) {
            int min = Arrays.stream(salary).min().getAsInt();
            int max = Arrays.stream(salary).max().getAsInt();

            double average = 0;

            for(int i =0 ; i < salary.length; i++){

                if(salary[i] == max || salary[i] == min) continue;

                else{
                    average += salary[i];
                }
            }

            return average / (salary.length - 2);
    }
}