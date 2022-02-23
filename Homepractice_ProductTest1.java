package com.kh.example.run;

import com.kh.example.model.vo.Product;

public class ProductTest1 {

	public static void main(String[] args) {
	
		
		
		//매개변수생성자를 이용하여 생성과 동시에 값으로 초기화하기
		Product p1 = new Product("ssnote9","갤럭시노트9","경기도 수원", 960000, 10.0);
        Product p2 = new Product("lgnote5","LG스마트폰5","경기도 평택", 780000, 0.7);
        Product p3 = new Product("ktsnote3","KT스마트폰3","서울시 강남", 250000, 0.3);
        
        //출력할때 information
        System.out.println(p1.information());
        System.out.println(p2.information());
        System.out.println(p3.information());
        System.out.println("===================================================");	
			
		//중간에 가격을 모두 120만원으로 변경, 부가세율도 모두 0.05로 변경
        p1.setPrice(1200000 );
        p2.setPrice(1200000 );
        p3.setPrice(1200000 );
        p1.setTax(0.05);
        p2.setTax(0.05);
        p3.setTax(0.05);

        //출력할때 information
        System.out.println(p1.information());
        System.out.println(p2.information());
        System.out.println(p3.information());
        System.out.println("===================================================");	
        
        //각 객체의 가격에 부가세율을 적용한 실제 가격을 계산해서 출력
        //실제 가격= 가격+ (가격*부가세율)
        //부가세 포함 가격= ( price+(price*tax));
        System.out.println("상품명 = "+p1.getProductName());
        System.out.println("부가세 포함가격 = "+(int)(p1.getPrice()+(p1.getPrice()*p1.getTax()))+ "원" );
        System.out.println("상품명 = "+p2.getProductName());
        System.out.println("부가세 포함가격 ="+(int)(p2.getPrice()+ (p2.getPrice()*p2.getTax()))+"원" );
        System.out.println("상품명 = "+p3.getProductName());
        System.out.println("부가세 포함가격 ="+(int)(p3.getPrice()+ (p3.getPrice()*p3.getTax()))+"원" );
        	
        	
        	
        	
        }
        
        

		
		
}
		
		

	


