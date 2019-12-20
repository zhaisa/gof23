package com.zhai;

import java.awt.*;
import javax.swing.*;

public class ProtoTypeWukong {
	  public static void main(String[] args)
	    {
	        JFrame jf=new JFrame("原型模式测试");
	        jf.setLayout(new GridLayout(2,4));
	        Container contentPane=jf.getContentPane();
	        SunWukong obj1=new SunWukong();
	        contentPane.add(obj1);       
//	        SunWukong obj2=(SunWukong)obj1.clone();
//	        contentPane.add(obj2);  
	        for(int i=0;i<10;i++) {
	        	SunWukong objnew=(SunWukong)obj1.clone();
	        	 contentPane.add(objnew);
	        }
	        jf.pack();       
	        jf.setVisible(true);
	        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	    }
}
class SunWukong extends JPanel implements Cloneable{
	private static final long serialVersionUID=5543049531872119328L;
	public SunWukong() {
		JLabel jl=new JLabel(new ImageIcon("src/main/java/Wukong.jpg"));
		this.add(jl);
	}
	public Object clone()
    {
        SunWukong w=null;
        try
        {
            w=(SunWukong)super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("拷贝悟空失败!");
        }
        return w;
    }
}