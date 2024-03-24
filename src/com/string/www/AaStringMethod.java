package com.string.www;

/**
 * @program: Pro1->AStringMostFunction
 * @description: String的基本的方法合集
 * @author: MaYuan
 * @create: 2019-12-23 12:32
 * @version: 1.0
 * * String的常用的方法集合
 * * java中String的常用方法
 * 1、length() 字符串的长度
 * 例：char chars[]={'a','b'.'c'};
 * String s=new String(chars); 　　　　i
 * length =s.length();
 * <p>
 * 2、charAt() 截取一个字符
 * 例：char ch;
 * ch="abc".charAt(1); 返回'b'
 * <p>
 * 3、 getChars() 截取多个字符
 * <p>
 * 例：String s="this is a demo of the getChars method.";
 * 　　char buf[]=new char[20];
 * 　 s.getChars(10,14,buf,0);
 * <p>
 * 4、getBytes()
 * 　替代getChars()的一种方法是将字符存储在字节数组中，该方法即getBytes()。
 * <p>
 * 5、toCharArray()
 * 转成char型数组
 * <p>
 * 6、equals()和equalsIgnoreCase()
 * equals()判断两个String的值 是否相等
 * equalsIgnoreCase()判断两个String的值 是否相等 并且忽略大小写
 * <p>
 * 7、regionMatches()
 * 用于比较一个字符串中特定区域与另一特定区域，它有一个重载的形式允许在比较中忽略大小写。
 * <p>
 * 8、startsWith()和endsWith()
 * <p>
 * startsWith()方法决定是否以特定字符串开始
 * endWith()方法决定是否以特定字符串结束
 * 例
 * //str是否从b开始
 * String str = "abcd";
 * boolean b = str.startsWith("b");
 * System.out.println(b);//false
 * 9、equals()和==
 * <p>
 * 　　equals()方法比较字符串对象中的字符(比较值)，==运算符比较两个对象是否引用同一实例（比较地址）。
 * 例：String s1="Hello";
 * String s2=new String(s1);
 * 　   s1.eauals(s2); //true
 * 　   s1==s2;//false
 * 10、compareTo()和compareToIgnoreCase() 比较字符串
 * <p>
 * 11、indexOf()和lastIndexOf()
 * indexOf() 查找字符或者子串第一次出现的地方。
 * lastIndexOf() 查找字符或者子串是后一次出现的地方。
 * <p>
 * 12、substring()　字符串的截取(从某个下标开始  直到结束)
 * 例:String str = "bcd";
 * String string2 = str.substring(1);
 * System.out.println(string2);//cd
 * public String substring(int beginIndex, int endIndex)
 * <p>
 * beginIndex -- 起始索引（包括）, 索引从 0 开始。
 * endIndex -- 结束索引（不包括）。    包括开始，不包括结尾。
 * <p>
 * 13、concat()
 * 连接两个字符串
 * <p>
 * 14 、replace() 替换
 * 它有两种形式，第一种形式用一个字符在调用字符串中所有出现某个字符的地方进行替换，形式如下：
 * 　String replace(char original,char replacement)
 * 例如：String s="Hello".replace('l','w');
 * 第二种形式是用一个字符序列替换另一个字符序列，形式如下：
 * 　　String replace(CharSequence original,CharSequence replacement)
 * <p>
 * 15、trim() 去掉起始和结尾的空格
 * <p>
 * 16、valueOf() 将满足条件的参数 转换成 String类型
 * <p>
 * 17、toLowerCase() 转换为小写
 * <p>
 * 18、toUpperCase() 转换为大写
 * <p>
 * 19、isEmpty():判断字符串的长度是否为0
 * 例String str = "bcd";
 * boolean empty = str.isEmpty();
 * System.out.println(empty);//3
 * <p>
 * int length = str.length();
 * System.out.println(length);//false
 * <p>
 * 20、split():以某种规则进行拆分
 * <p>
 * 21、contains():是否包含
 * <p>
 * 22、 indexOf():返回下标
 * <p>
 * 23、toString():返回此对象本身
 * <p>
 * substring() 方法返回字符串的子字符串。
 * <p>
 * 语法 substring的方法是小写的 substring()
 * public String substring(int beginIndex)
 * <p>
 * 或
 * <p>
 * public String substring(int beginIndex, int endIndex)
 * 参数
 * beginIndex -- 起始索引（包括）, 索引从 0 开始。
 * <p>
 * endIndex -- 结束索引（不包括）。
 **/
public class AaStringMethod {

    public static void main(String[] args) {
        String str1 = "abc";
        boolean empty = str1.isEmpty();
        System.out.println(empty);
    }
}
