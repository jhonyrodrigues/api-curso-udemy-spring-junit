package br.com.udemy.api.resources;

import br.com.udemy.api.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserResource {

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id) {
        return ResponseEntity.ok().body(new User(1, "Jhony", "jhony.o_rodrigues@hotmail.com", "123"));
    }
}
