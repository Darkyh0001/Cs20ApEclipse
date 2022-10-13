public class ParalllelArrays 
{
	public static void main(String[] args) 
	{
		String[] wingColor = {" red"," orange"," purple"," blue"," green"," yellow"," light blue"," upstairs red"," upstairs orange"," upstairs purple"," upstairs blue"," upstairs green"," upstairs yellow"," upstairs light blue"};
		String[] wingNum = {"1400 Wing","1500 Wing","1300 Wing","1200 Wing","1000 Wing","1100 Wing","1500 Wing","2400 Wing","2500 Wing","2300 Wing","2200 Wing","2000 Wing","2100 Wing","2600 Wing" };
//		System.out.println("This program is to find what room number each wing color contains.");
//		System.out.println("For Upstairs floors add up before the wing color. Example up + red = up red");
		for(int i=0; i < wingColor.length;i++) {
			System.out.println(wingNum[i] + " is the" + wingColor[i]+" wing")  ;
			
		}
		for(int i=0; i < wingNum.length;i++) {
			
		}
		
		
	}

}
