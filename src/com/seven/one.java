package com.seven;

public class one {

       /* 定义长方形类，含：
        特征：宽、高（整型）；
        方法：求周长、面积；
        方法3个：（1）无参——宽、高默认值为1；（2）1个参数——宽、高均为参数值；
        （3）2个参数——宽、高各为参数值。
        并对其进行测试*/


    //定义长宽属性
    private int iWidth;
    private int iHeight;

    //构造器1
    public one() {
        this.iHeight = 1;
        this.iWidth = 1;
    }

    //构造器2
    public one(int iIndex) {
        this.iWidth = iIndex;
        this.iHeight = iIndex;
    }

    //构造器3
    public one(int iWidth, int iHeight) {
        this.iHeight = iHeight;
        this.iWidth = iWidth;
    }

    //求周长
    public int getLength() {
        return 2 * (this.iHeight + this.iWidth);
    }

    //求面积
    public int getSquare() {
        return this.iHeight * this.iWidth;

    }
}
