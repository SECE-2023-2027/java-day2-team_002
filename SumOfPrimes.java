void main(){
    int N = 1000;
    boolean isprime[] = new boolean[N+1];
    Arrays.fill(isprime, true);

    isprime[0] = false;
    isprime[1] = false;

    for(int i=2;i*i<=N;i++){
        if(isprime[i]){
            for(int j=i*i;j<=N;j+=i){
                isprime[j] = false;
            }
        }
    }

    int sum = 0;
    int i = 0;
    int cnt = 0;
    while(cnt < 100){
        if(isprime[i]){
            sum += i;
            cnt++;
        }
        i++;
    }

    System.out.println(sum);
}