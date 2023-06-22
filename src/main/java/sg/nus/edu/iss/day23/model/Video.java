package sg.nus.edu.iss.day23.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    
    private int id;
    private String title;
    private String synopsis;
    private int available_count;
}
