package com.company.models.twowheeled;

import com.company.interfaces.Breakable;
import com.company.interfaces.Drivable;


public abstract class TwoWheeled implements Breakable, Drivable {  // todo самокаты не ломаются, Breakable быть не должно

    public TwoWheeled() {  // todo странный конструктор, поля как инициализировать?

    }

    private int maxSpeed;
    private int weightLimit;
    private String brand;
    private String color;
}


