package com.example.documentdb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;


@Service
public class TestService {

    @Autowired
    private TestEntityRepository testEntityRepository;
    private static final Logger logger = LoggerFactory.getLogger(TestService.class);

    public void insertMany(int count) {
        try{
            Random random = new Random();
            LocalDateTime currentTime = LocalDateTime.now();
            long startTime = System.currentTimeMillis(); // milliseconds 단위
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
                        random.nextFloat() * 100,   // bi_total_kwh
                        "",
                        null
                );
                testEntityRepository.insert(entity);
                //Thread.sleep(1);
                int num = 1000000;
                if(i == num || i == num*2 || i == num*3 || i == num*4
                          || i == num*5 || i == num*6 || i == num*7
                          || i == num*8 || i == num*9 ){
                    System.out.println("inserted..........."+i);
                    System.out.println(LocalDateTime.now());
                }
//                long endTime = System.currentTimeMillis();
//                long total = endTime - startTime;
//                System.out.println("milli seconds : " +  total);
            }
            long endTime = System.currentTimeMillis();
            long total = endTime - startTime;
            System.out.println("finish!! : " + total );

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void insertEntity(int count) {
        Random random = new Random();
        LocalDateTime currentTime = LocalDateTime.now();
        long startTime = System.currentTimeMillis(); // milliseconds 단위
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
                    random.nextFloat() * 100,   // bi_total_kwh
                    "test",
                    LocalDateTime.of(2024, 8, 7, 12, 0,i)
            );
            testEntityRepository.save(entity);
        }
            long endTime = System.currentTimeMillis();
            long total = endTime - startTime;
        System.out.println("milli seconds total : " + total );

    }

    public void selectEntity() {
        long startTime = System.currentTimeMillis(); // milliseconds 단위
        LocalDateTime startDateTime = LocalDateTime.of(2024,8,7,12,0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2024,8,7,12,1,0);
        List<TestEntity> selectResults = testEntityRepository.findAllByDateTimeRange(startDateTime,endDateTime);
        long endTime = System.currentTimeMillis();
        long total = endTime - startTime;
        System.out.println("milli seconds : " +  total);
        System.out.println("selectResults : " + selectResults.size());
    }

    public void deleteEntity(){
        long startTime = System.currentTimeMillis();
        LocalDateTime startDateTime = LocalDateTime.of(2024,8,7,12,0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2024,8,7,12,1,0);
        testEntityRepository.deleteAllByDateTime(startDateTime,endDateTime);
        long endTime = System.currentTimeMillis();
        long total = endTime - startTime;
        System.out.println("delete complete.....");
        System.out.println("milli seconds : " +  total);
    }


}
