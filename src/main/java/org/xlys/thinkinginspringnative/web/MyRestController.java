package org.xlys.thinkinginspringnative.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.xlys.thinkinginspringnative.pojo.User;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@RequestMapping("/users")
public class MyRestController {

    @GetMapping("/{userId}")
    public Mono<User> getUser(@PathVariable("userId") Integer userId) {
        return Mono.just(new User(1,"Michael",27));
    }

    @DeleteMapping("/delete/{userId}")
    public Mono<Void> deleteUser(@PathVariable("userId") Integer userId) {
        log.info("user of {} deleted!",userId);
        return Mono.empty();
    }
}
