package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.CityService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.entities.concretes.Cities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/city")
@RestController
public class CityController {
    private CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @RequestMapping("/cityList")
    public DataResult<List<Cities>> getAll(){
        return this.cityService.getAll();
    }

}
