package leecode;

import java.util.ArrayDeque;
import java.util.Deque;

public class LC_1161 {
    /**
     * Finds the level with the maximum sum in a binary tree.
     * Uses BFS (level-order traversal) to calculate sum for each level.
     *
     * @param root The root node of the binary tree
     * @return The level number (1-indexed) with the maximum sum
     */
    public int maxLevelSum(TreeNode root) {
        // Queue for BFS traversal
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        // track the maximum sum sofar
        int maxSum = Integer.MIN_VALUE;

        // current level number (1-indexed)
        int currentLevel = 0;

        // level with the maximum sum
        int resultLevel  = 0;

        // process each level
        while (!queue.isEmpty()) {
            currentLevel++;

            // calculate sum for the current level
            int levelSum = 0;
            int nodesInCurrentLevel = queue.size();

            // iterate through all nodes in the current level
            for (int i = 0; i < nodesInCurrentLevel; i++) {
                TreeNode currentNode = queue.pollFirst();
                levelSum += currentNode.val;

                // add child nodes to the queue for the next level
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            // update maximum sum and result level if needed
            if (levelSum > maxSum) {
                maxSum = levelSum;
                resultLevel = currentLevel;
            }
        }
        return resultLevel;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
