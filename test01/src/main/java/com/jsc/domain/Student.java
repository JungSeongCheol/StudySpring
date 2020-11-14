package com.jsc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Default Args
@NoArgsConstructor
//필드 명 모두다있는 Arg
@AllArgsConstructor
//Member와 비교하면 훨신 간단(@Data로 lombok사용)
@Data
public class Student {
	private int sno;
	private String name;
	private String major;
}
