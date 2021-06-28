package dept;

class Cart {
	int count; //수량
	int total; //합계
	Goods goods;

	Cart() {
		
	}
	Cart(Goods goods,int count) {
		this.goods = goods;
		this.count = count;
		this.total = (int)(goods.iprice * count); // 합계 = 상품의단가 * 수량
	}
	
	public int getCount() {
		return count;
	}
	
	public Goods getGoods() {
		return goods;
	}
	
	// 장바구니 출력할 메서드
	public String toString() {
		return goods.icode + "\t"+ goods.iname + "\t" +goods.iprice+"\t" + getCount() + "\t" ;
		
	}
}
