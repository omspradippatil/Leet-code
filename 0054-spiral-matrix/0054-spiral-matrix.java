class Solution {
    public List<Integer> spiralOrder(int[][] mat) {

        List<Integer> ans = new ArrayList<>();

        int srow = 0;
        int scol = 0;
        int erow = mat.length - 1;
        int ecol = mat[0].length - 1;

        while (srow <= erow && scol <= ecol) {

            // Top
            for (int j = scol; j <= ecol; j++) {
                ans.add(mat[srow][j]);
            }

            // Right
            for (int i = srow + 1; i <= erow; i++) {
                ans.add(mat[i][ecol]);
            }

            // Bottom
            if (srow != erow) {
                for (int j = ecol - 1; j >= scol; j--) {
                    ans.add(mat[erow][j]);
                }
            }

            // Left
            if (scol != ecol) {
                for (int i = erow - 1; i >= srow + 1; i--) {
                    ans.add(mat[i][scol]);
                }
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }

        return ans;
    }
}