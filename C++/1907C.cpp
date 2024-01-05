#include "bits/stdc++.h"

using namespace std;

int main(){
    int t;
    cin >> t;
    long long int n;
    string s;
    while(t--){
        cin >> n;
        cin >> s;
        long long int start = 0;
        while(!s.empty() && s.size() > 1){
            bool erase = false;
            for(int i = 0; i<s.size()-1;){
                if(s[i] != s[i+1] ){
                    s.erase(i,2);
                    erase = true;
                    break;
                }
                else{
                    ++i;
                }
            }
            if(!erase){
                break;
            }
        }
        cout << s.size() << endl;
    }
    return 0;
}