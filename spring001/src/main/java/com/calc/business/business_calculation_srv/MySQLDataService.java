package com.calc.business.business_calculation_srv;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

    public int[] retrieveData(){
        return new int[] {1, 2, 3, 4, 5};
    }
}
