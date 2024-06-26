package Array;

public class StockProfit {
    
    public static int stockProfit(int arr[]) {

        // MY APPROACH 
        // int minPrice = arr[0], maxPrice = arr[0], profit = 0;

        // for(int i=1; i<arr.length; i++) {

        //     if(minPrice > arr[i]) {
        //         minPrice = arr[i];
        //         maxPrice = arr[i];
        //     }else if(maxPrice < arr[i]) {
        //         maxPrice = arr[i];
        //         profit = Math.max(profit, (maxPrice - minPrice));
        //     }
        // } 

        // return profit;

        int buyPrice = Integer.MAX_VALUE, maxProfit = 0;

        for(int i=0; i<arr.length; i++) {
            if(buyPrice < arr[i]) {
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = arr[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 8};

        System.out.println("Max profit will be: " + stockProfit(prices));
    }
}
