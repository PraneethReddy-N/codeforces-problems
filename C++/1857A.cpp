#include "bits/stdc++.h"

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >> n;
        int oddcount = 0;
        int evencount = 0;
        for(int i = 0;i<n;i++){
            int val;
            cin >> val;
            if(val % 2 == 0){
                evencount += val;
            }else{
                oddcount += val;
            }
        }
        if(evencount % 2 ==0 && oddcount % 2 == 0){
            cout << "Yes" << endl;
        }else if(evencount % 2 != 0 && oddcount %2 != 0){
            cout << "Yes" << endl;
        }else{
            cout << "No" << endl;
        }

    }
    return 0;
}