package com.example.project.service.interfaces;

import com.example.project.model.Block;
import com.example.project.model.Fee;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface FeeService {

    List<Fee> getAllFees();

    Fee getFee(Integer id);

    void addFee(@RequestBody Fee fee);

    Fee updateFee(@RequestBody Fee fee );

    boolean deleteFee(Integer id);

    /*Fee getTotalFee(Integer water_bill ,Integer  gas_bill , Integer  electricity_bill , Integer dues);*/

}
