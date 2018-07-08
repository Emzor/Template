package home.mf.testing.template.lombok;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
public class Mountain {

    private String name;
    private Integer altitutde;
    private String country;
}
