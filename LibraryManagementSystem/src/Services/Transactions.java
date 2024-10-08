package Services;
import Entity.*;
import java.util.ArrayList;

public class Transactions {
    private ArrayList<TransactionRecord> transactions;

    public Transactions() {
        transactions = new ArrayList<>();
    }


    public void recordBorrowTransaction(String memberId, String bookTitle) {
        TransactionRecord transaction = new TransactionRecord(memberId, bookTitle, "Borrow");
        transactions.add(transaction);
        transaction.displayTransaction();
    }

    public void recordReturnTransaction(String memberId, String bookTitle) {
        TransactionRecord transaction = new TransactionRecord(memberId, bookTitle, "Return");
        transactions.add(transaction);
        transaction.displayTransaction();
    }

 
    public void displayTransactions() {
        System.out.println("All Transactions:");
        for (TransactionRecord transaction : transactions) {
            transaction.displayTransaction();
        }
    }
}
