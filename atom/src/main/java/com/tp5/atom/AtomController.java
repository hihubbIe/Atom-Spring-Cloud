package com.tp5.atom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("atoms")
public class AtomController {

    @Autowired
    private AtomRepository rep;

    @CrossOrigin(origins = "http://localhost:3000", methods = RequestMethod.GET)
    @GetMapping()
    public Iterable<Atom> findAll() {
        return this.rep.findAll();
    }

}
