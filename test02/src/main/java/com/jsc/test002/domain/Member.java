package com.jsc.test002.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
}
