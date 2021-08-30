package metodoNewton;

public class MetodoNewtonTest {

		public static void main(String[] args) {
			
			IFuncion f = new MetodoNewton() {
				
				@Override
				public double evaluador(double x) {
					return Math.sin(x);
				}
			};
			
			IFuncion df = new MetodoNewton() {
				
				@Override
				public double evaluador(double x) {
					return Math.cos(x);
				}
			};
			
			MainNewton newton = new MainNewton();
			
			for (int i = 1; i < 17; i++) {
				
				System.out.println("valor evaluado: PI/"+i+" =>"+newton.raiz(f, df, Math.PI/i, 1e-6, 100));
			}
			
			
			
			
			
		}
}
