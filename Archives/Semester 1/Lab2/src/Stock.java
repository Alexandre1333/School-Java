public class Stock {
    public static void main(String[] args) {

        final int NUM_SHARES = 1000;            // # of shares
        final double PURCHASE_PRICE = 32.87;    // Purchase price per share
        final double SELLING_PRICE = 33.92;     // Selling price per share
        final double BROKER_COM_RATE = 0.02;    // Broker commission rate

        // Cost of stock without commission
        double stockPurchase = NUM_SHARES * PURCHASE_PRICE;

        // Brokers commission on the purchase
        double purchaseComm = stockPurchase * BROKER_COM_RATE;

        // Calculate total paid for stock, plus, broker commission
        double amountPaid = stockPurchase + purchaseComm;

        // Calculate amount sold
        double stockSale = NUM_SHARES * SELLING_PRICE;

        // Calculate broker commission on sale
        double sellingComm = stockSale  * BROKER_COM_RATE;

        // Calculate the total received after selling stock and paying broker fees
        double amountReceived = stockSale - sellingComm;

        // Calculate amount of profit or loss
        double profitOrLoss = amountReceived - amountPaid;

        // Results to be printed
        System.out.printf("Joe paid $%,.2f for the stock. \n", stockPurchase);
        System.out.printf("Joe paid his broker a commission of $%,.2f on" + " the purchase. \n", purchaseComm);
        System.out.printf("So, Joe paid a total of $%,.2f\n", amountPaid);
        System.out.printf("Joe sold the stock for $%,.2f\n", stockSale);
        System.out.printf("Joe paid his broker a commission of $%,.2f on" + " the sale. \n", sellingComm);
        System.out.printf("So, Joe received a total of $%,.2f\n", amountReceived);
        System.out.printf("\nJoe's profit or loss: $%,.2f\n", profitOrLoss);
    }


}
