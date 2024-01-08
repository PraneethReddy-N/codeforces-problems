#include "bits/stdc++.h"

using namespace std;

int main(){
    int t;
    cin >> t;
    while(t--){
        int n,m;
        cin >> n >> m;
        int arr[n][m];
        int rowcount =0;int colCount = 0;
        int columnonly =0;
        for(int i = 0;i<n;i++){
            bool allzeros = true;
            for(int j = 0; j<m;j++){
                cin >> arr[i][j];
            }   
        }
          for(int i = 0;i<n;i++){
            bool allzeros = true;
            for(int j = 0; j<m;j++){
                if(arr[i][j] != 0){
                    allzeros = false;
                    break;
                }  
            }
            if(allzeros){
                colCount++;
            }
             
        }
          for(int j = 0;j<m;j++){
            bool allzerosRow = true;
            for(int i = 0; i<n;i++){
                if(arr[i][j] != 0){
                    allzerosRow = false;
                    break;
                }
            }
             if(allzerosRow){
                rowcount++;
            }
        }

        int result = min(rowcount,colCount);
        if(result % 2 == 0){
            cout << "Vivek"<<endl; 
        }else{
            cout << "Ashish" << endl;
        }
    }

    return 0;
}