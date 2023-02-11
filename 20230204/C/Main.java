import java.util.Scanner;

class Main {
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
                count++;
            } else {
                uf.unite(a, b);
            }

        }

        System.out.println(count);
        sc.close();
    }
}

class UnionFind {
    int n;
    int par[];

    UnionFind(int _n) {
        n = _n;
        par = new int[n];

        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    boolean same(int v, int nv) {
        return root(v) == root(nv);
    }

    int root(int v) {
        if (par[v] != v) {
            par[v] = root(par[v]);
        }
        return par[v];
    }

    int unite(int _v, int _nv) {
        int v = root(_v);
        int nv = root(_nv);

        par[nv] = v;
        return v;
    }
}
