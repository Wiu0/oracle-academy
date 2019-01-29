package br.com.senac.jp.map;

import java.util.ArrayList;
import java.util.List;

interface Shape {}
interface InnerShape extends Shape{}
class Circle implements Shape{ }
class InnerCircle extends Circle{}
class Rectangle implements Shape{}
public class Tester {
 public static void main(String[] args) {
  
  Circle c= new Circle();
  InnerCircle ic = new InnerCircle();
  Rectangle  rect   = new Rectangle();
  
  System.out.print(c instanceof InnerCircle); //Line 1
  System.out.print(ic instanceof Circle);     //Line 2
//  System.out.print(rect instanceof InnerCircle); //Line 3
  System.out.print(rect instanceof Shape);   //Line 4
 
  List list1 = new ArrayList();
  list1.add(new String(""));
  List list2 = list1;
  list2.add(new Integer(9));
  System.out.println(list2.size());
 
 }
}