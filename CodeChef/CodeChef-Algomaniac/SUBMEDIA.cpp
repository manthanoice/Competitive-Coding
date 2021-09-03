#include<bits/stdc++.h>
#define ll long long
#define ff first
#define ss second
#define ld long double
#define pb push_back
#define pii pair<ll, ll>
#define vi vector<ll>
#define mp make_pair
#define ms1(dp) memset(dp, -1, sizeof(dp));
#define ms0(dp) memset(dp, 0, sizeof(dp));
#define minheap int, vector<int>, greater<int>
#define setbits(x) __builtin_popcountll(x) //count number of 1
#define zrobits(x) __builitin_ctzll(x)     //count number of zero before 1st 1 ex- (110000)2 ->4
#define MOD 1000000007
#define INF 1e18
#define ps(x, y) fixed << setprecision(y) << x
#define ALL(x) x.begin(), x.end()
using namespace std;
int main(){
    int t;
    cin>>t;
    while(t-->0){
        int n,k;
        cin>>n>>k;
        int p = 0;
        int ele = 0;
        vector<pair<int,int>>v(n);
        int x = k/2;
        for(int i=0; i<n; i++){
            cin>>v[i].ff;
            v[i].ss = i;
        }
        sort(v.begin(), v.end(), greater<>());
        vector<ll>v2(n);
        for(int i=0; i<x;i++){
            p = v[i].ss;
            ele = v[i].ff;
            v2[p] = ele;
        }
        p = v[x].ss;
        ele = v[x].ff;
        v2[p] = ele;
        for(int i=x; i<k; i++){
            p = v[i].ss;
            ele = v[i].ff;
            v2[p] = ele;
        }
        cout<<v[x].ff<<endl;
        for(int i=0; i<n; i++){
           if(v2[i]!=0)
                cout<<v2[i]<<" ";
        }
    }
}
