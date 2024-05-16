public class Richest {
    public static void main(String[] args) {
    int [][] num = {{11,21},{1,2}};
        System.out.println(richestCustomer(num));
    }
    static int richestCustomer(int[][] accounts){
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currWealth += accounts[i][j];
                if(currWealth > maxWealth){
                    maxWealth = currWealth;
                }
            }
        }
        return maxWealth;
    }
}
