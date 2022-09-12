#include <bits/stdc++.h>
  using namespace std;
  
  int gcd(int N,int P)
  {
     if(N==P)
    return N;
     // Everything divides 0
     
    if(N==0)
    return P;
    if(P==0)
    return N;
     // base case
    if(N==P)
    return N;
     // N is greater P
    if(N>P)
    return gcd(N-P,P);
    return gcd(N,P-N);
    
  }
  int main()
  {
    //write your code here
    int T;
    cin>>T;
    while(T>0)
    {
      int N,P;
      cin>>N>>P;
     
      int result=gcd(N,P);
      cout<<result<<endl;
      T--;
    }
    return 0;
  }
