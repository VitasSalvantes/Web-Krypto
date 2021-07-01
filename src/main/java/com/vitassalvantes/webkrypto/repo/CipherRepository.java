package com.vitassalvantes.webkrypto.repo;

import com.vitassalvantes.webkrypto.models.Cipher;
import org.springframework.data.repository.CrudRepository;

public interface CipherRepository extends CrudRepository<Cipher, Long> {
    Cipher findCipherByName(String name);

    boolean existsByName(String name);
}