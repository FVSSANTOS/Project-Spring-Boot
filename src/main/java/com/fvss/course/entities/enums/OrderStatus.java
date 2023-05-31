package com.fvss.course.entities.enums;

public enum OrderStatus {
    
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPED(3),
    DELIVERED(4),
    CANCELED(5);

    private Integer code;

    private OrderStatus(int code){
        this.code = code;
    }

    public int getCode(){
        return this.code;
    }

    public static OrderStatus valeuOf(Integer code){
        for(OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
