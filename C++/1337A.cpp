/*
To determine whether three given lengths can form a triangle, you can use the Triangle Inequality Theorem. 
This theorem states that the sum of the lengths of any two sides of a triangle must be greater than the length of the third side.

For three lengths, let's call them a, b, and c, they can form a triangle if and only if the following three conditions are all true:

a + b > c
b + c > a
a + c > b
If all three of these conditions are met, then the lengths can form a triangle. 
If any one of these conditions is not met, then a triangle cannot be formed with those lengths.
*/


#include "bits/stdc++.h"

using namespace std;

int main(){

    int t;
    cin >>t;
    while(t--){
    long long int a,b,c,d;
    cin >> a >> b >> c >> d;
    cout << b << " " << c << " " << c << endl;
    }
    return 0;
}