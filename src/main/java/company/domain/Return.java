package company.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Return {
    private  Employee employee;
    private LocalDate localDate;
    private Reservation reservation;
    private  double extraCost;
    private  String additinalInfo;
}
