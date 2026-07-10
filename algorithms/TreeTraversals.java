class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}

void inorder(TreeNode r, List<Integer> out) {
    if (r == null) return;
    inorder(r.left, out);
    out.add(r.val);
    inorder(r.right, out);
}

void preorder(TreeNode r, List<Integer> out) {
    if (r == null) return;
    out.add(r.val);
    preorder(r.left, out);
    preorder(r.right, out);
}

void postorder(TreeNode r, List<Integer> out) {
    if (r == null) return;
    postorder(r.left, out);
    postorder(r.right, out);
    out.add(r.val);
}

void levelOrder(TreeNode r, List<List<Integer>> out) {
    if (r == null) return;
    Queue<TreeNode> q = new LinkedList<>();
    q.offer(r);
    while (!q.isEmpty()) {
        int sz = q.size();
        List<Integer> lvl = new ArrayList<>();
        for (int i = 0; i < sz; i++) {
            TreeNode cur = q.poll();
            lvl.add(cur.val);
            if (cur.left != null) q.offer(cur.left);
            if (cur.right != null) q.offer(cur.right);
        }
        out.add(lvl);
    }
}
