class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] bal = new int[3];
        for(int i = 0; i<3; i++){
            bal[i] = 0;
        }//filling bal array with 0s

        for(int i = 0; i<bills.length; i++){
            if(bills[i] == 5){
                bal[0]++;
            }else if(bills[i] == 10){
                if(bal[0] >= 1){
                    bal[0]--;
                    bal[1]++;
                }else{
                    return false;
                }
            }else if(bills[i] == 20){
                if(bal[0] >= 1 && bal[1]>=1){
                    bal[0]--;
                    bal[1]--;
                    bal[2]++;
                }else if(bal[0]>=3){
                    bal[0] -= 3; 
                    bal[2]++;  
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}