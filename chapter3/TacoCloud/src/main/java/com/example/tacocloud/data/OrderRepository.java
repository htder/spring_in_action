package com.example.tacocloud.data;

import com.example.tacocloud.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
