package com.jsc.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardV0 {
	private int bno;
	private String title;
	private String content;
	private String writer;
}
