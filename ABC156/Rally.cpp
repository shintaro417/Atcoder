#include <bits/stdc++.h>
using namespace std;
int main(void){
    // Your code here!
    int n;
    cin >> n;
    vector<int> x(n);
    for(int i = 0;i < n;i++){
        cin >> x.at(i);
    }
    
    int ans = 1000000;
    
    sort(x.begin(),x.end());
    
    for(int i = x.at(0); i <= x.at(x.size() - 1);i++){
        int num = 0;
        for(int j = 0;j < n;j++){
            num += pow(x.at(j) - i,2);
        }
        ans = min(ans,num);
    }
    cout << ans << endl;
    
    
}
