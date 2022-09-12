#include <bits/stdc++.h>
  using namespace std;
  
  int fibonacci(int n)
  {
     if(n==0)
   return 0;
    
    if(n==1)
   return 1;
  
    return (fibonacci(n-1)+fibonacci(n-2));
    
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
    
int result=fibonacci(n);
cout<<result<<endl;
    t--;
  }
  
    return 0;
  }
