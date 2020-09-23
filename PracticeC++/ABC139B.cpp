#include <iostream>
using namespace std;
int main(void){
    // Your code here!
    int a,b;
    cin >> a >> b;
    
    int total = 1;
    int ans = 0;
    
    while(total < b){
        total += a - 1;
        ans++;
    }
    
    cout << ans << endl;
}
