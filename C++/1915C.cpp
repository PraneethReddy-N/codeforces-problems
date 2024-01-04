#include "bits/stdc++.h"

using namespace std;

int main() {
    int t;
    cin >> t;
    long long int sum = 0;
    long long int n,val;
    while(t--){
        cin >> n;
        for(int i =0;i<n;i++){
            cin >> val;
            sum +=val;
        }
    double sqrtVal = sqrt(sum);
    long long int root = (int)sqrtVal;
    if(root * root == sum){
        cout << "Yes";
        cout << endl;
    }else{
        cout<< "No";
        cout << endl;
    }
    sum = 0;
    }
    return 0;
}