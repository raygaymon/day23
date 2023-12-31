package sg.nus.edu.iss.day23.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    
    private int id;
    private String first_name;
    private String last_name;
}
