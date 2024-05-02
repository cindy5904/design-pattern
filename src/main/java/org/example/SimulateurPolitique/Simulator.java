package org.example.SimulateurPolitique;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Simulator {
    private double income;

    public void calculatax(TaskStrategy taskStrategy, double income){
        taskStrategy.calculateTax(income);
    }
}
