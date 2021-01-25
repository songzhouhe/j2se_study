1.程序实现目标： 输入一个字符串，将其各个字符对应的ASCII值加5后，输出结果。

  程序要求：该字符串只包含小写字母，若其值加5后的字符值大于'z',将其转换成从a开始的字符。

 



2.程序实现目标：求一个整型数组中元素的平均值，并统计其中大于和小于此平均值的元素的个数。

 程序要求：输入：整型数组中的元素个数及各个元素。

​           输出：整型数组中元素的平均值，大于和小于此平均值的元素的个数。



 

3、手动输入一个存储整数的数组，要求输出数组里面的2个最大值。

  实例： 

​       输入：1,2,5,9,84,3,2

​       输出：84,9

 

 

 

 

4、回文数字判断。

题目描述：

  有这样一类数字，他们顺着看和倒着看是相同的数，例如：121,656,2332等，这样的数字就称为：回文数字。编写一个函数，判断某数字是否是回文数字。

  要求实现方法：

public String isPalindrome(String strIn);

【输入】strIn: 整数，以字符串表示；

【返回】true: 是回文数字；

​       false: 不是回文数字；

 

【注意】只需要完成该函数功能算法，中间不需要有任何IO的输入输出

 

 

 

 

5、要求：随机打印50个随机（4-10长度）的字符串，要求字符串包含的范围是所有的英文字母包含大小写和数字，按照编码顺序排序，每行打印4个，要求首字符对齐

 

 

 

6.手动输入一个字符串，仅限小写字母，统计并输出每个字符在字符串中出现的次数,并输出。提示(可以用Map)

实例：

输入：aaabbbccc

输出：a 3

​      b 3

​      c 3



 

 

7、要求实现方法public String addTwoBigNumber(String s1,string s2)

 大数相加，注意处理异常

 

public class Test{

public String addTwoBigNumber(String s1,string s2)

{

  return "";

}

 

public static void main(String[] args)

{

   Test test = new Test();

   test.addTwoBigNumber("123456789","987654321")

 

}

}

 

8、比较二维数组列最小值，组成一个新数组返回。(实现核心算法，不需要使用IO)

输入：intArr = {{5,6,1,16},{7,3,9}}

输出：intArrs ={1,3}

 

 

 

9. 输入：a aa,cat tiger.123dd 

输出： tiger

功能描述：键盘输入一句话

​        输出一句话中最常的单词，如果最长的出现多次，返回第一个。

​        这句话只包含数字字母和标点。

 

 

 

 

 

\10. 功能描述：将字符串中的字母全部替换成字母的下一个字母，

要是最后一位是z或Z则替换为a或A。

输入：aBxyZ

输出：bCyzA

 

 

 

\11. 功能描述：判断一个字符串中是否只含有相同的子字符串（子串长度>=2）

输入：abab 

返回：true

输入：abcd

返回：false

 

要求实现方法：

public boolean checkString(String data)

{

  //TODO

  return false;

}

\12. 功能描述：已知：yi er san si wu liu qi ba jiu 分别对应123456789，

对一段只含有这几种字符串的字符串进行转换，如：

输入：yiersansan

输出：1233

要求实现方法：

public String trunNumber(String data)

{

  //TODO

  return "";

}

\13. 功能描述：删除字符串中字符个数最少的字符，最少字符串有多个，最少的要全部删除

​        然后返回该子字符串。

输入：asdasdas

输出：asasas
  

\14. 功能描述：找出一个int[]中满足 2^n的数字，然后组成的新的数组

输入：{4,3，8}

输出：{4,8}

 

\15. 

功能描述：共data1个人，围成一圈，然后标号，从1-data1。

​         然后从data2号开始从1报数，报3的出列，求出列序列。

​        返回一个数组

如：

输入：3，2

输出：1,2,3

要求实现方法：

/**

 \* data1：人数

 \* data2 : 起始位置

 *

 */

public int[] circleOut(int data1,int data2)

{

   int outNum = 3;

  //TODO

  return null;

}

\16. 功能描述：统计一个数字转为二进制后，0和1的个数，组成数组返回

输入：6

输出：{1,2}

 

\17. 功能描述：对一个二进制数的每位进行0和1反转，求翻转后的二进制所对应的十进制

输入：1010

输出：5

 



\18. 功能描述：判断一个字符串中的"( )"是否配对

输入：if(a.equals(a))

输出：true

 

\19. 功能描述：查找一个字符串的子字符串集

输入：abab

输出：a b ab ba aba bab 

 

要求实现方法：

public List<String> getChildren(String data)

{

  List<String> list = new ArrayList<String>();

  //TODO

  return list;

}

\20. 功能描述：数组的循环移位，

输入：{a,b,c},2

输出：{b,c,a} 

 

要求实现方法：

/**

 *data :待循环数组

 *index:移动位数

 */

public String[] getChildren(String[] data,int index)

{

  //TODO

  return null;

}





\21. 程序实现目标： 输入一个字符，将字符转换为小写，将其对应的ASCII值加5后，输出结果。

程序要求：若其值加5后的字符值大于'z',将其转换成从a开始的字符。

输入：‘A’

输出：‘f’





\22. 要求：将一个二维数组进行逆序，逆序后所有的元素行列不定，进行随机排列

①先把数组每一行逆序

②再把逆序后每一行进行随机排列

如：{{4,3,32,5},{1,2,3,4},{9,6,5,4}};

⇒4 6 5 9
 　3 4 2 1
 　5 4 32 3





\23. 根据输入m数据，找出str的m个字符的所有字符串

例如"abc" m=2

"ab" "ac" "bc"

"abcd" m=3

"abc" "acd" "bcd" "abd"

public ArrayList<String> perenum(String str,int m)

{

 

  return null;

}

\24. 分解质因数

eg：输入 28

输出 2*2*7

25.n个长度的字符串中取m个长度的组合

\26. 二维数组转置

例：1 2 3

  4 5 6

转置

  1 4

  2 5

  3 6





\27. 功能描述：输入字符串，将该字符串中数字放到非数字的后面，并保持原有顺序不变。

例如：h3a2p0p1y----------happy3201

public String childStr(String inputStr){

}





\28. 输入一个身份证号码（15位和18位）和一个年份，计算现在的年龄（忽略非法参数）

eg：610618199001020065 2011

输出：21



\29. 输入一个字符串，如果是小写则转换成相应的大写字母的后五位，如果是VWXYZ则转换成abcde,其他的都不变，例如：“aDsR154+-/.”则应该输出为“FDXR154+-/.”



