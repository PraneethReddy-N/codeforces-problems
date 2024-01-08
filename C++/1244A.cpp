#include "bits/stdc++.h"

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int a,b,c,d,k;
        cin >> a >> b >> c >> d >> k;

        int no_of_pens = 0;
        int no_of_pencil = 0;
        while(a > 0){
            a -= c;
            no_of_pens++;
        }
        while(b > 0){
            b -= d;
            no_of_pencil++;
        }

        if(no_of_pens + no_of_pencil <= k){
            cout << no_of_pens << " " << no_of_pencil << endl;
          
        }else if(no_of_pens + no_of_pencil > k){
            cout << "-1" << endl;
            
        }
    }
    return 0;
}