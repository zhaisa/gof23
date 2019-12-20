package com.zhai;

import java.awt.*;
import javax.swing.*;
/*
 * 
 * 饿汉式例子
 */

public class SingletonEager {
public static void main(String[] args) {
	JFrame jf=new JFrame("饿汉单例模式测试");
	jf.setLayout(new GridLayout(1,2));
	Container contentPane=jf.getContentPane();
	Bajie obj1=Bajie.getInstance();
	contentPane.add(obj1);
	Bajie obj2=Bajie.getInstance();
	contentPane.add(obj2);
	if(obj1==obj2) {
		System.out.println("同一个猪八戒！");
	}
	else {System.out.println("不是同一个猪八戒");}
	jf.pack();
	jf.setVisible(true);
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

}

class Bajie extends JPanel {
	private static Bajie instance=new Bajie();
	private Bajie() {
		JLabel jl=new JLabel(new ImageIcon("src/main/java/Bajie.jpg"));
		this.add(jl);
	};
	public static Bajie getInstance() {
		return instance;
	}
}