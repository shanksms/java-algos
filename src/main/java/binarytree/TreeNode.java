package binarytree;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TreeNode<T> {

    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

}
