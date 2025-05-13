package com.calc.business.business_calculation_srv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
public class BusinessCalculationService {
    @Autowired
    DataService dataService;

    public int findMax(){
        return Arrays.stream(dataService.retrieveData())
                .max()
                .orElse(0);
    }
}
