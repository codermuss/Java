package hrmsSystem.hrms.api.controllers;

import hrmsSystem.hrms.business.abstracts.PositionService;
import hrmsSystem.hrms.core.utilities.results.DataResult;
import hrmsSystem.hrms.core.utilities.results.Result;
import hrmsSystem.hrms.core.utilities.results.SuccessDataResult;
import hrmsSystem.hrms.core.utilities.results.SuccessResult;
import hrmsSystem.hrms.entities.concretes.ActivePositions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/positions")
@CrossOrigin
public class PositionsController {
    private PositionService positionService;

    @Autowired
    public PositionsController(PositionService positionService){
        this.positionService=positionService;
    }

    @GetMapping("/getall")
    public DataResult<List<ActivePositions>> getAll(){
        return this.positionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody ActivePositions activePositions){
        return this.positionService.add(activePositions);
    }

}
