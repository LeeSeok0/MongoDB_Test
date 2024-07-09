package com.example.documentdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class TestService {

    @Autowired
    private TestEntityRepository testEntityRepository;

    public void insertEntity(int count) {
        Random random = new Random();
        System.out.println();

        for (int i = 0; i < count; i++) {
            TestEntity entity = new TestEntity(
                    random.nextFloat() * 100,  // v_a
                    random.nextFloat() * 100,  // i_a
                    random.nextFloat() * 100,  // kw_a
                    random.nextFloat() * 100,  // kvar_a
                    random.nextFloat() * 100,  // kva_a
                    random.nextFloat() * 100,  // pf_a
                    random.nextFloat() * 100,  // kwh_a
                    random.nextFloat() * 100,  // kvarh_a
                    random.nextFloat() * 100,  // kvah_a
                    random.nextFloat() * 100,  // v_b
                    random.nextFloat() * 100,  // i_b
                    random.nextFloat() * 100,  // kw_b
                    random.nextFloat() * 100,  // kvar_b
                    random.nextFloat() * 100,  // kva_b
                    random.nextFloat() * 100,  // pf_b
                    random.nextFloat() * 100,  // kwh_b
                    random.nextFloat() * 100,  // kvarh_b
                    random.nextFloat() * 100,  // kvah_b
                    random.nextFloat() * 100,  // v_c
                    random.nextFloat() * 100,  // i_c
                    random.nextFloat() * 100,  // kw_c
                    random.nextFloat() * 100,  // kvar_c
                    random.nextFloat() * 100,  // kva_c
                    random.nextFloat() * 100,  // pf_c
                    random.nextFloat() * 100,  // kwh_c
                    random.nextFloat() * 100,  // kvarh_c
                    random.nextFloat() * 100,  // kvah_c
                    random.nextFloat() * 100,  // v_avg
                    random.nextFloat() * 100,  // i_avg
                    random.nextFloat() * 100,  // kw_tot
                    random.nextFloat() * 100,  // kvar_tot
                    random.nextFloat() * 100,  // kva_tot
                    random.nextFloat() * 100,  // pf_tot
                    random.nextFloat() * 100,  // kwh_tot
                    random.nextFloat() * 100,  // kvarh_tot
                    random.nextFloat() * 100,  // kvah_tot
                    random.nextFloat() * 100,  // freq_a
                    random.nextFloat() * 100,  // freq_b
                    random.nextFloat() * 100,  // freq_c
                    random.nextFloat() * 100,  // freq_max
                    random.nextFloat() * 100,  // vthd
                    random.nextFloat() * 100,  // ithd
                    random.nextFloat() * 100,  // bi_positive_kwh
                    random.nextFloat() * 100,  // bi_negative_kwh
                    random.nextFloat() * 100,  // bi_net_kwh
                    random.nextFloat() * 100   // bi_total_kwh
            );

            testEntityRepository.save(entity);
        }
    }
    public void selectEntity() {
    }
}
