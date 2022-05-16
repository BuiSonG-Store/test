package com.example.example.Controller;


import com.example.example.Entity.District;
import com.example.example.Service.DistrictService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/v1/districts")
public class DistrictController {
    final
    DistrictService districtService;

    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<District>> findAll() {
        return ResponseEntity.ok(districtService.findAll());
    }
}
