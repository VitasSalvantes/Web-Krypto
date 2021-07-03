package com.vitassalvantes.webkrypto.repo;

import com.vitassalvantes.webkrypto.models.Cipher;
import org.springframework.data.repository.CrudRepository;

/**
 * Repository for the cipher model
 *
 * @author VitasSalvantes
 * @version 1.0
 */
public interface CipherRepository extends CrudRepository<Cipher, Long> {
    Cipher findCipherByName(String name);
}