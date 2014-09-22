package test;

public class Chap06HomeworkTest {
    /**
     * 请尝试创建一个Rectangle（长方形）的类，可以参见课上讲过的Circle类
     * 先阅读一下下方的main方法，有一个大概的概念具体要做什么。
     * 这个main方法中我已经把客户端测试程序的代码写好了。
     * 大家要实现的就是Rectangle类本身
     *
     * 运行结果应该为：
     * Rec1的面积是100.0
     * Rec2的面积是300.0
     * Rec3长度:17.0
     * Rec3宽度:14.5
     * I am smaller
     * Width：17.0,Height:14.5 and area is 246.5
     */

    public static void main(String[] args) {
        //rec1用无参数构造函数构造，默认长度和宽度都是10，因此面积是100
        Rectangle rec1 = new Rectangle();
        System.out.println("Rec1的面积是" + rec1.getArea());

        //rec2用两参（两个参数）构造函数构造，第一个参数是长度width，第二个是宽度height
        Rectangle rec2 = new Rectangle(20, 15);
        //面积是300
        System.out.println("Rec2的面积是" + rec2.getArea());

        //rec3用无参数构造函数构造
        Rectangle rec3 = new Rectangle();
        //重新调整rec3的长度
        rec3.setWidth(17);
        //重新调整rec3的宽度
        rec3.setHeight(14.5);

        //打印rec3的长度
        System.out.println("Rec3长度:" + rec3.getWidth());
        //打印rec3的宽度
        System.out.println("Rec3宽度:" + rec3.getHeight());

        //rec1面积比rec3小，打印I am smaller
        rec1.compareTo(rec3);

        //打印rec3的细节
        rec3.printDetails();
    }
}


/**
 * 看完main函数，大家应该大致知道要做什么了，这里提出详细要求
 * Rectangle类的要求
 * 1.代码中的类（class），变量，方法（函数），包名的命名方式要符合规范
 * 2.长方形共有两个可见性为private的属性width（长度）和height（宽度），他们的数据类型是double，需要为这两个属性生成getter和setter
 * 3.提供两个构造函数，一个为无参构造函数，长度和宽度默认为10，另一个为良参构造函数，第一个参数是长度（width），第二个参数为宽度（height）
 * 4.长方形包含一个getArea方法（函数即方法，是同义词），该方法无任何参数，返回长方形的面积
 * 5.书写一个printDetail（打印细节）的方法，该方法没有参数，也无返回值，调用时会打印长方形的长度，宽度和面积，格式如下：
 *   Width:长度,Height:宽度, and area is 面积，
 *   如果长度为10，宽度为15，那么打印结果就是
 *   Width:10,Height:15, and area is 150，
 * 6.书写一个compareTo方法，该方法有一个Rectangle类型的参数，如果当前长方形比参数中的长方形面积小，打印
 *   I am smaller,大的话打印I am bigger,相等打印The same!
 * 7.额外要求，在setWidth和setHeight方法中，不允许参数为负数，如果是负数则不设置
 */
