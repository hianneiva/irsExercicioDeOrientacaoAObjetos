package exercicio1;

public class NumeroComplexo extends NumeroReal {

	float b;
	
	public NumeroComplexo(float a, float b) {
		super(a);
		this.b = b;
	}
	
	public NumeroComplexo soma(NumeroComplexo n){
		return new NumeroComplexo((this.a + n.a), (this.b + n.b));
	}
	
	public String toString(){
		return new StringBuilder().append(this.a).append("+").append(this.b).append("i").toString();
	}
	
	public static void main(String[] args) {
		
		NumeroComplexo num1 = new NumeroComplexo(1, 2), num2 = new NumeroComplexo(4, 5);
		NumeroComplexo resultado;
		
		resultado = num1.soma(num2);
		
		System.out.println(num1.toString() + " + " + num2.toString() + " = " + resultado.toString());
		
	}

}
