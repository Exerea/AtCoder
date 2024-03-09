// 使う物一覧
#include <iostream>
#include <vector>
#include <algorithm>

// 好みが分かれるstd省略
using namespace std;

// 型エイリアスの別名宣言
using ll = long long;

#define rep(i, n) for (int i = 0; i < (n); ++i)
void chmax(ll &x, ll y)
{
    x = max(x, y);
}

int main()
{

    // 入力
    int n;
    cin >> n;

    // 初期化と格納
    vector<int> x(n), y(n);
    rep(i, n) cin >> x[i] >> y[i];

    const ll INF = 1e18;
    vector<vector<ll>> dp(n + 1, vector<ll>(2, -INF));

    // 漸化式 開始用初期化 : １つもクッキーを食べない = 価値 0
    dp[0][0] = 0;

    // 動的計画法の処理
    rep(i, n)
    {

        // 解毒・毒問わず、食べない
        chmax(dp[i + 1][0], dp[i][0]);
        chmax(dp[i + 1][1], dp[i][1]);

        // x[i]=0 :  解毒入りクッキー
        if (x[i] == 0)
        {
            chmax(dp[i + 1][0], dp[i][0] + y[i]);
            chmax(dp[i + 1][0], dp[i][1] + y[i]);
        }
        // 毒入りクッキー
        else
        {

            chmax(dp[i + 1][1], dp[i][0] + y[i]);
        }
    }

    // 結果出力
    ll ans = max(dp[n][0], dp[n][1]);
    cout << ans << endl;
    return 0;
}