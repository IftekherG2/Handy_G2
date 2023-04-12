//BISMILLAH//
#include <bits/stdc++.h>
using namespace std;
#define IMG2 ios_base::sync_with_stdio(false);cin.tie(0);cout.tie(0);
#define ll long long int
#define endl '\n'

int comp1(vector<int>a, vector<int>b){
    return (a[1]) < (b[1]);
}

int main()
{
    vector<vector<int>>v = {{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
    cout<<v.size()<<endl;

    sort(v.begin(),v.end(),comp1);
    for(int i = 0; i < v.size(); i++){
        cout<<v[i][0]<<" "<<v[i][1]<<endl;
    }

    return 0;
}
