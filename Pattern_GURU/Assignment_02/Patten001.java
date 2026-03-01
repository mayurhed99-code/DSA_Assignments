class Patter001{
	public static void main(String[] args){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5;j++){
				if((2<=i && i<=3) && (2<=j && j<=4)){
					System.out.print("  ");
				}else{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}

// hollow rectangle pattern