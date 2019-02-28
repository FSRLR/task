package task1;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Interest {
    @Value("编程")
    private String study;
    @Value("看电影")
    private String play;
}
