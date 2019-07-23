package data.structure.tree;

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
 * @date ：Created in 2019-07-23 14:28
 * @description：红黑树
 * @modified By：
 * @version:
 */
public class RBT<T extends Comparable<T>> {
    private RBTreeNode<T> root;

    private int size = 0;
    private static final boolean RED = false;
    private static final boolean BLACK = true;

    /**
     * true可以有相同的值，flase不能有
     */
    private volatile boolean overrideMode = true;

    public boolean isOverrideMode() {
        return overrideMode;
    }

    public int size() {
        return size;
    }

    public RBT() {

    }

    public RBT(boolean overrideMode) {
        this.overrideMode = overrideMode;
    }

    private boolean isRoot(RBTreeNode<T> node) {
        return root == node && node.getParent() == null;
    }

    /**
     * find the value by give value(include key,key used for search,
     * other field is not used,@see compare method).if this value not exist return null
     *
     * @param value
     * @return
     */
    public T find(T value) {
        RBTreeNode<T> dataRoot = getRoot();
        while (dataRoot != null) {
            int cmp = dataRoot.getValue().compareTo(value);
            if (cmp < 0) {
                dataRoot = dataRoot.getRight();
            } else if (cmp > 0) {
                dataRoot = dataRoot.getLeft();
            } else {
                return dataRoot.getValue();
            }
        }
        return null;
    }

    /**
     * add value to a new node,if this value exist in this tree,
     * if value exist,it will return the exist value.otherwise return null
     * if override mode is true,if value exist in the tree,
     * it will override the old value in the tree
     *
     * @param value
     * @return
     */
    public T addNode(T value) {
        RBTreeNode<T> t = new RBTreeNode<T>(value);
        return addNode(t);
    }

    public T addNode(RBTreeNode<T> node) {
        node.setLeft(null);
        node.setRight(null);
        node.setParent(null);
        if (root == null) {
            root = node;
            root.makeBlack();
            size++;
        } else {
            RBTreeNode<T> parentNode = findParentNode(node);
            int cmp = parentNode.getValue().compareTo(node.getValue());
        }
        return null;
    }

    /**
     * 左旋
     *
     * @param node
     */
    public void rotateLeft(RBTreeNode<T> node) {
        if (node != null) {
            //node的右节点
            RBTreeNode<T> r = node.right;
            //将r的左节点设为node的右节点
            node.right = r.left;
            if (r.left != null) {
                r.left.parent = node;
            }
            //将node的父节点变成r的
            r.parent = node.parent;
            if (node.parent == null) {
                this.root = r;
            } else if (node.parent.left == node) {
                node.parent.left = r;
            } else {
                node.parent.right = r;
            }
            r.left = node;
            node.parent = r;
        }
    }


    /**
     * find the parent node to hold node x,if parent value equals x.value return parent.
     *
     * @param node
     * @return
     */
    private RBTreeNode<T> findParentNode(RBTreeNode<T> node) {
        RBTreeNode<T> dataRoot = getRoot();
        RBTreeNode<T> child = dataRoot;

        while (child != null) {
            int cmp = child.getValue().compareTo(node.getValue());
            if (cmp == 0) {
                return child;
            }
            if (cmp > 0) {
                dataRoot = child;
                child = child.getLeft();
            } else if (cmp < 0) {
                dataRoot = child;
                child = child.getRight();
            }
        }
        return dataRoot;
    }

    private RBTreeNode<T> getRoot() {
        return this.root;
    }


    static final class RBTreeNode<T extends Comparable<T>> {

        T value;
        RBTreeNode<T> left;
        RBTreeNode<T> right;
        RBTreeNode<T> parent;

        boolean color = RED;

        public boolean isRed() {
            return color == RED;
        }

        public boolean isBlack() {
            return color == BLACK;
        }

        public RBTreeNode() {
        }

        public RBTreeNode(T value) {
            this.value = value;
        }

        public RBTreeNode(T value, RBTreeNode<T> parent) {
            this.value = value;
            this.parent = parent;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public RBTreeNode<T> getLeft() {
            return left;
        }

        public void setLeft(RBTreeNode<T> left) {
            this.left = left;
        }

        public RBTreeNode<T> getRight() {
            return right;
        }

        public void setRight(RBTreeNode<T> right) {
            this.right = right;
        }

        public RBTreeNode<T> getParent() {
            return parent;
        }

        public void setParent(RBTreeNode<T> parent) {
            this.parent = parent;
        }

        void makeRed() {
            color = RED;
        }

        void makeBlack() {
            color = BLACK;
        }

        /**
         * is leaf node 是不是叶子结点
         **/
        boolean isLeaf() {
            return left == null && right == null;
        }

        @Override
        public String toString() {
            return value.toString();
        }
    }
}
