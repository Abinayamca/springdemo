package com.demo.pathdemo.Service;

import org.springframework.stereotype.Service;

@Service
public class PathService {

	public int add(int a, int b) {
        return a + b;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }
	
}
