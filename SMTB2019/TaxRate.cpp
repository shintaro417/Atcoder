#include <iostream>
using namespace std;
int main(void){
    // Your code here!
    int n;
    cin >> n;
    
    for(int i = 0;i <= n;i++){
        if((int)(i * 1.08) == n){
            cout << i << endl;
            return 0;
        }
    }
    
    cout << ":(" << endl;
}
