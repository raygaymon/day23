package sg.nus.edu.iss.day23.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    
    private int id;
    private int customerID;
    private Date loan_date;
    private Date return_date;
}
