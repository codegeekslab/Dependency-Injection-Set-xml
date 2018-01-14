package com.codegeekslab.type;

import java.util.Set;
import com.codegeekslab.device.CellPhone;

public class SmartPhone implements CellPhone {

	public void makeCall(Set<Integer> number, String app) {
		for(Integer num:number)
			System.out.println("calling "+num+" via "+app);
	}
}
