#include "bits/stdc++.h"

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        long long int n;
        cin >> n;
        bool Notsorted = false;
        vector<long long int> arr(n),arrCopy(n);
        for(int i = 0; i< n;i++){
            cin >> arr[i];
            arrCopy[i] = arr[i];
        }
        sort(arrCopy.begin(), arrCopy.end());

        for(int i = 0; i< n; i++){
            if((arr[i] %2) != (arrCopy[i]%2)){
                Notsorted = true;
                cout << "No" <<endl;
                break;
            }
        }
        if(!Notsorted){
            cout << "Yes" <<endl;
        }
    }
    return 0;
}