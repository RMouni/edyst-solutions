public static int Met(int n)
{
  int i,a=0;
  for(i=0;i<2;i++)
  {
    a = a*10;
    a = a+n%10;
    n=n/10;
  }
  return a;
}
  