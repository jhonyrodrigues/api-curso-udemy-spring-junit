package br.com.udemy.api.resources;

import br.com.udemy.api.domain.dto.UserDto;
import br.com.udemy.api.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("user")
public class UserResource {

    @Autowired
    private UserService service;
    @Autowired
    private ModelMapper mapper;

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable Integer id) {

        return ResponseEntity.ok().body(mapper.map(service.findById(id), UserDto.class));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> findAll() {
        return ResponseEntity.ok().body(service.findAll()
                .stream().map(list -> mapper.map(list, UserDto.class)).collect(Collectors.toList()));
    }

    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto obj) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(service.create(obj).getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<UserDto> update(@PathVariable Integer id, @RequestBody UserDto obj) {
        obj.setId(id);
        return ResponseEntity.ok().body(mapper.map(service.update(obj), UserDto.class));
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<UserDto> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
