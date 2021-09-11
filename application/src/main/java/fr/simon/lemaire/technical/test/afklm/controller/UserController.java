package fr.simon.lemaire.technical.test.afklm.controller;

import fr.simon.lemaire.technical.test.afklm.service.UserServiceInterface;
import fr.simon.lemaire.technical.test.afklm.json.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceInterface  userService;

    @GetMapping("/{id}")
    public User read(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user)
            throws URISyntaxException {

        if (user == null) {
            return ResponseEntity.notFound().build();
        } else {
            URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                    .path("/{id}")
                    .buildAndExpand(userService.save(user).getId())
                    .toUri();

            return ResponseEntity.created(uri)
                    .body(user);
        }
    }

}
