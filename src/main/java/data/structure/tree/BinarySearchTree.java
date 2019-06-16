package data.structure.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * █████▒█      ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗
 * ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝
 * ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗
 * ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║
 * ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝
 * ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝
 * ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░
 * ░ ░    ░░░ ░ ░ ░        ░ ░░ ░
 * ░     ░ ░      ░  ░
 *
 * @author ：涂齐康
 * @date ：Created in 2019-06-15 21:50
 * @description：二叉查找树
 * @modified By：
 * @version:
 */
public class BinarySearchTree<E extends Comparable<E>> {

    private BinarySearchTree.Node<E> root;

    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public void add(E e) {
        root = add(root, e);
    }

    /**
     * 添加元素
     * @param root
     * @param e
     * @return
     */
    private Node<E> add(Node<E> root, E e) {
        if (root == null) {
            size++;
            return new Node<>(e);
        }
        if (e.compareTo(root.e) < 0) {
            root.left = add(root.left, e);
        } else {
            root.right = add(root.right, e);
        }

        return root;

    }

    public void remove(E e) {
        this.root = remove(this.root, e);
    }

    /**
     * 删除元素E
     * @param node
     * @param e
     * @return
     */
    private Node<E> remove(Node<E> node, E e) {
        if (node == null) {
            return null;
        }
        if (e.compareTo(node.e) < 0) {
            node.left = remove(node.left, e);
            return node;
        } else if (e.compareTo(node.e) > 0) {
            node.right = remove(node.right, e);
            return node;
        } else {
            if (node.left == null) {
                Node rightNode = node.right;
                node.right = null;
                size--;
                return rightNode;
            }
            if (node.right == null) {
                Node leftNode = node.left;
                node.left = null;
                size--;
                return leftNode;
            }
            //否则均不为空的情况
            Node succcessor = minimum(node.right);
            succcessor.right = removeMin(node.right);
            succcessor.left = node.left;

            node.left = node.right = null;
            return succcessor;
        }
    }

    /**
     * 寻找元素e是否存在
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node<E> node = root;
        while (true) {
            if (node == null) {
                return false;
            }
            if (e.compareTo(node.e) == 0) {
                return true;
            }
            if (e.compareTo(node.e) < 0) {
                node = node.left;
            } else {
                node = node.right;
            }
        }
    }

    /**
     * 寻找node中最小的节点
     *
     * @param node
     * @return
     */
    public Node<E> minimum(Node<E> node) {
        Node min = node;
        while (min.left != null) {
            min = min.left;
        }
        return min;
    }

    /**
     * 寻找node中最大的节点
     *
     * @param node
     * @return
     */
    public Node<E> maximum(Node<E> node) {
        Node max = node;
        while (max.right != null) {
            max = max.right;
        }
        return max;
    }

    /**
     * 删除最小值并返回Node节点
     * @param node
     * @return
     */
    public Node<E> removeMin(Node<E> node) {
        Node parent = null;
        Node min = node;
        while (min.left != null) {
            parent = min;
            min = min.left;
        }
        if (parent == null) {
            if (min.right != null) {
                Node right = min.right;
                min = null;
                size--;
                return right;
            }
            size--;
            return null;
        } else {
            if (min.right != null) {
                parent.left = min.right;
                parent = null;
                min = null;
                size--;
                return node;
            }
            parent.left = null;
            min = null;
            size--;
            return node;
        }
    }

    /**
     * 前序遍历
     */
    public void preOrder(){
        System.out.println("前序遍历递归");
        preOrderRecursive(this.root);
        System.out.println();
        System.out.println("前序遍历非递归");
        preOrderNonRecursive(this.root);
    }

    /**
     * 前序遍历 递归方式
     * @return
     */
    public void preOrderRecursive(Node<E> root){
        if (null!=root){
            System.out.print(root.e+"\t");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    /**
     * 前序遍历非递归方式
     * @param root
     */
    public void preOrderNonRecursive(Node<E> root){
        Stack<Node<E>> stack = new Stack<>();
        while (true){
            while (root!=null){
                System.out.print(root.e+"\t");
                stack.push(root);
                root = root.left;
            }
            if (stack.isEmpty()){
                break;
            }
            root = stack.pop();
            root = root.right;
        }
    }

    private static class Node<E> {
        E e;

        BinarySearchTree.Node<E> left;

        BinarySearchTree.Node<E> right;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }
}
