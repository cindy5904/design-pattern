package org.example.ExercicePatternStrategie;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class System {
    private String destination;

    public void navigate(NavigationStrategie navigationStrategie) {
        navigationStrategie.navigate(destination);
    }
}
