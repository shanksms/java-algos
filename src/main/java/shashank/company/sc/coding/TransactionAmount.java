package shashank.company.sc.coding;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TransactionAmount {

  public static void main(String[] args) throws IOException {
    Stream<String> empStream = Files.lines(Paths.get("src/main/resources/sc/emp.txt"));
    Map<Integer, String> map1 = empStream.map(e -> {
                                String [] line = e.split(",");
                                return new Employee(Integer.parseInt(line[0]), line[1]);
                              }).collect(Collectors.toMap(e -> e.getEmpId(), e -> e.getName()));
    Stream<String> transactionStream = Files.lines(Paths.get("src/main/resources/sc/transactions.txt"));
    Map<Integer, Integer> map2 =
    transactionStream.parallel().map(e -> {
      String[] line = e.split(",");
      return new Transaction(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]));
    }).collect(Collectors.groupingBy(Transaction::getEmpId, Collectors.summingInt(Transaction::getTransactionAmount)));

    //print the emp name and transaction amount
    for (Map.Entry<Integer, String> entry : map1.entrySet()) {
      System.out.print(entry.getValue() + " ");
      System.out.print(map2.get(entry.getKey()));
      System.out.println();

    }

  }





}
