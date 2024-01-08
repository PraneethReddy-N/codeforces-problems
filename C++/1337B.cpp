#include "bits/stdc++.h"

using namespace std;

int absorption(int val){
    val = (val/2) + 10;
    return val;
}

int lightningStrikes(int strike){
    strike -= 10;
    return strike;
}


int main(){

    int t;
    cin >> t;
    while(t--){
        int x,n,m;
        cin >> x >> n >> m;
        bool can = false;
        while(!can || (n ==0 && m == 0) ){
            if(x <= 0 ){
                    can = true;
                }
            if(x <= m * 10 && m > 0){
                x = lightningStrikes(x);
                m--;
            }
            else if (x >= m * 10 && n > 0)
            {
                x = absorption(x);
                n--;
            } else{
                break;
            } 
        }
        if(can){
            cout << "Yes" << endl;
        }else{
            cout << "No" << endl;
        }

    }
    return 0;
}