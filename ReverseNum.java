class ReverseNum {
    public int reverse(int x) {
        long rev_num = 0;
        int a = Math.abs(x);
    while(a > 0){
        rev_num = rev_num*10 + a % 10;
        a = a/10;
    }
      
         if(rev_num < Integer.MIN_VALUE || rev_num > Integer.MAX_VALUE)
            return 0;
          else if(x < 0)
            return -(int)rev_num;
        else
            return (int)rev_num;
    }
}
