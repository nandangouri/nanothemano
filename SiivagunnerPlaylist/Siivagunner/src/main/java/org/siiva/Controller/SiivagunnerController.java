package org.siiva.Controller;

import org.siiva.Model.Result;
import org.siiva.Model.Siivagunner;
import org.siiva.Service.SiivagunnerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/siivagunner")
public class SiivagunnerController {

    private SiivagunnerService service;

    public  SiivagunnerController(SiivagunnerService service) {
    this.service = service;

    }

    @PostMapping
    public ResponseEntity<Object> add(@RequestBody Siivagunner siivagunner){
        Result<Siivagunner> result = service.add(siivagunner);
        if(result.isSuccess()){
            return new ResponseEntity<>(result.getPayload(), HttpStatus.CREATED);
        }
        return ErrorResponse.build(result);
    }


}
