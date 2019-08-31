package com.wang.datastructure;
/*
双向链表
 */
public class Stru04_DoubleNode {
    public static void main(String[] args) {
        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        n1.setNext(n2);
        System.out.println(n1.getPre().getData());
        System.out.println(n1.getNext().getData());
        System.out.println(n1.getData());

    }
}

class DoubleNode{
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //当前节点数据
    int data;
    public DoubleNode(int data){
        this.data = data;
    }

    /**
     * 新增一个节点
     * @param node
     */
    public void setNext(DoubleNode node){
        //原来的下一个节点--作为新加一个节点后的下下个节点
        DoubleNode nextnext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把当前节点作为新节点的上一个节点
        node.pre = this;
        //原来的下一个节点作为新节点的下一个节点
        node.next = nextnext;
        //新节点作为原来的下一个节点的上一个节点
        nextnext.pre = node;
    }

    /**
     * 获取下一个节点
     * @return
     */
    public DoubleNode getNext(){
        return this.next;
    }

    /**
     * 获取上一个节点
     * @return
     */
    public DoubleNode getPre(){
        return this.pre;
    }
    public int getData(){
        return this.data;
    }
}