package binarytree;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TreeNode<T> {

    public T data;
    public TreeNode<T> left;
    public TreeNode<T> right;
    public TreeNode(T data) {
        this.data = data;
    }
}
