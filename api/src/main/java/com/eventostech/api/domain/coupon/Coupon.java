package com.eventostech.api.domain.coupon;

import com.eventostech.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "coupon")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Coupon {

    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private Integer discount;
    private Date valid;

    //Um evento pode ter varios cupoms, e um cupom pertence á um evento
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
