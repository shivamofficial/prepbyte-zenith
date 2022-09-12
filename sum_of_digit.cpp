#include <bits/stdc++.h>
  using namespace std;
  
  int sum(int n)
  {
  if(n==0)
  return 0;
    
    return (n%10 +sum(n/10));
    
   
    
    
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
      
      int result=sum(n);
      cout<<result<<endl;
      t--;
    }
    
    return 0;
  }
