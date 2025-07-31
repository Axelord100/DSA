// First attempt to solve happy number
public boolean isHappy(int n) {
    if(n == 1 || n == 7)
        return true;

    if(n < 10)
        return false;

    List<Integer> list = new ArrayList<>();
    list.add(n);
    int sum = 0;

    while(n > 0) {
        int r = n % 10;
        sum += r * r;
        n = n / 10;
    }

    return happy(list, sum);
}

public boolean happy(List<Integer> list, int n) {
    if(n == 1 || n == 7)
        return true;
    if(n < 10)
        return false;
    if(list.contains(n) && n != 1)
        return false;
    System.out.println(n);
    list.add(n);
    int sum = 0;

    while(n > 0) {
        int r = n % 10;
        sum += r * r;
        n = n / 10;
    }

    return happy(list, sum);
}
