package practise0306_1;

public class Solution01 {
    public int Solution01(int num1, int num2) {
    int answer = 0;
    if(0<=num1 && num1<=100 && 0<=num2 && num2<=100) {
        if(num1 == num2) {
            answer = 1;
        }else {
            answer = -1;
        }
    }
    return answer;
    }
}
