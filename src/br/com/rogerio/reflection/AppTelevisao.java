package br.com.rogerio.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AppTelevisao {

	//MAIN 
	public static void main(String[] args) {
		
		Class<Televisao> c = Televisao.class;
		
		//pega os as variaveis da classe
		Field[] fields = c.getDeclaredFields();
		
		for (Field field : fields) {
			System.out.println(field.getName() + "  " + field.getType());
		}
		
		System.out.println("-----------------------------------");
		
		//pega os metodos da classe
		Method[] methods = c.getDeclaredMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
	
		
		
		

	}

}
