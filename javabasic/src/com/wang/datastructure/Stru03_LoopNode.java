package com.wang.datastructure;
/*
循环链表
 */
public class Stru03_LoopNode {
    public static void main(String[] args) {
        LoopNode n1 = new LoopNode(1);
        LoopNode n2 = new LoopNode(2);
        LoopNode n3 = new LoopNode(3);
        n1.after(n2);
        n2.after(n3);
        System.out.println(n1.next().getData());//1
        System.out.println(n2.getData());
        System.out.println(n3.getData());

    }
}

class LoopNode{
    //当前节点内容
    int data;
    //下一个节点
    LoopNode next = this;

    public LoopNode(int data){
        this.data = data;
    }

    /**
     *追加一个新的节点
     * @param node
     */
    public void after(LoopNode node){
        //取出下一个节点，作为下下个节点
        LoopNode nextnext = next;
        //把新节点作为当前节点的下一个节点
        this.next = node;
        //把当前节点作为新节点的下一个节点
        node.next = nextnext;
    }

    /**
     * 获取当前节点的内容
     * @return
     */
    public int getData(){
        return this.data;
    }
    public LoopNode next(){
        return next;
    }
}
