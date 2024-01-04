#include "bits/stdc++.h"

using namespace std;

int main() {
    int t;
    int n,k;
    cin >> t;
    while(t--){
        cin >> n >> k;
            vector<int> prob(n);
            for(int i = 0; i < n;i++){
                prob[i] = n-i;
            }
            reverse(prob.end()-k-1,prob.end());
            for(int i = 0;i<prob.size();i++){
                cout << prob[i] << " ";
            }
        cout << endl;
    }
    return 0;
}