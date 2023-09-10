package com.mine.chapter04.practice;

/**
 * @author CaoY
 * @date 2023-09-10 19:40
 * @description 练习 4.25 （本题类似于练习 4.18）
 * a. 为了存储一棵 N 结点的 AVL 树中一个结点的高度，每个结点需要多少比特（bit）？
 * b. 使 8 比特高度计数器溢出的最小的 AVL 树是什么？
 *
 * 回答：
 *  高度为 0 时，结点的最小个数 A(0) = 1；
 *  高度为 1 时，结点的最小个数 A(1) = 2；
 *  高度为 2 时，结点的最小个数 A(2) = 4；
 *  高度为 3 时，结点的最小个数 A(3) = 7；
 *  高度为 4 时，结点的最小个数 A(4) = 12；
 *  ...... 观察上式，可得如下递推式
 *  高度为 h 时，结点的最小个数 A(h) = A(h - 1) + A(h - 2) + 1（类似于斐波那契数列）
 *
 *  a. 令 A(h) = A(h - 1) + A(h - 2) + 1 = N;
 *  A(0) = 1; A(1) = 2;
 *  可以根据如上递归式计算得出 h，进而计算得出需要多少个比特。
 *  b. 8 比特意味着能够达到的最大高度为 h，要想使其溢出的最大的结点个数为 A(127) + 1，
 *  根据上面的递推式计算得出即可。
 */
public class Solution04_25 {

    public static void main(String[] args) {
        System.out.println("只得出了一个递推式，我试图找到其非递归表示的关系，但是奈何数学能力不够...");
    }
}