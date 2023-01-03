package com.tp5.atom;

import org.springframework.data.repository.CrudRepository;

public interface AtomRepository extends CrudRepository<Atom, String> {
    Iterable<Atom> findAll();

    Atom findBySymbol(String symbol);

    void saveAtom(Atom atom);

    void updateOne(Atom atom);

    void deleteBySymbol(String symbol);
}
