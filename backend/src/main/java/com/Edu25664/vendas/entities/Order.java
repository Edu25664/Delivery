package com.Edu25664.vendas.entities;

import java.io.Serializable;
import java.time.Instant;

public class Order implements Serializable{
    private Long id;
    private Instant moment;
    private Double total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Order(Long id, Instant moment, Double total) {
        this.id = id;
        this.moment = moment;
        this.total = total;
    }

}
