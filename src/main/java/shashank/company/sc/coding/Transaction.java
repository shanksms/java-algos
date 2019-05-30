package shashank.company.sc.coding;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class Transaction {
  private int empId;
  private int transactionId;
  private int transactionAmount;

}
