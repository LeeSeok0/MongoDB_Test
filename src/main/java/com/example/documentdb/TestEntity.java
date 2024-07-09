package com.example.documentdb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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

    // Constructor, getters, and setters

    public TestEntity(float v_a, float i_a, float kw_a, float kvar_a, float kva_a, float pf_a, float kwh_a,
                      float kvarh_a, float kvah_a, float v_b, float i_b, float kw_b, float kvar_b, float kva_b,
                      float pf_b, float kwh_b, float kvarh_b, float kvah_b, float v_c, float i_c, float kw_c,
                      float kvar_c, float kva_c, float pf_c, float kwh_c, float kvarh_c, float kvah_c, float v_avg,
                      float i_avg, float kw_tot, float kvar_tot, float kva_tot, float pf_tot, float kwh_tot,
                      float kvarh_tot, float kvah_tot, float freq_a, float freq_b, float freq_c, float freq_max,
                      float vthd, float ithd, float bi_positive_kwh, float bi_negative_kwh, float bi_net_kwh,
                      float bi_total_kwh){
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
    }

    // Getters and setters for all fields

    public float getV_a() {
        return v_a;
    }

    public void setV_a(float v_a) {
        this.v_a = v_a;
    }

    public float getI_a() {
        return i_a;
    }

    public void setI_a(float i_a) {
        this.i_a = i_a;
    }

    public float getKw_a() {
        return kw_a;
    }

    public void setKw_a(float kw_a) {
        this.kw_a = kw_a;
    }

    public float getKvar_a() {
        return kvar_a;
    }

    public void setKvar_a(float kvar_a) {
        this.kvar_a = kvar_a;
    }

    public float getKva_a() {
        return kva_a;
    }

    public void setKva_a(float kva_a) {
        this.kva_a = kva_a;
    }

    public float getPf_a() {
        return pf_a;
    }

    public void setPf_a(float pf_a) {
        this.pf_a = pf_a;
    }

    public float getKwh_a() {
        return kwh_a;
    }

    public void setKwh_a(float kwh_a) {
        this.kwh_a = kwh_a;
    }

    public float getKvarh_a() {
        return kvarh_a;
    }

    public void setKvarh_a(float kvarh_a) {
        this.kvarh_a = kvarh_a;
    }

    public float getKvah_a() {
        return kvah_a;
    }

    public void setKvah_a(float kvah_a) {
        this.kvah_a = kvah_a;
    }

    public float getV_b() {
        return v_b;
    }

    public void setV_b(float v_b) {
        this.v_b = v_b;
    }

    public float getI_b() {
        return i_b;
    }

    public void setI_b(float i_b) {
        this.i_b = i_b;
    }

    public float getKw_b() {
        return kw_b;
    }

    public void setKw_b(float kw_b) {
        this.kw_b = kw_b;
    }

    public float getKvar_b() {
        return kvar_b;
    }

    public void setKvar_b(float kvar_b) {
        this.kvar_b = kvar_b;
    }

    public float getKva_b() {
        return kva_b;
    }

    public void setKva_b(float kva_b) {
        this.kva_b = kva_b;
    }

    public float getPf_b() {
        return pf_b;
    }

    public void setPf_b(float pf_b) {
        this.pf_b = pf_b;
    }

    public float getKwh_b() {
        return kwh_b;
    }

    public void setKwh_b(float kwh_b) {
        this.kwh_b = kwh_b;
    }

    public float getKvarh_b() {
        return kvarh_b;
    }

    public void setKvarh_b(float kvarh_b) {
        this.kvarh_b = kvarh_b;
    }

    public float getKvah_b() {
        return kvah_b;
    }

    public void setKvah_b(float kvah_b) {
        this.kvah_b = kvah_b;
    }

    public float getV_c() {
        return v_c;
    }

    public void setV_c(float v_c) {
        this.v_c = v_c;
    }

    public float getI_c() {
        return i_c;
    }

    public void setI_c(float i_c) {
        this.i_c = i_c;
    }

    public float getKw_c() {
        return kw_c;
    }

    public void setKw_c(float kw_c) {
        this.kw_c = kw_c;
    }

    public float getKvar_c() {
        return kvar_c;
    }

    public void setKvar_c(float kvar_c) {
        this.kvar_c = kvar_c;
    }

    public float getKva_c() {
        return kva_c;
    }

    public void setKva_c(float kva_c) {
        this.kva_c = kva_c;
    }

    public float getPf_c() {
        return pf_c;
    }

    public void setPf_c(float pf_c) {
        this.pf_c = pf_c;
    }

    public float getKwh_c() {
        return kwh_c;
    }

    public void setKwh_c(float kwh_c) {
        this.kwh_c = kwh_c;
    }

    public float getKvarh_c() {
        return kvarh_c;
    }

    public void setKvarh_c(float kvarh_c) {
        this.kvarh_c = kvarh_c;
    }

    public float getKvah_c() {
        return kvah_c;
    }

    public void setKvah_c(float kvah_c) {
        this.kvah_c = kvah_c;
    }

    public float getV_avg() {
        return v_avg;
    }

    public void setV_avg(float v_avg) {
        this.v_avg = v_avg;
    }

    public float getI_avg() {
        return i_avg;
    }

    public void setI_avg(float i_avg) {
        this.i_avg = i_avg;
    }

    public float getKw_tot() {
        return kw_tot;
    }

    public void setKw_tot(float kw_tot) {
        this.kw_tot = kw_tot;
    }

    public float getKvar_tot() {
        return kvar_tot;
    }

    public void setKvar_tot(float kvar_tot) {
        this.kvar_tot = kvar_tot;
    }

    public float getKva_tot() {
        return kva_tot;
    }

    public void setKva_tot(float kva_tot) {
        this.kva_tot = kva_tot;
    }

    public float getPf_tot() {
        return pf_tot;
    }

    public void setPf_tot(float pf_tot) {
        this.pf_tot = pf_tot;
    }

    public float getKwh_tot() {
        return kwh_tot;
    }

    public void setKwh_tot(float kwh_tot) {
        this.kwh_tot = kwh_tot;
    }

    public float getKvarh_tot() {
        return kvarh_tot;
    }

    public void setKvarh_tot(float kvarh_tot) {
        this.kvarh_tot = kvarh_tot;
    }

    public float getKvah_tot() {
        return kvah_tot;
    }

    public void setKvah_tot(float kvah_tot) {
        this.kvah_tot = kvah_tot;
    }

    public float getFreq_a() {
        return freq_a;
    }

    public void setFreq_a(float freq_a) {
        this.freq_a = freq_a;
    }

    public float getFreq_b() {
        return freq_b;
    }

    public void setFreq_b(float freq_b) {
        this.freq_b = freq_b;
    }

    public float getFreq_c() {
        return freq_c;
    }

    public void setFreq_c(float freq_c) {
        this.freq_c = freq_c;
    }

    public float getFreq_max() {
        return freq_max;
    }

    public void setFreq_max(float freq_max) {
        this.freq_max = freq_max;
    }

    public float getVthd() {
        return vthd;
    }

    public void setVthd(float vthd) {
        this.vthd = vthd;
    }

    public float getIthd() {
        return ithd;
    }

    public void setIthd(float ithd) {
        this.ithd = ithd;
    }

    public float getBi_positive_kwh() {
        return bi_positive_kwh;
    }

    public void setBi_positive_kwh(float bi_positive_kwh) {
        this.bi_positive_kwh = bi_positive_kwh;
    }

    public float getBi_negative_kwh() {
        return bi_negative_kwh;
    }

    public void setBi_negative_kwh(float bi_negative_kwh) {
        this.bi_negative_kwh = bi_negative_kwh;
    }

    public float getBi_net_kwh() {
        return bi_net_kwh;
    }

    public void setBi_net_kwh(float bi_net_kwh) {
        this.bi_net_kwh = bi_net_kwh;
    }

    public float getBi_total_kwh() {
        return bi_total_kwh;
    }

    public void setBi_total_kwh(float bi_total_kwh) {
        this.bi_total_kwh = bi_total_kwh;
    }
}
