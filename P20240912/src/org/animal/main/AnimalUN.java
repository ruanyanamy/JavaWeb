package org.animal.main;

import org.animal.model.Animal;
import org.animal.model.*;

public class AnimalUN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Animal d = new Dog();  //Polymorphism
//		Animal c = new Cat();  //同上
		
		Dog d = new Dog();  
		Cat c = new Cat();  
		米國人 a = new 米國人();
		//抽象類別不能建立實體物件
		//Animal g = new Animal();
		//Human h = new Human();
		
		//d.speak();  //在多型的狀況下，如果呼叫的行為有被子類別override就會用子類別的方法實作
					//(也就是virtual method invocation[VMI]也稱為Dynamic Binding動態細節)
		//c.speak();  //同上
		
		//上台發言(d);
		//上台發言(c);
		//雙邊會談(c, d);
		多邊會談(c,d,a);
		Pet.foo();
		d.bar();
		d.baz();
	}
	
	//以下三個方法都具有擴充性
	public static void 上台發言(Animal a) {   //Animal還是可以當成datatype
		a.speak();
	}
	
	public static void 雙邊會談(Animal a1 , Animal a2) {
		a1.speak();
		a2.speak();
	}
	
	public static void 多邊會談(Animal...animals) { //...可以傳0~多個動物
		for (Animal a : animals) {
			a.speak();
		}
	}

}
