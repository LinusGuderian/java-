package day01;

/**
 * @description:字符的+操作
 * @author:
 * @time: 2022/4/8 16:42
 */
public class Demo11_zifucaozuo1 {
    public static void main(String[] args) {

        //定义两个变量
        int i =  10;
        char c = 'A';//'A'的值是65
        c = 'a';// 'a'的值是97
        c = '0';//'0'的值是48
        System.out.println(i+c);
        /**
         * 字符的“+”操作
         * 拿字符在计算机底层对应的数值来进行计算的
         * 'A'----->65, A-Z是连续的
         * 'a'----->97, a-z是连续的
         * '0'----->48, 0-9是连续的
         *
         * 算术表达式中包含多个基本数据类型的值的时候，整个算术表达式的类型 会自动进行提升
         *  提升规则：
         *      byte类型，short类型和char类型被提升到int类型
         *      整个表达式的类型自动提升到表达式中最高等级操作数同样的类型
         *      等级顺序：byte,short,char,int,long,float,double;
         *
         *      char 类型会被自动提升到int类型
         *
         */
//        char ch = i+c;
        int j = i+c;

        System.out.println(j);

//        int k = 10+13.14;
        double d = 10+13.14;
        System.out.println(d);
    }
}
