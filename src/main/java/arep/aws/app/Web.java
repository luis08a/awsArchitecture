package arep.aws.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * App
 */
@RestController
public class Web {
    @Autowired
    CustomRepository cr;

    @GetMapping()
    public ResponseEntity<?> getHome() {
        return new ResponseEntity(null, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<?> home() {
        return new ResponseEntity(null, HttpStatus.OK);
    }
}