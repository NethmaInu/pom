package com.springbootaccadamy.batch8.pos1.utill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StandedResponce {
private int code;
private String message;
private Object data;

}

