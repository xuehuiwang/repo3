package com.wang.datastructure;

public class Stru02_LinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.append(n2).append(n3).append(new Node(4));
        System.out.println(n1.next().next().getData());

    }
}

//节点对象
class Node{
    //存储的数据
    private int data;
    //存储数据的节点
    private Node next;
    public Node(int data){
        this.data = data;
    }

    //连接节点
    public Node append(Node node){
        Node currentNode = this;
        while (true){
            //取出下一个节点
            Node nextNode = currentNode.next();
            //
            if (nextNode == null){
                break;
            }
            //下一个节点赋值给当前节点
            currentNode = nextNode;
        }
        //把需要追回的节点追加为找到的当前节点的下一个节点
        currentNode.next = node;
        return this;
    }

    //取出下一个节点
    public Node next(){
        return this.next;
    }
    //取出节点内容
    public int getData(){
        return this.data;
    }

    //当前节点是否为最后一个节点
    public boolean isLast(){
        return next==null;
    }

}
