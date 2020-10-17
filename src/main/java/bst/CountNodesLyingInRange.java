package bst;



public class CountNodesLyingInRange {


  public  int getCountOfNode(BSTNode<Integer> root,int l, int h)
  {
    if (root == null) return 0;

    if (root.data >= l && root.data <= h) {
      return 1 + getCountOfNode(root.left, l, h) + getCountOfNode(root.right, l, h);
    }
    if (root.data < l) {
      return getCountOfNode(root.right, l, h);
    } else {
      return getCountOfNode(root.left, l, h);
    }

  }


}
