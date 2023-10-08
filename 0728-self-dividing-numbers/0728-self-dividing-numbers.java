class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();

        for(int i = left; i<= right; i++){

            if(checkSelfDividing(i)) list.add(i);

        }

        return list;
    }

    public boolean checkSelfDividing(int num){

        int original = num;

        while(num > 0){
            int digit = num % 10;

            if(digit == 0  || original % digit != 0 ) return false;

            num /= 10;
        }

        return true;
    }
}