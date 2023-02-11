import java.util.Scanner;

class UnionFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        UnionFind uf = new UnionFind(n + 1);

        int count = 0;
        for (int i = 0; i < M; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            if (uf.same(a, b)) {
                // 接続アリ > 木構造の深さ+1
                count++;
            } else {
                // 接続なし > 接続
                uf.unite(a, b);
            }

        }

        System.out.println(count);
        sc.close();
    }
}

/**
 * UnionFindのクラス
 */
class UnionFind {
    int n;
    int par[];

    /**
     * 根付き木を利用したデータ構造
     * 効率的なグループ管理を行う
     * 各クエリに対して高速に応答する
     * 
     * @param _n
     */
    UnionFind(int _n) {
        n = _n;
        par = new int[n];

        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    /**
     * 同接続の存在
     * 
     * @param v  接続開始点
     * @param nv 接続終端点
     * @return 接続有無
     */
    boolean same(int v, int nv) {
        return root(v) == root(nv);
    }

    /**
     * 接続経路
     * 
     * @param v 接続点
     * @return 接続
     */
    int root(int v) {
        if (par[v] != v) {
            par[v] = root(par[v]);
        }
        return par[v];
    }

    /**
     * 接続
     * 
     * @param _v  接続点1
     * @param _nv 接続点2
     * @return 接続
     */
    int unite(int _v, int _nv) {
        int v = root(_v);
        int nv = root(_nv);

        par[nv] = v;
        return v;
    }
}
