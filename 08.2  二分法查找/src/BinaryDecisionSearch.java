//《数据结构（Java版）（第4版）试题库》，作者：叶核亚，2015年8月24日
//8.2 二分法查找    
//显示n(8~15)个元素二分法查找的二叉判定树

public class BinaryDecisionSearch                          //二叉判定树
{
    //对排序数组values[]进行二分法查找，输出每个元素的二分法查找结果，确定二叉判定树
    public static void print(int[] values)
    { 
        System.out.print("排序关键字序列（升序）: ");
        Array1.print(values);                              //见例1.4
        
        if (values==null || values.length==0)
            return;
        //将int[]转换成Integer[]。SortedArray中，查找Integer[]，循环；查找int[]，递归算法
        Integer[] keys = new Integer[values.length];
        for (int i=0; i<keys.length; i++)
            keys[i] = values[i];
        
        //排序单链表（升序）list，存储查找每个元素的比较次数
        SortedSinglyList<Integer> list = new SortedSinglyList<Integer>();
        for (int i=0; i<keys.length; i++)                  //查找每个元素
        {
            System.out.print("二分法查找 "+keys[i]+"，");
            int find=SortedArray.binarySearch(keys, keys[i]);  //二分法查找，显示查找过程
            System.out.println(" "+((find==-1)?"不":"")+"成功");
            list.insert(new Integer(SortedArray.count));   //排序单链表，插入比较次数
        }
        System.out.print("ASL成功=");
        SortedSinglyLists.average(list);         //按ASL成功格式输出list排序单链表，计算平均值
    }
    
    public static void main(String[] args)
    {
        int[] values = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};  //图8.2 8个元素
        BinaryDecisionSearch.print(values);                //输出二分法查找的二叉判定树
    }
}
/* 
程序运行结果如下， 8~15个元素，按元素个数升序排列。
排序关键字序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7}，8个元素        //图8.2 二叉判定树
二分法查找 0，[3]=3？[1]=1？[0]=0？ 成功
二分法查找 1，[3]=3？[1]=1？ 成功
二分法查找 2，[3]=3？[1]=1？[2]=2？ 成功
二分法查找 3，[3]=3？ 成功
二分法查找 4，[3]=3？[5]=5？[4]=4？ 成功
二分法查找 5，[3]=3？[5]=5？ 成功
二分法查找 6，[3]=3？[5]=5？[6]=6？ 成功
二分法查找 7，[3]=3？[5]=5？[6]=6？[7]=7？ 成功
ASL成功=(1×1+2×2+3×4+4×1)/8 = 21/8 = 2.625

排序关键字序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8}，9个元素
二分法查找 0，[4]=4？[1]=1？[0]=0？ 成功
二分法查找 1，[4]=4？[1]=1？ 成功
二分法查找 2，[4]=4？[1]=1？[2]=2？ 成功
二分法查找 3，[4]=4？[1]=1？[2]=2？[3]=3？ 成功
二分法查找 4，[4]=4？ 成功
二分法查找 5，[4]=4？[6]=6？[5]=5？ 成功
二分法查找 6，[4]=4？[6]=6？ 成功
二分法查找 7，[4]=4？[6]=6？[7]=7？ 成功
二分法查找 8，[4]=4？[6]=6？[7]=7？[8]=8？ 成功
ASL成功=(1×1+2×2+3×4+4×2)/9 = 25/9 = 2.7777777777777777

关键字排序序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}，10个元素   //【习题解答8-9】，习图8.2
二分法查找 0，[4]=4？[1]=1？[0]=0？ 成功
二分法查找 1，[4]=4？[1]=1？ 成功
二分法查找 2，[4]=4？[1]=1？[2]=2？ 成功
二分法查找 3，[4]=4？[1]=1？[2]=2？[3]=3？ 成功
二分法查找 4，[4]=4？ 成功
二分法查找 5，[4]=4？[7]=7？[5]=5？ 成功
二分法查找 6，[4]=4？[7]=7？[5]=5？[6]=6？ 成功
二分法查找 7，[4]=4？[7]=7？ 成功
二分法查找 8，[4]=4？[7]=7？[8]=8？ 成功
二分法查找 9，[4]=4？[7]=7？[8]=8？[9]=9？ 成功
ASL成功=(1×1+2×2+3×4+4×3)/10 = 29/10 = 2.9

关键字排序序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}，11个元素
二分法查找 0，[5]=5？[2]=2？[0]=0？ 成功
二分法查找 1，[5]=5？[2]=2？[0]=0？[1]=1？ 成功
二分法查找 2，[5]=5？[2]=2？ 成功
二分法查找 3，[5]=5？[2]=2？[3]=3？ 成功
二分法查找 4，[5]=5？[2]=2？[3]=3？[4]=4？ 成功
二分法查找 5，[5]=5？ 成功
二分法查找 6，[5]=5？[8]=8？[6]=6？ 成功
二分法查找 7，[5]=5？[8]=8？[6]=6？[7]=7？ 成功
二分法查找 8，[5]=5？[8]=8？ 成功
二分法查找 9，[5]=5？[8]=8？[9]=9？ 成功
二分法查找 10，[5]=5？[8]=8？[9]=9？[10]=10？ 成功
ASL成功=(1×1+2×2+3×4+4×4)/11 = 33/11 = 3.0

关键字排序序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}，12个元素
二分法查找 0，[5]=5？[2]=2？[0]=0？ 成功
二分法查找 1，[5]=5？[2]=2？[0]=0？[1]=1？ 成功
二分法查找 2，[5]=5？[2]=2？ 成功
二分法查找 3，[5]=5？[2]=2？[3]=3？ 成功
二分法查找 4，[5]=5？[2]=2？[3]=3？[4]=4？ 成功
二分法查找 5，[5]=5？ 成功
二分法查找 6，[5]=5？[8]=8？[6]=6？ 成功
二分法查找 7，[5]=5？[8]=8？[6]=6？[7]=7？ 成功
二分法查找 8，[5]=5？[8]=8？ 成功
二分法查找 9，[5]=5？[8]=8？[10]=10？[9]=9？ 成功
二分法查找 10，[5]=5？[8]=8？[10]=10？ 成功
二分法查找 11，[5]=5？[8]=8？[10]=10？[11]=11？ 成功
ASL成功=(1×1+2×2+3×4+4×5)/12 = 37/12 = 3.0833333333333335

关键字排序序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}，13个元素
二分法查找 0，[6]=6？[2]=2？[0]=0？ 成功
二分法查找 1，[6]=6？[2]=2？[0]=0？[1]=1？ 成功
二分法查找 2，[6]=6？[2]=2？ 成功
二分法查找 3，[6]=6？[2]=2？[4]=4？[3]=3？ 成功
二分法查找 4，[6]=6？[2]=2？[4]=4？ 成功
二分法查找 5，[6]=6？[2]=2？[4]=4？[5]=5？ 成功
二分法查找 6，[6]=6？ 成功
二分法查找 7，[6]=6？[9]=9？[7]=7？ 成功
二分法查找 8，[6]=6？[9]=9？[7]=7？[8]=8？ 成功
二分法查找 9，[6]=6？[9]=9？ 成功
二分法查找 10，[6]=6？[9]=9？[11]=11？[10]=10？ 成功
二分法查找 11，[6]=6？[9]=9？[11]=11？ 成功
二分法查找 12，[6]=6？[9]=9？[11]=11？[12]=12？ 成功
ASL成功=(1×1+2×2+3×4+4×6)/13 = 41/13 = 3.1538461538461537

关键字排序序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13}，14个元素
二分法查找 0，[6]=6？[2]=2？[0]=0？ 成功
二分法查找 1，[6]=6？[2]=2？[0]=0？[1]=1？ 成功
二分法查找 2，[6]=6？[2]=2？ 成功
二分法查找 3，[6]=6？[2]=2？[4]=4？[3]=3？ 成功
二分法查找 4，[6]=6？[2]=2？[4]=4？ 成功
二分法查找 5，[6]=6？[2]=2？[4]=4？[5]=5？ 成功
二分法查找 6，[6]=6？ 成功
二分法查找 7，[6]=6？[10]=10？[8]=8？[7]=7？ 成功
二分法查找 8，[6]=6？[10]=10？[8]=8？ 成功
二分法查找 9，[6]=6？[10]=10？[8]=8？[9]=9？ 成功
二分法查找 10，[6]=6？[10]=10？ 成功
二分法查找 11，[6]=6？[10]=10？[12]=12？[11]=11？ 成功
二分法查找 12，[6]=6？[10]=10？[12]=12？ 成功
二分法查找 13，[6]=6？[10]=10？[12]=12？[13]=13？ 成功
ASL成功=(1×1+2×2+3×4+4×7)/14 = 45/14 = 3.2142857142857144

关键字排序序列（升序）: {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}，15个元素
二分法查找 0，[7]=7？[3]=3？[1]=1？[0]=0？ 成功
二分法查找 1，[7]=7？[3]=3？[1]=1？ 成功
二分法查找 2，[7]=7？[3]=3？[1]=1？[2]=2？ 成功
二分法查找 3，[7]=7？[3]=3？ 成功
二分法查找 4，[7]=7？[3]=3？[5]=5？[4]=4？ 成功
二分法查找 5，[7]=7？[3]=3？[5]=5？ 成功
二分法查找 6，[7]=7？[3]=3？[5]=5？[6]=6？ 成功
二分法查找 7，[7]=7？ 成功
二分法查找 8，[7]=7？[11]=11？[9]=9？[8]=8？ 成功
二分法查找 9，[7]=7？[11]=11？[9]=9？ 成功
二分法查找 10，[7]=7？[11]=11？[9]=9？[10]=10？ 成功
二分法查找 11，[7]=7？[11]=11？ 成功
二分法查找 12，[7]=7？[11]=11？[13]=13？[12]=12？ 成功
二分法查找 13，[7]=7？[11]=11？[13]=13？ 成功
二分法查找 14，[7]=7？[11]=11？[13]=13？[14]=14？ 成功
ASL成功=(1×1+2×2+3×4+4×8)/15 = 49/15 = 3.2666666666666666

*/
//@author：Yeheya。2015-8-24


