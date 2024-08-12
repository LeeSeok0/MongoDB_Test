package com.example.documentdb;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "testCollection")
public class TestEntity {

    private float v_a;
    private float i_a;
    private float kw_a;
    private float kvar_a;
    private float kva_a;
    private float pf_a;
    private float kwh_a;
    private float kvarh_a;
    private float kvah_a;
    private float v_b;
    private float i_b;
    private float kw_b;
    private float kvar_b;
    private float kva_b;
    private float pf_b;
    private float kwh_b;
    private float kvarh_b;
    private float kvah_b;
    private float v_c;
    private float i_c;
    private float kw_c;
    private float kvar_c;
    private float kva_c;
    private float pf_c;
    private float kwh_c;
    private float kvarh_c;
    private float kvah_c;
    private float v_avg;
    private float i_avg;
    private float kw_tot;
    private float kvar_tot;
    private float kva_tot;
    private float pf_tot;
    private float kwh_tot;
    private float kvarh_tot;
    private float kvah_tot;
    private float freq_a;
    private float freq_b;
    private float freq_c;
    private float freq_max;
    private float vthd;
    private float ithd;
    private float bi_positive_kwh;
    private float bi_negative_kwh;
    private float bi_net_kwh;
    private float bi_total_kwh;
    private String testString;
    private LocalDateTime dateTime;

    public TestEntity(float v_a, float i_a, float kw_a, float kvar_a, float kva_a, float pf_a, float kwh_a,
                      float kvarh_a, float kvah_a, float v_b, float i_b, float kw_b, float kvar_b, float kva_b,
                      float pf_b, float kwh_b, float kvarh_b, float kvah_b, float v_c, float i_c, float kw_c,
                      float kvar_c, float kva_c, float pf_c, float kwh_c, float kvarh_c, float kvah_c, float v_avg,
                      float i_avg, float kw_tot, float kvar_tot, float kva_tot, float pf_tot, float kwh_tot,
                      float kvarh_tot, float kvah_tot, float freq_a, float freq_b, float freq_c, float freq_max,
                      float vthd, float ithd, float bi_positive_kwh, float bi_negative_kwh, float bi_net_kwh,
                      float bi_total_kwh,String testString,LocalDateTime dateTime){
        this.v_a = v_a;
        this.i_a = i_a;
        this.kw_a = kw_a;
        this.kvar_a = kvar_a;
        this.kva_a = kva_a;
        this.pf_a = pf_a;
        this.kwh_a = kwh_a;
        this.kvarh_a = kvarh_a;
        this.kvah_a = kvah_a;
        this.v_b = v_b;
        this.i_b = i_b;
        this.kw_b = kw_b;
        this.kvar_b = kvar_b;
        this.kva_b = kva_b;
        this.pf_b = pf_b;
        this.kwh_b = kwh_b;
        this.kvarh_b = kvarh_b;
        this.kvah_b = kvah_b;
        this.v_c = v_c;
        this.i_c = i_c;
        this.kw_c = kw_c;
        this.kvar_c = kvar_c;
        this.kva_c = kva_c;
        this.pf_c = pf_c;
        this.kwh_c = kwh_c;
        this.kvarh_c = kvarh_c;
        this.kvah_c = kvah_c;
        this.v_avg = v_avg;
        this.i_avg = i_avg;
        this.kw_tot = kw_tot;
        this.kvar_tot = kvar_tot;
        this.kva_tot = kva_tot;
        this.pf_tot = pf_tot;
        this.kwh_tot = kwh_tot;
        this.kvarh_tot = kvarh_tot;
        this.kvah_tot = kvah_tot;
        this.freq_a = freq_a;
        this.freq_b = freq_b;
        this.freq_c = freq_c;
        this.freq_max = freq_max;
        this.vthd = vthd;
        this.ithd = ithd;
        this.bi_positive_kwh = bi_positive_kwh;
        this.bi_negative_kwh = bi_negative_kwh;
        this.bi_net_kwh = bi_net_kwh;
        this.bi_total_kwh = bi_total_kwh;
        this.testString = testString;
        this.dateTime = dateTime;
    }
}
