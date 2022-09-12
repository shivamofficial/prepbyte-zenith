#include <bits/stdc++.h>
  using namespace std;
  
  long long factorial(int n)
  {
     if (n == 0 || n == 1) return 1;
    
    return n*factorial(n-1);
  }
  int main()
  {
    //write your code here
  int t;
  cin>>t;
  while(t>0)
  {
    
    int n;
    cin>>n;
long long result=factorial(n);
    cout<<result<<endl;
    t--;
  }
    
    return 0;
  }
