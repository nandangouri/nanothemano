package org.siiva.Service;

import org.siiva.Model.Result;
import org.siiva.Model.ResultType;
import org.siiva.Model.Siivagunner;
import org.siiva.data.SiivagunnerRepository;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

@Service
public class SiivagunnerService {

    private final SiivagunnerRepository Siivagunnerrepository;


    public SiivagunnerService(SiivagunnerRepository repository) {
        this.Siivagunnerrepository = repository;
    }

    public Result<Siivagunner> add(Siivagunner siivagunner) {
        Result<Siivagunner> result = checker(siivagunner);
        if (result.isSuccess()) {
            Siivagunner rev = Siivagunnerrepository.add(siivagunner);
            if(rev == null) {
                result.addMessage("WTF?? this song could not be added.", ResultType.INVALID);
            } else {
                result.setPayload(rev);
            }
        }
            return result;
    }

    public Result<String> updateNew(siivag)

    public Result<Siivagunner> checker(Siivagunner siivagunner) {
        Result<Siivagunner> result = new Result<>();
        if (siivagunner == null) {
            result.addMessage("Siivagunner cannot be empty.", ResultType.INVALID);
            return result;
        }
        try (ValidatorFactory factory = Validation.buildDefaultValidatorFactory()){
            Validator validator = factory.getValidator();
            Set<ConstraintViolation<Siivagunner>> validation = validator.validate(siivagunner);

            validation.forEach(v -> result.addMessage(v.getMessage(), ResultType.INVALID));
        }
        return result;
    }

}
