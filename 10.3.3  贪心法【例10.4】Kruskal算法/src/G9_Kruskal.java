//《数据结构（Java版）（第4版）》，作者：叶核亚，2014年11月2日
//10.3   算法设计策略
//10.3.3   贪心法
//5.  Kruskal算法实现
//（2） 最小生成树类
//【例10.4】  使用最小堆和并查集实现Kruskal算法。

public class G9_Kruskal
{   
    public static void main(String args[])
    {
        //带权无向图G9的边集合（每边只表示一次）
        Triple edges[]={new Triple(0,1,26),new Triple(0,2,18),new Triple(0,3,15),
                      new Triple(1,2,17),new Triple(1,4,13),
                      new Triple(2,3,25),new Triple(2,4,21),new Triple(2,5,14),
                      new Triple(3,5,18),new Triple(4,5,16)};
        MinSpanTree mstree = new MinSpanTree(6, edges, new TripleComparator());
        System.out.println("带权无向图G9，"+mstree.toString());
    }
}
/*
程序运行结果如下：
并查集：(-1, -1, -1, -1, -1, -1) ，最小堆：SeqList((0,3,5), (1,4,13), (0,2,18), (2,5,14), (4,5,16), (2,3,25), (2,4,21), (0,1,26), (3,5,18), (1,2,17)) 
最小边(0,3,5)，插入边(0,3,5)，并查集：(-2, -1, -1, 0, -1, -1) 
最小边(1,4,13)，插入边(1,4,13)，并查集：(-2, -2, -1, 0, 1, -1) 
最小边(2,5,14)，插入边(2,5,14)，并查集：(-2, -2, -2, 0, 1, 2) 
最小边(4,5,16)，插入边(4,5,16)，并查集：(-2, -4, 1, 0, 1, 2) 
最小边(1,2,17)，最小边(3,5,18)，插入边(3,5,18)，并查集：(1, -6, 1, 0, 1, 2) 
带权无向图G9，最小生成树的边集合：(0,3,15) (1,4,13) (2,5,14) (4,5,16) (3,5,18) ，最小代价为76

//按照折叠规则压缩路径
*/
