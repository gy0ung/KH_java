package operator03;

public class Operator01 {

	public static void main(String[] args) {
		// 1. 단항 연산자 : 항이 1개인 연산자 / 음수표시, ++, -- 89, 67, -78
		// 2. 이항 연산자 : 항이 2개인 연산자 / 2 + 3
		// 3. 삼항 연산자 : 항이 3개인 연산자 / 10 == 5 ? 1 : 0
		//                                  1     2   3
		// 4. 대입 연산자 :              / int i = 10;
		
		
		int i1 = 10;
		i1++; // ++i1 : i1의 값을 하나 증가시키시오. i1 = 11이 됨.
		System.out.println(i1);
		++i1; //
		System.out.println(i1);
		
		--i1; // 
		System.out.println(i1);		
		i1--; // ++i1 : i1의 값을 하나 감소시키시오. i1 = 11이 됨.
		System.out.println(i1);
		--i1; // 
		System.out.println(i1);
		System.out.println("========");
		
		i1 = 10;
		int i2 = 10;
		int result = ++i1 + ++i2; // 변수에 앞에 붙으면 ++가 우선적으로 반영됨.
		System.out.println(result);
		System.out.println("========");
		
		// 하기의 식은 동일하다.
		// 대입은 오른쪽에서 왼쪽순으로 진행 10 → i2 대입 / i2(10) → i1 대입 / i1(10)	
		i1 = 10;
		i2 = 10;
		i1 = i2 = 10;
		
		result = i1++ + i2++; // 변수 뒤에 붙으면 ++의 우선순위가 마지막으로 반영되어 연산 + 가 먼저 반영됨.
		System.out.println(result);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("========");
/*    1.    20   =  10  +  10 		우선순위로 연산먼저 반영
      2.    20   =  11  +  11       그 다음 마지막으로 ++ 반영
		result = 20이 됨.  */
		
		i1 = i2 = 10;
		result = i1++ + ++i2;
		System.out.println(result);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("========");
/*	1.	  21   =  10  +  11
 *  2.    21   =  11  +  11
 */
		i1 = i2 = 10;
		result = --i1 + i2--;
		System.out.println(result);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("========");
		
		i1 = i2 = 10;
		result = ++i1 + i2--;
		System.out.println(result);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("========");
		
		int n1, n2, n3; 
		int t1 = 10, t2 = 20, t3 = 30; 
		n1 = n2 = n3 = 10;
		
		result = ++n1 + n2-- - --n3;
//		   12  =  11  +  10  -  9    // result = 12 / n1 = 11 / n2 = 9 / n3 = 9
		System.out.println(result);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("========");
		
		result = n1++ * ++n2 + n3++;
//		  119  =  11  *  10  +  9    // result = 119 / n1 = 12 / n2 = 10 / n3 = 10
		System.out.println(result);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("========");
	
		n1 = n2 = n3 = 10;
		result = n1++ * ++n2 + n3++;
//		120    =  10  *  11  +  10  // result = 120 / n1 = 11 / n2 = 11 / m3 = 11
		System.out.println(result);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println("========");
		
		n1 = n2 = n3 = 10; 
		System.out.println(++n1);
		System.out.println(n2);
		System.out.println(n2++); // ++이 변수 뒤에 오면, 우선순위가 가장 마지막이기때문에 출력 후 증가됨.
		System.out.println(n2);
		System.out.println("========");
		

		
	}

}
