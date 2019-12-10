import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 *
 * @author zhangfengjin
 *
 */
public class testList {
    @Test
    public  void test(){

    }

    /** List 中的迭代器迭代
     *
     */
    @Test
    public void testIterator(){
        List list = new ArrayList();
        list.add("a");//Object obj = new String();
        list.add("b");
        list.add("world");
        list.add("c");
        list.add("d");
        list.add("e");

		/*Iterator it = list.iterator();	//获取迭代器
		while(it.hasNext()) {			//判断集合中是否有元素
			String str = (String)it.next();	//向下转型
			if("world".equals(str)) {
				list.add("java");
				//遍历的同时在增加元素,并发修改ConcurrentModificationException
			}
		}*/

        //如果想在遍历的过程中添加元素,可以用ListIterator中的add方法
        ListIterator lit = list.listIterator();//获取迭代器(List集合特有的)
        while(lit.hasNext()) {
            String str = (String)lit.next();			//向下转型
            if("world".equals(str)) {
                lit.add("java");
            }
        }
        System.out.println(lit);


        ListIterator li = list.listIterator();//获取迭代器
        while(li.hasNext()) {
            System.out.println(li.next());//获取元素并将指针向后移动
        }
        System.out.println("-----------------");
        while(li.hasPrevious()) {
            System.out.println(li.previous()); //获取元素并将指针向前移动
        }

    }

}
