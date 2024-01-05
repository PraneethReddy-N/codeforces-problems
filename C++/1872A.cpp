#include "bits/stdc++.h"

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        double count = 0;
         double a,b,c;
        cin >> a >> b >>c;
        if(a == b){
            cout << "0" << endl;
            continue;
        }
        else{
            count = ( a + b )/2;
            if(a < b){
                count = (count - a)/c;
            }else {
                count = (count - b)/c;
            }
        }
        cout << ceil(abs(count)) <<endl;

    }
    return 0;
}